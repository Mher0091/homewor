package service;

import model.Student;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileService {

    public static String[] readLines(String url) throws Exception {
        String[] strings = Files.readAllLines(Paths.get(url)).toArray(new String[0]);
        return strings;
    }

    public static void write(Student[] array) throws Exception {
        for (int i = 0; i < array.length; i++) {
            String information = array[i].toString();
            Files.write(Paths.get(array[i].getName() + ".txt"), information.getBytes(), StandardOpenOption.CREATE);

        }

    }
}