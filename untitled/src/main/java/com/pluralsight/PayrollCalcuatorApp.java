package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class PayrollCalcuatorApp {
    public static void main(String[] args){
        try {
            Scanner input =new Scanner(System.in);

            FileReader fileReader = new FileReader("DataFiles\\employees.csv");
            BufferedReader bufReader = new BufferedReader(fileReader);
            bufReader.readLine();

            String data;
//            boolean found = false;


            System.out.println("what information would you like \nID \nHours Worked \nPayrate \ngrosspay");
            String userWants = input.nextLine();

            while((data = bufReader.readLine()) != null){
                String[] payrollInfo = data.split("[|]");

                float payRate = Float.parseFloat(payrollInfo[3]);
                float hoursWorked = Float.parseFloat(payrollInfo[2]);
                String employeeName = payrollInfo[1];
                String employeeId = payrollInfo[0];

                EmployeeInformation empInfo = new EmployeeInformation(payRate, hoursWorked, employeeName, employeeId);

//                String name = "";
//                String id ="";

                if (userWants.equalsIgnoreCase("id")){
                    System.out.println("whats your name? ");
                    String empGivenInfo = input.nextLine();
                    if(empGivenInfo.equalsIgnoreCase(employeeName)){
                        System.out.println(empInfo.getEmployeeId());}

                }else if(userWants.equalsIgnoreCase("hours worked")){
                    System.out.println("whats your name? ");
                    String empGivenName = input.nextLine();
                    System.out.println("whats your ID?");
                    String empGivenId = input.nextLine();
                    if(empGivenName.equalsIgnoreCase(employeeName) && empGivenId.equalsIgnoreCase(employeeId)){
                        System.out.println(empInfo.getHoursWorked());}

                }else if (userWants.equalsIgnoreCase("payrate")) {
                    System.out.println("whats your name? ");
                    String empGivenName = input.nextLine();
                    System.out.println("Whats your ID?");
                    String empGivenId = input.nextLine();
                    if (empGivenName.equalsIgnoreCase(employeeName) && empGivenId.equalsIgnoreCase(employeeId)){
                        System.out.println(empInfo.getPayRate());}

                }else if(userWants.equalsIgnoreCase("grosspay")){
                    System.out.println("whats your name?");
                    String empGivenName = input.nextLine();
                    System.out.println("whats your ID?");
                    String empGivenId = input.nextLine();
                    if(empGivenName.equalsIgnoreCase(employeeName) && empGivenId.equalsIgnoreCase(employeeId)) {
                        float grossPay = hoursWorked * payRate;
                        System.out.println(employeeName + employeeId + ",your gross-pay is: " + grossPay);
//                        found = true;
                        break;
                    }
                }

//                System.out.println("would you like anything else?");
//                String more = input.nextLine();
//                if (more.equalsIgnoreCase("yes")){
//                    continue;
//                }else if(more.equalsIgnoreCase("no")){
//                    System.out.println("thank you have a nice day");
//                    break;
//                }else{
//                    System.out.println("invalid input. yes or no?");
//                }
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
//System.out.println(Arrays.toString(payrollInfo));