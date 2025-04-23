package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class PayrollCalcuatorApp {
    public static void main(String[] args) throws FileNotFoundException {
//        EmployeeInformation empInfo = new EmployeeInformation(employeeId, name, hoursWorked, payRate);
        try {
            Scanner input =new Scanner(System.in);
            FileReader fileReader = new FileReader("DataFiles\\employees.csv");
            BufferedReader bufReader = new BufferedReader(fileReader);

            bufReader.readLine();

            String data;

            while((data = bufReader.readLine()) != null){
                String[] payrollInfo = data.split("[|]");
                System.out.println(Arrays.toString(payrollInfo));


                String employeeId = payrollInfo[0];
                String employeeName = payrollInfo[1];
                float hoursWorked = Float.parseFloat(payrollInfo[2]);
                float payRate = Float.parseFloat(payrollInfo[3]);

                EmployeeInformation empInfo = new EmployeeInformation(payRate, hoursWorked, employeeName, employeeId);

                System.out.println();

//                System.out.println("what information would you like \nID \nHours Worked \nPayrate");
//                String userWants = input.nextLine();
//                if (userWants.equalsIgnoreCase("id")){
//                    System.out.println(empInfo.getEmployeeId());
//                }else if(userWants.equalsIgnoreCase("hours worked")){
//                    System.out.println(empInfo.getHoursWorked());
//                }else if (userWants.equalsIgnoreCase("payrate")){
//                    System.out.println(empInfo.getPayRate());
//                }
                System.out.println("would you like anything else?");
                String more = input.nextLine();
                if (more.equalsIgnoreCase("yes")){
                    continue;
                }else if(more.equalsIgnoreCase("no")){
                    System.out.println("thank you have a nice day");
                    break;
                }else{
                    System.out.println("invalid input. yes or no?");
                }
            }
            bufReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
//update to ask for name and id- (prompt for name and id instead)
//assign each person to a value?
//then calculate grosspay- create variable for formula
//then print "jane doe: ID-10: your gross pay is"