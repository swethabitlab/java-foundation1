//program to check whether eligible to vote or not
import java.util.*;
public class Program6{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int age;
    System.out.println("enter the age");
    age=s.nextInt();
    if(age>18)
      System.out.println("eligible to vote");
    else
      System.out.println("not eligible to vote");
    System.out.println("end");
  }
}