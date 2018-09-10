import java.util.Stack;
import java.util.Scanner;
public class Parking
{
    public static void main(String[] args)
    {
       Scanner scan = new Scanner(System.in);
       Stack driveway = new Stack();
       Stack street = new Stack();
       
       Integer car= 1;
       while (car != 0)
       {
           System.out.println("Enter licence plate to add a car (- to remove): ");
           car = scan.nextInt();
           
           Integer compare = 0;
           
           //Remove
           if (car < compare)
           {
               while (driveway.peek() != car)
               {
                   street.push(driveway.pop());
               }
               driveway.pop();
           }
       }
    }
}
