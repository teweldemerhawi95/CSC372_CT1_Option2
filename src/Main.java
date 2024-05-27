public class Main {

    public static void main(String[] args) throws Exception {
        // Creates a manager object and uses all methods including inherited.
        Manager manager = new Manager();

        manager.setFirstName("John");
        manager.setLastName("Mcdonald");
        manager.setEmployeeID(7140931);
        manager.department = "Marketing";
        manager.salary = 145000;
        manager.employeeSummary();
    }
}
