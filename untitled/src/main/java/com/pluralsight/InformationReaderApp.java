package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class InformationReaderApp {
    public static void main(String[] args) {
        try {

            FileReader fileReader = new FileReader("DataFiles\\employees.csv");
            BufferedReader bufReader = new BufferedReader(fileReader);

            String input;

            while((input = bufReader.readLine()) != null){
                System.out.println(input);
            }
            bufReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
