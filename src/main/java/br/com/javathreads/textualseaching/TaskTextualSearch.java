package br.com.javathreads.textualseaching;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class TaskTextualSearch implements Runnable {

    private String fileName;
    private String nameToFind;

    public TaskTextualSearch(String fileName, String nameToFind) {
        this.fileName = fileName;
        this.nameToFind = nameToFind;
    }

    @Override
    public void run() {
        Path path = Paths.get(fileName);

        try (Stream<String> input = Files.lines(path)) {
            input.forEach(line -> {
                if (line.toUpperCase().contains(nameToFind.toUpperCase())) {
                    System.out.println("[" + Thread.currentThread().getName() + "]" + " | " + "File: " + path.getFileName() + " -> " + line);
                }
            });
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
