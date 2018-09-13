import java.util.Stack;
import java.util.Scanner;
public class Parking
{
    public static void main(String[] args)
    {
       Scanner scan = new Scanner(System.in);
       Stack <Integer> driveway = new Stack<>();
       Stack <Integer> street = new Stack<>();
       
       Integer car= 1;
       while (car != 0)
       {
           System.out.println("\nEnter licence plate to add a car (- to remove): ");
           car = scan.nextInt();
           

           
           
           //add
           if (car.intValue() > 0)
           {
               driveway.push(car);
               System.out.println("Driveway: " + driveway);
           }
           
           //Remove
           else if (car.intValue() < 0)
           {
               while (driveway.peek().intValue() != Math.abs(car.intValue()))
              
               {
                   street.push(driveway.pop());
                   System.out.println("\nDriveway: " + driveway);
                   System.out.println("Street: " + street + "\n");
               }
               System.out.println(driveway.pop() + " Has been located and removed\n");
               
               //adds street cars back into driveway
               System.out.println();
               int size = street.size();
               for (int i = 0; i < size; i++)
               {
                   System.out.println(driveway.push(street.pop()) + " Has been added back to driveway");
                   
               }
               
               System.out.println("\n...Updated...\nDriveway: " + driveway + "\nStreet: " + street);
           }
       }
    }
}
