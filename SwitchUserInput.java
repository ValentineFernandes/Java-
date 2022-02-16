import java.util.*;
public class SwitchUserInput
{
   public static void main(String[] args)
   {
      int x;    
      Scanner s = new Scanner(System.in);
      System.out.print("Enter number : ");
      x = s.nextInt();
      switch (x)
      {
        case 1 :
         System.out.println("Sunday");
        break;
        case 2 :
         System.out.println("Monday");
        break;
        case 3 :
         System.out.println("Tuesday");
        break;
        case 4 :
         System.out.println("Wednesday");
        break;
        case 5 :
         System.out.println("Thursday");
        break;
        case 6 :
         System.out.println("Friday");
        break;
        case 7 :
         System.out.println("Saturday");
        break;
        default :
         System.out.println("Please enter number 1-7");
        break;
      }
   }
}          
