import java.io.*; 
import java.util.*;

public class Assignment1
{
    
   public static void main (String[] args) throws IOException
   {


	float input;
        float temp = 1;
        int index;
		String s;

        System.out.println("");
        System.out.println("");
        System.out.println("Enter a string of numbers followed by \"0\" to exit.");
        System.out.println("Decimals are OK.");
        System.out.println("Negative values will be ignored.");

        BufferedReader br;
        br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine(); 

        StringTokenizer st = new StringTokenizer(line);
        input = Float.valueOf( st.nextToken());

	if(input==0)
    { 

         System.out.print("Goodbye!");
         System.exit(1);
        
    }

         while(input != 0)
		 {

             if(input<0)
             {
                System.out.println(input + " ignored.");
	     }
             else if(input>0)
             {
               
                temp = input * temp;
                
             }
             
             input = Float.valueOf( st.nextToken());
         }
        
        s = Float.toString(temp);
       
        index=s.indexOf(".");

        int i = index+5;
        int j = s.length();
   
        if(j > i)
        {
              System.out.println("The product of all positive inputs is " + s.substring(0,i));
        }
        else
        {
           System.out.println("The Product of all positive inputs is " + s);
        }
        System.out.println("Goodbye!");
   }
}
