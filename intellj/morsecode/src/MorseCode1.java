/**
 * purpose- program to convert to morse code
 * Created by Pranav on 3/3/16.
 */
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileReader;
import java.util.HashMap;
public class MorseCode1
{
    static String messageToMorse(String message) {
        try {
            Scanner inFile = new Scanner(new FileReader("MorseCode.txt"));
            HashMap<String,String> hash = new HashMap<String, String>();
            hash.put(" "," ");
            while (inFile.hasNext()) {
                String key = inFile.next();
                String value = inFile.next();
                hash.put(key, value);
            }
            String temp = "";
            message = message.toUpperCase();
            for(int i=0;i<message.length();i++)
            {
                char x = message.charAt(i);
                temp += hash.get(x+"")+ " " ;
            }
            return temp;
        }
        catch (FileNotFoundException e)
        {
            System.out.print("file not found");
            System.exit(1);
        }
        return null;

    }
}
