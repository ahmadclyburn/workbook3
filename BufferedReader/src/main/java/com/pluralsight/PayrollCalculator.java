package com.pluralsight;
import java.io.BufferedWriter;
import java.io.*;

public class PayrollCalculator {
        public static void main(String[] args) {
            String filePath = "DataFiles/employees.csv";

            try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                FileWriter fileWriter = new FileWriter(filePath);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                String line;

                line = reader.readLine();

                while ((line = reader.readLine()) != null) {
                    String[] tokens = line.split("\\|");

                    String employeeId = tokens[0];
                    String name = tokens[1];
                    float hoursWorked = Float.parseFloat(tokens[2]);
                    float payRate = Float.parseFloat(tokens[3]);

                    Employee employee = new Employee(employeeId, name, hoursWorked, payRate);

                    System.out.printf("ID: %s, Name: %s, Gross Pay: $%.2f%n",
                            employee.getEmployeeId(),
                            employee.getName(),
                            employee.getGrossPay());
                }

            }
            catch (IOException e) {
                System.out.println("Error reading file: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Invalid number format in file: " + e.getMessage());
            }


        }
}
