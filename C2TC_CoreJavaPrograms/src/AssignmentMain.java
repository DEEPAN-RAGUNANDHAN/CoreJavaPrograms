import com.deepan.assignment.employees.*;
import com.deepan.assignment.utilities.EmployeeUtilities;
public class AssignmentMain {
    public static void main(String[] args) {
        Manager m = new Manager("Deepan", "M001", 85000, 5);
        Developer d = new Developer("Suba", "D002", 65000, "Java");

        System.out.println("Before Raise:");
        EmployeeUtilities.printEmployeeDetails(m);
        EmployeeUtilities.printEmployeeDetails(d);

        EmployeeUtilities.raiseSalary(m, 10);
        EmployeeUtilities.raiseSalary(d, 15);

        System.out.println("\nAfter Raise:");
        EmployeeUtilities.printEmployeeDetails(m);
        EmployeeUtilities.printEmployeeDetails(d);
    }
}
