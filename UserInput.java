import java.util.*;
public class UserInput
{
   public static void main(String[] args)
   {
      int a;
      float b;
      char c;
      String d;    
      System.out.print("Enter the value of a : ");
      Scanner s = new Scanner(System.in);
      a = s.nextInt();
      System.out.print("Enter the value of b : ");
      b = s.nextInt();
      System.out.print("Enter the value of c : ");
      c = s.next().charAt(0);
      System.out.print("Enter the value of d : ");
      d = s.next();
      System.out.println("-------------------------");
      System.out.println("Value of a is: "+a);
      System.out.println("Value of a is: "+b);
      System.out.println("Value of a is: "+c);
      System.out.println("Value of a is: "+d);
   }
}
