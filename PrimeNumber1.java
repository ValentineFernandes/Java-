import java.util.*;
public class PrimeNumber1
{
	public static void main(String arg[])	
	{
	  int i, count=0;
    System.out.println("Enter a number ");
	  Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
	  for(i=1;i<=n;i++)
	  {
	    if(n%i==0)
	    {
	        count++;   
	    }
	  }
	  if(count==2)
    {
	       System.out.println("It is a prime number ");
	  }
    else
    {
	       System.out.println("It is not a prime number ");	        
    }
  }
}
