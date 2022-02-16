import java.time.LocalDateTime; 
import java.time.format.DateTimeFormatter; 
public class DateandTimeFormat 
{
  public static void main(String[] args) 
  {
    LocalDateTime l = LocalDateTime.now();
    System.out.println("Before formatting: " + l);
    DateTimeFormatter d = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    String f = l.format(d);
    System.out.println("After formatting: " + f);
  }
}
