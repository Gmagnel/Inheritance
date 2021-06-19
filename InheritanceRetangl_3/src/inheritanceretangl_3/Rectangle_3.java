
package inheritanceretangl_3;


public class Rectangle_3 {
   int len=4;
  int bre=5;


  public int Rectangle(int le,int br){
        len=le;
        bre=br;
        return le*br;
    }
  public void printArea(){
    System.out.println(len*bre);
  }

  public void printPerimeter(){
    System.out.println(2*(len+bre));
  }
}

    
    

