//progam 
import java.util.*;
public class Program7{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int n;
    System.out.println("enter a number");
    n=s.nextInt();
    switch(n)
      {
        case 1:
           System.out.println("sunday");
          break;
        case 2:
          System.out.println("monday");
          break;
        case 3:
           System.out.println("tuesday");
          break;
        case 4:
           System.out.println("wednesday");
          break;
        case 5:
           System.out.println("thursday");
        case 6:
           System.out.println("friday");
          break;
        case 7:
           System.out.println("saturday");
          break;
        default:
           System.out.println("enter number between 1 and 7 only");
      }
     System.out.println("end");
  }
}