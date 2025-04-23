package com.pluralsight;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileInputStream;

public class BedtimeStories {
    public static void main(String[] args) {
        String[] stories = {"goldilocks.txt",
                "hansel_and_gretel.txt",
                "mary_had_a_little_lamb.txt"
        };
        Scanner input = new Scanner(System.in);

        System.out.println("which story do you want to read? ");
        String readerSelection = input.nextLine();

        if (readerSelection.equalsIgnoreCase("mary had a little lamb")){
            System.out.println(stories[2]);
        }

//        System.out.println();
//        for (String story : stories) {
//            System.out.println("reading: " + story);

            try {
                FileInputStream fis = new FileInputStream(readerSelection);
                Scanner scanner = new Scanner(fis);

                String lyrics;
                while (scanner.hasNextLine()) {
                    lyrics = scanner.nextLine();
                    System.out.println(lyrics);
                }
                scanner.close();
            } catch (FileNotFoundException e) {
                System.out.println("file not found.");
//                throw new RuntimeException(e);
            }
        }
    }

//refactor to ask which story to tell
//add if statement
//