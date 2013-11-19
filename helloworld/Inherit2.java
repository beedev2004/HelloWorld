public class Inherit2 extends Inherit1 {

     public Inherit2() {

            y = 4;
            System.out.println(y);
     }

  public static void main(String[] args) {

         Inherit2 in = new Inherit2();
    }
}

class Inherit1 {
         int y;

  public Inherit1() {

 	   y = 2;

           System.out.println(y);
       }
}