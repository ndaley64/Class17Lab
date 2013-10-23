package class17lab;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ndaley
 */
public class Lab3 {
    
    public static void main(String[] args) {
        Employee emp1 = new Employee("Bond", "James", "007-07-0007");
        Employee emp2 = new Employee("Doe", "John", "123-12-1234");
        Employee emp3 = new Employee("Bond", "James", "007-07-0007");
        Employee emp4 = new Employee("Love", "Kim", "321-21-4321");
        
        List<Employee> employeeList = new ArrayList<Employee>();
        
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);
        
        System.out.println("Employee list size: " + employeeList.size());
        Employee copy = employeeList.get(1);
        
        System.out.println("");
        System.out.println("Employee at index 2: ");
        System.out.println(copy.toString());
        
        System.out.println("");
        System.out.println("Entire list output with for each: ");
        
        for(Employee e : employeeList){
            System.out.println(e.toString());
        }
    }
}
