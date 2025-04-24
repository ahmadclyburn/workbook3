package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("DataStorage\\inventory.csv");
            BufferedReader bufReader = new BufferedReader(fileReader);
            ArrayList<Product> products = new ArrayList<>();

            String data;
            while ((data = bufReader.readLine()) != null) {
                 String[] productInfo = data.split("[|]");

                String itemId = productInfo[0];
                String item = productInfo[1];
                float price = Float.parseFloat(productInfo[2]);

                Product product = new Product(itemId, item, price);

                products.add(product);

            }
            for (Product p : products){
                System.out.printf("ID: %s, Item: %s, Price: $%.2f%n", p.getItemId(), p.getItem(), p.getPrice());
            }
            bufReader.close();
        }catch(FileNotFoundException e){
            throw new RuntimeException(e);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
