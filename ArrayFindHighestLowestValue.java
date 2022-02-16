public class ArrayFindHighestLowestValue 
{
        public static void main(String[] args) 
        {
                int i;
                int arr[] = {1,3,5,8,10,15,25,35,50,80,100};
                int low = arr[0];
                int high = arr[0];
                for(i=0; i< arr.length; i++)
                {
                        if(arr[i] < low)
                        {
                            low = arr[i];
                        }
                        if (arr[i] > high)
                       {
                            high = arr[i];
                       }
                }
                System.out.println("Lowest Number in Array is : " + low);
                System.out.println("Highest Number in Array is : " + high);
        }
}
