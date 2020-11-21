package br.com.javathreads.textualseaching;

public class SearchingName {

    public static void main(String[] args) {
//        String name = "da";
        String name = "(Dan|Chad)(\\s|\\w)*";

        Thread thread1 = new Thread(new TaskTextualSearch("src/main/resources/assinaturas1.txt", name));
        Thread thread2 = new Thread(new TaskTextualSearch("src/main/resources/assinaturas2.txt", name));
        Thread thread3 = new Thread(new TaskTextualSearch("src/main/resources/autores.txt", name));

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
