/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment1;


import java.util.*;
import java.io.*;
public class Twelver {
   public static void showMessage() throws IOException
     {
	int input, first, last,count,num; 
	input=first=last=count=num=0;

        //input will hold the value coming into the program
        //first will hold the index of the first instance of the number 12
        //last will hold the index for the last instance of the number 12
        //count will hold the index for the the input being evaluated.
        //num will hold the number of 12's in the string.
	
        System.out.println("");
        System.out.println("");
        System.out.println("Enter a string of whole numbers.");
        System.out.println("I will tell you how many times you entered the number \"12\".");
        System.out.println("I will also tell you where the location of the first and last index of \"12\".");
        
        BufferedReader br;
        br = new BufferedReader( new InputStreamReader( System.in ) );
        String line = br.readLine();

        StringTokenizer st = new StringTokenizer( line );

            while(st.hasMoreTokens() )
            {

                input = Integer.parseInt(st.nextToken());

                count++;

                if(first==0)
                {
                    if(input == 12)
                    {
                        first = count;
                        last = count;
                        num++;
                       
                    }
                }
                else 
                {
                    if(input==12)
		    {
                        num++;   
                        last=count;
    	            }
                }
        }
        System.out.println("The first instance of the number 12 is located at index " + first);

        if(first !=0)
        {
        System.out.println("You entered " + num + " \"12's\"");
        System.out.println("The last instance of the number 12 is located at index " + last);
        System.out.println("Have a great day!");
        }

   } 
}

