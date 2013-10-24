package class17lab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author ndaley
 */
public class Lab6 {
    
    public static void main(String[] args) {
        Employee emp1 = new Employee("Bond", "James", "007-07-0007");
        Employee emp2 = new Employee("Doe", "John", "321-21-4321");
        Employee emp3 = new Employee("Bond", "James", "007-07-0007");
        Employee emp4 = new Employee("Love", "Kim", "123-12-1234");
        
        Map<String, Employee> employeeMap = new TreeMap<String, Employee>();
        
        employeeMap.put(emp1.getSsn(), emp1);
        employeeMap.put(emp2.getSsn(), emp2);
        employeeMap.put(emp3.getSsn(), emp3);
        employeeMap.put(emp4.getSsn(), emp4);
        
        System.out.println("Employee map size: " + employeeMap.size());
        Employee copy = (Employee)employeeMap.get("007-07-0007");
        
        System.out.println("");
        System.out.println("Employee at with ssn 007-07-0007: ");
        System.out.println(copy.toString());
        
        System.out.println("");
        System.out.println("Entire map output with for each(map is sorted by SSN): ");
        
        for(String s : employeeMap.keySet()){
            System.out.println(employeeMap.get(s).toString());
        }
        
        List<Employee> employeeList = new ArrayList<Employee>(employeeMap.values());
        Collections.sort(employeeList, new EmployeeLastNameSorter());
        
        System.out.println("");
        System.out.println("Sorted list from map values, sorted with a Comparator(sorted by last name):");
        for(Employee e : employeeList){
            System.out.println(e.toString());
        }
    }
}
