package br.com.javathreads.deadlock;

public class ConnectionlPool {

    public String getConnection() {

        System.out.println("Borrowing connection");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return "connection";
    }

}
