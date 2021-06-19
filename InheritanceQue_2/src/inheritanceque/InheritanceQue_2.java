
package inheritanceque;


public class InheritanceQue_2 {

      public static void main(String[] args) {
     
    Employee emp = new Employee();
    emp.name = "Gmagnel Talang Emmanuel";
   emp.age = 23;
    emp.number = "0245342295/0205542309";
    emp.address = "P. O. Box 11, Yeji B/E";
    emp.salary = 250.541;
    emp.specialization = "Java prorammer";
  
    Manager mg = new Manager();
    mg.name = "Gmagnel Talang Emmanuel";
    mg.age = 41;
   mg.number = "0205542309";
    mg.address = "P. O. Box 14, Madina";
    mg.salary = 507.3301;
   mg.department= "IT Department";
   System.out.println("=======Employee's inforation=======");
   System.out.println("-----------------------------------");
   System.out.println(" Name: " + emp.name + "\n Age: " + emp.age + "\n Telephone Number: " + emp.number + "\n Address: " + emp.address + "\n Salary: GH&" + emp.salary +"\n Speciliztion: " + emp.specialization +"\n" );
    // System.out.println("=======================================:");
   System.out.println("=======Manager's inforation=======" );
   System.out.println("----------------------------------");
   System.out.println(" Name: " + mg.name + "\n Age: " + mg.age + "\n Telephone Number: " + mg.number + "\n Address: " + mg.address + "\n Salary: GH&" + mg.salary +"\n Department: " + mg.department );
   
  }

    }
    

