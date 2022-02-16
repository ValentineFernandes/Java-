public class Fibonacci
{
   public static void main(String[] args)
   {
      int a = 1, num = 15, num1 = 0, num2 = 1;
      System.out.print("First " + num + " fibonacci sequence: ");
      while(a <= num)
      {
         System.out.print(num1 + " , ");
         int total = num1 + num2;
         num1 = num2;
         num2 = total;
         a++;
      }
   }
}
