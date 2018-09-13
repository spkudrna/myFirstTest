import java.util.Set;
import java.util.TreeSet;
import java.util.Scanner;
import java.io.*;
public class TreesSet
{
    public static void main(String[] args)
    {
      String filename = "bee.txt";
      try(Scanner bee = new Scanner(new File(filename));)
      {
      
      
    
       Set <String> words = new TreeSet<>();
      
      while (bee.hasNext())
      {
          words.add(bee.next());
      }
      
      System.out.println(words);
      System.out.println(words.size());
     }
    catch(FileNotFoundException e){}
    }
}
