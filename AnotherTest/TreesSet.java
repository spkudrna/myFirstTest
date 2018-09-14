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
          
          while(bee.hasNext())
          
          {
              //Adds word to set
              words.add(clean(bee.next()));
          }
          
          for (String word : words)
          {
              //Prints unique word
              System.out.println(word);
          }
          
          //Prints number of unique words found
          System.out.println("\n" + words.size());
         }
        catch(FileNotFoundException e){}
    }
    
    //Cuts off ending punctuation (If any)
    public static String clean(String word)
    {
        if (Character.isLetter(word.charAt(word.length()-1)))
        {
            return word;
        }
        else
        {
            int i = 0;
            while ((Character.isLetter(word.charAt(i))))
            {
                i++;
            }
            return word.substring(0, i);
        }
    }
}


