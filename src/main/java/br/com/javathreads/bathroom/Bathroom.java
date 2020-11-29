package br.com.javathreads.bathroom;

public class Bathroom {

    private boolean isDirty = true;

    public void doNumber1() {
        // This printing is performed in parallel because it is outside the synchronized block
        String name = Thread.currentThread().getName();
        System.out.println(name + " knocking on the door...");

        // Atomically executed, once and through one thread at a time
        synchronized (this) {
            System.out.println(name + " entering in bathroom");

            this.checkBathroom(name);

            System.out.println(name + " doing fast something");

            sleep(5000);

            this.isDirty = true;

            System.out.println(name + " washing the hands");
            System.out.println(name + " going out of the bathroom");
        }
    }

    public void doNumber2() {
        // This printing is performed in parallel because it is outside the synchronized block
        String name = Thread.currentThread().getName();
        System.out.println(name + " knocking on the door...");

        // Atomically executed, once and through one thread at a time
        synchronized (this) {
            System.out.println(name + " entering in bathroom");

            this.checkBathroom(name);

            System.out.println(name + " doing something time-consuming");

            sleep(10000);

            this.isDirty = true;

            System.out.println(name + " washing the hands");
            System.out.println(name + " going out of the bathroom");
        }
    }

    public void cleanBathroom() {
        String name = Thread.currentThread().getName();
        System.out.println(name + " knocking on the door...");

        synchronized (this) {
            System.out.println(name + " entering in bathroom");

            if(!isDirty){
                System.out.println("Bathroom already is clean!");
                return;
            }

            System.out.println(name + " cleaning bathroom...");

            sleep(13000);

            this.isDirty = false;
            this.notifyAll();

            System.out.println(name + " bathroom is clean!");
        }
    }

    private void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void checkBathroom(String name) {
        while (isDirty){
            System.out.println(name + " Bathroom is dirty o.o");
            try {
                this.wait();
            } catch (InterruptedException e) {
                System.out.println("checkBathroom " + e);
            }
        }
    }
}
