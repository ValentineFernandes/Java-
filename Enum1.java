import java.util.*;
enum Level 
{
    LOW, 
    MEDIUM, 
    HIGH
};
public class Enum1 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        String l, m, h;
        System.out.println("Enter level list : ");
        l = s.next();
        m = s.next();
        h = s.next();   
        System.out.println("Level List is :\n"+l  + "\n"  +m  +"\n" +h);
    }
}

