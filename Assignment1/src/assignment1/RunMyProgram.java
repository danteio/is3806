/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment1;

import java.io.IOException;
import java.util.Scanner;

public class RunMyProgram
{
        public static void main(String arg[]) throws IOException
        {      
                RunMyProgram rmp = new RunMyProgram();
                rmp.menu();      
        }
        public void menu() throws IOException
        {
                Scanner sc = new Scanner(System.in);
                int selector;

                do
                {
                System.out.println("\nPlease choose from the following menu:");
                System.out.println("1.Product \n2.Grader\n3.Min Max Avg\n4.Twelver");
                
                selector = sc.nextInt();
                if(selector ==1)
                {
                        Multi pnn = new Multi();
                        pnn.showMessage();     
                }
                else if (selector==2)
                {
                        Grader nt = new Grader();
                        nt.showMessage();
                }
                else if (selector==3)
                {
                        MinMaxAvg mma = new MinMaxAvg();
                        mma.showMessage();
                }
                else if (selector==4)
                {
                        Twelver tv = new Twelver();
                        tv.showMessage();
                }
                else
                {
                System.out.println("Input not recognized please try again");
                } 
                
                }
                while(true);
                
                        }
        }

                
 
               
       