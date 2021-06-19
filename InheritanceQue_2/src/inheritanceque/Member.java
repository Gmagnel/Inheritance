
package inheritanceque;


public class Member {
     String name;
     int age;
    String number;
    String address;
   double salary;
        
  public void printSalary(){
    System.out.println(salary);
  }
}
class Employee extends Member{
  String specialization;
  
}

class Manager extends Member{
  String department;
}




