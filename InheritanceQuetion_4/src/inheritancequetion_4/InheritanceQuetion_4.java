
package inheritancequetion_4;


public class InheritanceQuetion_4 {

    
    public static void main(String[] args) {
     
    Rectangle rec = new Rectangle(4,5);
    rec.printArea();
    rec.printPerimeter();

    Square sqr = new Square(4);
    sqr.printArea();
    sqr.printPerimeter();

    Square[] a = new Square[10];
    int k = 5;
    for(int i = 0;i<10;i++){
      a[i] = new Square(k);
      k++;
    }

    for(int i = 0;i<10;i++){
      a[i].printArea();
      a[i].printPerimeter();
    }
  }
}			
    
    

