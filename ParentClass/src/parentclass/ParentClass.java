
package parentclass;


public class ParentClass {

    
    public static void main(String[] args) {
        ParClass dispparentclass = new ParClass();
    Childclass dispchildclass = new Childclass();
    //method to print the parent class using the object of the parent
   dispparentclass.parentmethod();
   //method to print the child class using the object of the child
   dispchildclass.childmethod();
   //method to print the parent class using the object of the child
    dispchildclass.parentmethod();
    }
    
}
