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
public class HrApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("HR APP Starts");
      
        //Department code
        
        Department dept1 = new Department("TransUnion");
        System.out.println(dept1);
               
       Employee emp = new Employee(100, "Sheena" , 75000);
       Employee emp2 = new Employee (101,"sheena2", 85000);
       dept1.addEmployee(emp);
       System.out.println(dept1);
       dept1.addEmployee(emp2);
       System.out.println(dept1);
       
       dept1.printEmployees();
       
       double total1 = dept1.totalSalary();
      // `totalSalary = total;
       System.out.println(total1);
       
       double avgSal = dept1.getAvgSalary();
       System.out.println(avgSal);
       
               
               
       Employee emp3 = new Employee (102,"sheena3", 85000);
       Employee emp4 = new Employee (103,"sheena4", 85000);
       Employee emp5 = new Employee (104,"sheena5", 85000);
       Employee emp6 = new Employee (105,"sheena6", 85000);
       Employee emp7 = new Employee (106,"sheena7", 85000);
       Employee emp8 = new Employee (107,"sheena8", 85000);
       Employee emp9 = new Employee (108,"sheena9", 85000);
       Employee emp10 = new Employee (109,"sheena10", 85000);
       
           
        System.out.println(emp);
        //System.out.println(emp1);
     /*   System.out.println(emp2);
        System.out.println(emp3);
        System.out.println(emp4);
        System.out.println(emp5);
        System.out.println(emp6);
        System.out.println(emp7);
        System.out.println(emp8);
        System.out.println(emp9);
        System.out.println(emp10);*/
        
    }

}
