import java.util.*;
enum Level 
{
  LOW, MEDIUM, HIGH
};
public class Enum 
{
   public static void main(String[] args) 
   {
      Scanner s = new Scanner(System.in);
      System.out.print("Enter level : ");
      String l = s.next();
      Level lv = Level.valueOf(l.toUpperCase());
      switch (lv) 
      {
        case LOW:
            System.out.println("This is LOW level");
            break;
        case MEDIUM:
            System.out.println("This is MEDIUM level");
            break;
        case HIGH:
            System.out.println("This is HIGH level");
            break;
      }
   }
}
