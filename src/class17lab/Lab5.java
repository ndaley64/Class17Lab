package class17lab;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author ndaley
 */
public class Lab5 {
    
    public static void main(String[] args) {
        Employee emp1 = new Employee("Bond", "James", "007-07-0007");
        Employee emp2 = new Employee("Doe", "John", "123-12-1234");
        Employee emp3 = new Employee("Bond", "James", "007-07-0007");
        Employee emp4 = new Employee("Love", "Kim", "321-21-4321");
        
        List<String> keyList = new ArrayList<String>();
        
        keyList.add(emp1.getSsn());
        keyList.add(emp2.getSsn());
        keyList.add(emp3.getSsn());
        keyList.add(emp4.getSsn());
        
//        Set<String> keySet = new HashSet<String>();
//        keyList.clear();
//        keyList.addAll(keySet);
        
        Map<String, Employee> employeeMap = new HashMap<String, Employee>();
        
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
        System.out.println("Entire map output with for each: ");
        
        for(String s : keyList){
            System.out.println(employeeMap.get(s).toString());
        }
    }
}
