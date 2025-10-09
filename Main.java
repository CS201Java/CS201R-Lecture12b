
public class Main {

    public static void main(String[] args){
        System.out.println("Welcome to Geometry!");

      Circle c1 = new Circle(5);
      System.out.println("\n\nCircle 1: " + c1.toString());

      
      Circle[] allCs= {
        new Circle(7 ),
        new Circle(1 ),
        new Circle(19 ),
        new Circle(9 )};

      for (Circle c : allCs)
        System.out.println(c.toString());

      Rectangle r1 = new Rectangle(6, 8 );
      System.out.println("\n\nRectangle 1: " + r1.toString());

      Rectangle[] allRs= {
        new Rectangle(7, 34),
        new Rectangle(2,5),
        new Rectangle(15, 8),
        new Rectangle(3,15)};
      for (Rectangle r : allRs)
        System.out.println(r.toString());

      /*
      java.util.Arrays.sort(allCs);

      for (Circle c : allCs)
        System.out.println(c.toString());

      */
      /*
      java.util.Arrays.sort(allRs);

      for (Rectangle r : allRs)
        System.out.println(r.toString());
     */ 
    }    
}

