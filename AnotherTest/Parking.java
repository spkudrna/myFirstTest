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
               System.out.print(driveway.push(car) + " Has been added to driveway\n");
           }
           
           //Remove
           else if (car.intValue() < 0)
           {
               if (driveway.size() == 0)
               {
                   System.out.println("Driveway is empty");
               }
               else 
               {
                   while (driveway.peek().intValue() != Math.abs(car.intValue()))
                  
                   {
                       System.out.print(street.push(driveway.pop()) + " Has been moved out of driveway to street\n");
                   }
                   System.out.println(driveway.pop() + " Has been located and removed\n");
                   
                   //adds street cars back into driveway
                   System.out.println();
                   for (Integer cars : street)
                   {
                       System.out.println(driveway.push(cars) + " Has been added back to driveway");
                   }
               }
           }
       }
    }
}
