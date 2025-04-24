package com.pluralsight;

    public class Employee {
        private String employeeId;
        private String name;
        private float hoursWorked;
        private float payRate;

        // Constructor
        public Employee(String employeeId, String name, float hoursWorked, float payRate) {
            this.employeeId = employeeId;
            this.name = name;
            this.hoursWorked = hoursWorked;
            this.payRate = payRate;
        }

        // Getters and setters
        public String getEmployeeId() {
            return employeeId;
        }

        public String getName() {
            return name;
        }

        public float getHoursWorked() {
            return hoursWorked;
        }

        public float getPayRate() {
            return payRate;
        }

        public void setEmployeeId(String employeeId) {
            this.employeeId = employeeId;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setHoursWorked(float hoursWorked) {
            this.hoursWorked = hoursWorked;
        }

        public void setPayRate(float payRate) {
            this.payRate = payRate;
        }

        // Gross pay method
        public float getGrossPay() {
            return hoursWorked * payRate;
        }
    }


