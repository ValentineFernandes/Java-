public class EvenOdd1 
{
  public static void main(String args[]) 
  {
    int i, n = 100;
    System.out.println("Odd Numbers from 1 to "+n+" are: ");
	  for (i = 1; i <= n; i++) 
    {
	    if (i % 2 != 0) 
      {
		    System.out.println(i + " ");
	    }
	  }
    System.out.println("----------------------------------------");
    System.out.println("Even Numbers from 1 to "+n+" are: ");
	  for (i = 1; i <= n; i++) 
    {
	    if (i % 2 == 0) 
      {
		    System.out.println(i + " ");
	    }
	  }
  }
}
