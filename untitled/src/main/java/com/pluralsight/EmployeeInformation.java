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


