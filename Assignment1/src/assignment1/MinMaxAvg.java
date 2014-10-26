/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment1;

import java.util.*;
import java.io.*;
public class MinMaxAvg {
   public static void showMessage() throws IOException
   {
	float input, min, max, num, den, temp; 
	input=min=max=num=den=temp=0;
	
        System.out.println("");
        System.out.println("");
        System.out.println("Enter a string of numbers");
       
        
        BufferedReader br;
        br = new BufferedReader( new InputStreamReader( System.in ) );
        String line = br.readLine();

        StringTokenizer st = new StringTokenizer( line );
        temp = Float.parseFloat( st.nextToken());
        min = temp;
        
        if(temp>max)
	{
             max=temp;
                   
    	}
                
            den++;
            
            num = num + temp;
       

            while(st.hasMoreTokens() )
            {
                input = Float.valueOf( st.nextToken()).floatValue();
               
                if(input<min)
                {
                    min=input;
                }

                if(input>max)
		{
                    max=input;   
    	        }
                
                    den++;
				
                    num = num + input;
            }
        
        System.out.println("The minumimum value is " + min);
        System.out.println("The maximum value is " + max);
        float avg = num/den;
 
        
        System.out.println("the average of the values is " + avg);
       
        System.out.println("Goodbye and Have a Great Day!");
     
   } 
}

