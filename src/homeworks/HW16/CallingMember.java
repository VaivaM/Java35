package homeworks.HW16;

public class CallingMember {
    public static void main(String[] args) {

        Employee employee = new Employee("Bob",45,"+37065022553", "Debreceno 25", 1000, "Worker");
        Manager manager = new Manager("Nick", 45, "+3704562351", "Street", 2000, "Sales");

        employee.printSalary();
        manager.printSalary();
    }
}
