public class Manager extends Employee {

    String department;

    // Overrides Employee class's employeeSummary method to add department
    @Override
    public void employeeSummary() {
        System.out.println("\nName: " + firstName + " " + lastName + "\nID: " + employeeID + "\nSalary: $" + salary + "\nDepartment: " + department + "\n");
    }
}
