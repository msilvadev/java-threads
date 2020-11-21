package br.com.javathreads.collectionsthreadsafe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class ConsumerMylist {

    public static void main(String[] args) throws InterruptedException {
        List<String> list = new ArrayList<>(); // Not is synchronized List, not is thread-safe
        List<String> listThreadSafe = Collections.synchronizedList(new ArrayList<String>());
        List<String> vectorThreadSafe = new Vector<String>(); // Vector is a List, but is synchronized. Is thread-safe

        for (int i = 0; i < 10; i++) {
            new Thread(new TaskAddElement(listThreadSafe, i)).start();
        }

        Thread.sleep(2000);

        for (int i = 0; i < listThreadSafe.size(); i++) {
            System.out.println(i + " - " + listThreadSafe.get(i));
        }
    }
}
