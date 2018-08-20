
import java.util.*;
import java.io.*;
public class ageGender 
{


        public static void main(String args[])
        {
        File file =new File("file1.txt");
        Scanner in = null;
        try 
        {
            in = new Scanner(file);
          //  List<String> ar = new ArrayList<>();
            while(in.hasNext())
            {
            	
            	String s = in.nextLine();
            	String[] arr = s.split("}},");    

            	for ( String ss : arr) {
            	    ///System.out.println(ss+"\n");
            	    
            	    if(ss.contains("attributes") )
            	    {
            	    	String[] arr1 = ss.split(",");
            	    
            	    	for ( String s1 : arr1) {
                    	    System.out.println(s1+"\n");
            	    }
            	}
            	
            }
            	
 
        }
        }
        catch (FileNotFoundException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
