public class Employee {
    
    String firstName;
    String lastName;
    int employeeID;
    double salary;

    public Employee() {
        salary = 0;
    }

    // Getters and setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    // Prints employee information
    public void employeeSummary() {
        System.out.println("\nName: " + firstName + " " + lastName + "\nID: " + employeeID + "\nSalary: " + salary + "\n");
    }
}
