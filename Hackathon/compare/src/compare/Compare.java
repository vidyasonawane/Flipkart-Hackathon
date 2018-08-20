package compare;

import java.util.*;
import java.io.*;
public class Compare 
{


        public static void main(String args[])
        {
        File file =new File("file2.txt");
        Scanner in = null;
        try 
        {
            in = new Scanner(file);
         
            while(in.hasNext())
            {
            	
            	String s = in.nextLine();
            	String[] arr = s.split(", ");    

            	for ( String ss : arr) {
            	    //System.out.println(ss+"\n");
            	    
            	    if(ss.contains("confidence") )
            	    {
            	    	String[] arr1 = ss.split(":");
            	    
            	    	
                    	    System.out.println("Similarity : "+arr1[1]+"%\n");
            	    
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