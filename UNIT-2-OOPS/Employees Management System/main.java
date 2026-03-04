public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter employee name:");
        String name = sc.nextLine();

        System.out.println("Enter employee ID:");
        String id = sc.nextLine();

        System.out.println("Enter department:");
        String dept = sc.nextLine();

        System.out.println("Enter basic salary:");
        double basic = sc.nextDouble();

        System.out.println("Enter HRA:");
        double hra = sc.nextDouble();

        System.out.println("Enter DA:");
        double da = sc.nextDouble();

        Employee emp = new Employee(name, id, dept, basic, hra, da);

        
        System.out.println("\nEmployee Payroll Details:");
        System.out.println("Name: " + emp.getName());
        System.out.println("Employee ID: " + emp.getEmployeeId());
        System.out.println("Department: " + emp.getDepartment());
        System.out.printf("Basic Salary: %.2f\n", emp.getBasicSalary());
        System.out.printf("HRA: %.2f\n", emp.getHra());
        System.out.printf("DA: %.2f\n", emp.getDa());
        System.out.printf("Total Salary: %.2f\n", emp.getTotalSalary());
    }
}
