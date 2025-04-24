package com.pluralsight;

//import java.io.BufferedReader;
//import java.io.FileNotFoundException;
//import java.io.FileReader;

public class EmployeeInformation {
    private String employeeId;
    private String employeeName;
    private float hoursWorked;
    private float payRate;

//    FileReader newFileReader = new FileReader("DataFiles\\employees.csv");
//    BufferedReader newBufReader = new BufferedReader(newFileReader);
//
//    String data;

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public float getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(float hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public float getPayRate() {
        return payRate;
    }

    public void setPayRate(float payRate) {
        this.payRate = payRate;
    }
    public EmployeeInformation(float payRate, float hoursWorked, String employeeName, String employeeId) {
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
        this.employeeName = employeeName;
        this.employeeId = employeeId;
    }
    @Override
    public String toString() {
        return "EmployeeInformation:" +
                "employeeId:'" + employeeId +
                ", name: '" + employeeName +
                ", hoursWorked: " + hoursWorked +
                ", payRate: " + payRate;
    }
}





//                System.out.println("what information would you like \nID \nHours Worked \nPayrate \ncurrent gross pay");
//                String userWants = input.nextLine();
//                if (userWants.equalsIgnoreCase("id")){
//                    System.out.println(empInfo.getEmployeeId());
//                }else if(userWants.equalsIgnoreCase("hours worked")){
//                    System.out.println(empInfo.getHoursWorked());
//                }else if (userWants.equalsIgnoreCase("payrate")){
//                    System.out.println(empInfo.getPayRate());
//                }else if (userWants.equalsIgnoreCase("current gross pay")){
//                    System.out.println("your gross pay is: "+ grossPay);
//                }




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