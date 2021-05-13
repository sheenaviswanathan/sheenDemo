/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hrapp;

/**
 *
 * @author sheen
 */
public class Department {

    String deptName;
    Employee[] employees = new Employee[10];
    int empCount = 0;

    public Department(String deptName) {
        this.deptName = deptName;
    }

    public void addEmployee(Employee empl) {
        this.employees[empCount++] = empl;
        // empCount = empCount+1;
        // empCount++;
    }

    public void printEmployees() {
        /* for (Employee emp : employees) {
            
            System.out.println(emp);
        }*/

        for (int i = 0; i < empCount; i++) {

            System.out.println(employees[i]);
        }

    }

    public double totalSalary() {
        double total = 0;
        
        for (int i = 0; i < empCount; i++) {

            total = total + employees[i].getEmpSalary();
            
        }
        System.out.println("Total Salary:" + total);
        
       return total; 
       
    }
    
    
    public double getAvgSalary(){    
        double total = this.totalSalary();
        double avgSal;
        
//        for (int i = 0; i < empCount; i++) {
//            total = total + employees[i].getEmpSalary();
//        }
        
        avgSal = (total / empCount);
        System.out.println("Average Salary:" + avgSal);
        
        return avgSal;
        
    }
    
    
    @Override
    public String toString() {
        return "Department{" + "deptName=" + deptName + ", employees=" + empCount + '}';
    }

}
