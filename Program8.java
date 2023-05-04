//program to predict who wins in rock,paper,scissors
import java.util.*;
public class Program8{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int player1_move,player2_move;
    System.out.println("enter the player1_move 1.Rock,2.Paper,3.scissors");
    System.out.println("enter the player2_move 1.Rock,2.Paper,3.scissors");
    player1_move=s.nextInt();
    player2_move=s.nextInt();
    if((player1_move==1 && player2_move==2) || (player1_move==3 && player2_move==1) || (player1_move==2 && player2_move==3) )
      System.out.println("player2 wins");
    else if((player1_move==1 && player2_move==3) || (player1_move==2 && player2_move==1) || (player1_move==3 && player2_move==2))
      System.out.println("player1 wins");
    else if(player1_move==player2_move)
       System.out.println("it's a tie");
     else 
      System.out.println("enter the number between 1 and 3");
    System.out.println("end");
  }
}