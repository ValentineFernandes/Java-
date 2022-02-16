import java.util.Scanner;  
public class SwappingValueUsingThirdOperator  
{  
  public static void main(String args[])  
  {  
    int a, b;  
    Scanner s = new Scanner(System.in);  
    System.out.print("Enter the first number: ");  
    a = s.nextInt();  
    System.out.print("Enter the second number: ");  
    b = s.nextInt();  
    System.out.println("Before swapping:");  
    System.out.println("a = " +a +", b = " +b);  
    a = a ^ b;  
    b = a ^ b;  
    a = a ^ b;  
    System.out.println("After swapping:");  
    System.out.print("a = " +a +", b = " +b);  
  }  
}  
