package class17lab;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author ndaley
 */
public class Lab4 {
    
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
        
        Set<Employee> employeeSet = new HashSet<Employee>(employeeList);
        
        employeeList.clear();
        employeeList.addAll(employeeSet);
        
        System.out.println("Employee list size: " + employeeList.size());
        Employee copy = (Employee)employeeList.get(1);
        
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
