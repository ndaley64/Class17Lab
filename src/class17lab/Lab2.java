/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package class17lab;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ndaley
 */
public class Lab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Employee emp1 = new Employee("Bond", "James", "007-07-0007");
        Employee emp2 = new Employee("Doe", "John", "123-12-1234");
        Employee emp3 = new Employee("Bond", "James", "007-07-0007");
        Employee emp4 = new Employee("Love", "Kim", "321-21-4321");
        
        List employeeList = new ArrayList();
        
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);
        
        System.out.println("Employee list size: " + employeeList.size());
        Employee copy = (Employee)employeeList.get(1);
        
        System.out.println("");
        System.out.println("Employee at index 2: ");
        System.out.println(copy.toString());
        
        System.out.println("");
        System.out.println("Entire list output with old for loop: ");
        
        for(int i = 0; i < employeeList.size(); i++){
            System.out.println("Employee " + (i+1) + ": " + employeeList.get(i).toString());
        }
    }
}
