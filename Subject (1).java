//program to calculate percentage and grade
import java.util.*;
public class Subject{
  public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    int a;
     System.out.println(" enter the value ");
    int b;
     System.out.println(" enter the value ");
    int c;
     System.out.println(" enter the value ");
    int d;
     System.out.println(" enter the value ");
    int e;
     System.out.println(" enter the value ");
    a=s.nextInt();
    b=s.nextInt();
    c=s.nextInt();
    d=s.nextInt();
    e=s.nextInt();
     System.out.println("physics marks is "+a);
     System.out.println("chemistry marks is "+b);
     System.out.println("biology marks is "+c);
     System.out.println("mathematics marks is "+d);
     System.out.println("computer marks is "+e);
    float percentage=((a+b+c+d+e)*100/500);
    System.out.println("percentage="+percentage);
    if(percentage>=90)
       System.out.println("A grade");
    else if(percentage>=80) 
       System.out.println("B grade");
    else if(percentage>=70)
       System.out.println("C grade");
    else if(percentage>=60) 
       System.out.println("D grade");
    else if(percentage>=40) 
       System.out.println("E grade");
    else
       System.out.println("F grade");
      System.out.println("end");
  }
}