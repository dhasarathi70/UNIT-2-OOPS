import java.util.Scanner;

class Employee {
    private String name;
    private String employeeId;
    private String department;
    private double basicSalary;
    private double hra; 
    private double da;  

    
    public Employee(String name, String employeeId, String department, double basicSalary, double hra, double da) {
        this.name = name;
        this.employeeId = employeeId;
        this.department = department;
        this.basicSalary = basicSalary;
        this.hra = hra;
        this.da = da;
    }

    
    public String getName() {
        return name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getDepartment() {
        return department;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public double getHra() {
        return hra;
    }

    public double getDa() {
        return da;
    }

    
    public double getTotalSalary() {
        return basicSalary + hra + da;
    }
}
