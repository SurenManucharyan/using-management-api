package com.management.system.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

    public static String readFile(String filePath) {
        Scanner scanner = null;
        try {
            scanner = new Scanner( new File(filePath), "UTF-8" );
        } catch (FileNotFoundException e) {
            System.out.println("Problem read file: "+e.toString());
        }
        String text = scanner.useDelimiter("\\A").next();
        scanner.close();
        return text;
    }

}
