package class17lab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 *
 * @author ndaley
 */
public class Lab7 {
    
    public static void main(String[] args) {
        Employee emp1 = new Employee("Bond", "James", "007-07-0007");
        Employee emp2 = new Employee("Doe", "John", "321-21-4321");
        Employee emp3 = new Employee("Bond", "James", "007-07-0007");
        Employee emp4 = new Employee("Love", "Kim", "123-12-1234");
        
        Set<Employee> employeeSet = new HashSet<Employee>();
        
        employeeSet.add(emp1);
        employeeSet.add(emp2);
        employeeSet.add(emp3);
        employeeSet.add(emp4);
        
        System.out.println("");
        System.out.println("Entire set output with for each(set is sorted by SSN): ");
        
        for(Iterator itr = employeeSet.iterator(); itr.hasNext();){
            System.out.println(itr.next().toString());
        }
        
        List<Employee> employeeList = new ArrayList<Employee>(employeeSet);
        Collections.sort(employeeList, new EmployeeLastNameSorter());
        
        System.out.println("");
        System.out.println("Sorted list from set, sorted with a Comparator(sorted by last name):");
        for(Employee e : employeeList){
            System.out.println(e.toString());
        }
        
    }
}
