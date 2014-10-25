
import java.util.*;
import java.io.*;
public class Assignment1 {
  public static void main(String [] args) throws IOException
  {
	int  input, sumA, sumB, sumC, sumD, sumF, sumI, count;
	sumA=sumB=sumC=sumD=sumF=sumI=count=0;
	
        System.out.println("");
        System.out.println("");
        System.out.println("Enter grades and then \"-99\" to exit");
        
        BufferedReader br;
        br = new BufferedReader( new InputStreamReader( System.in ) );
        String line = br.readLine();

        StringTokenizer st = new StringTokenizer( line );
        input = Integer.parseInt( st.nextToken() );
        
	if(input==-99) {System.out.println("Goodbye!"); 
                        System.exit(1);
                       } 

        System.out.println("");
        System.out.println("");


        while(input != -99){ 

                if(input>100)
                {
                sumI++;
                System.out.println(input + " is an invalid score and has been ignored.");
                }

                else if(input>=90){
                    sumA++;
                    System.out.println("Score " + input + "  is  A");
    	        }
                else if(input >= 70){
                    sumB++;
                    System.out.println("Score " + input + "  is  B");
                }
                else if(input >= 50){
                    sumC++;
                    System.out.println("Score " + input + "  is  C");
                }
                else if(input >= 35){
                    sumD++;
                    System.out.println("Score " + input + "  is  D");
                }

                else if (input >= 0){
                    sumF++;
                    System.out.println("Score " + input + "  is  F");
                }
                else
                {
                sumI++;
                System.out.println(input + " is an invalid score and has been ignored.");
                }

              count = (sumA + sumB + sumC + sumD + sumF + sumI) % 10;
            if(count == 0)
            {

                System.out.println("");
                System.out.println("Press Enter to Continue...");
 
                br = new BufferedReader(new InputStreamReader(System.in));
                line = br.readLine();

            }

            input = Integer.parseInt( st.nextToken() );
        }

        if(count!=0)
        {
        System.out.println("");
        System.out.println("Press Enter for Grade Summary...");
        
        br = new BufferedReader(new InputStreamReader(System.in));
        line = br.readLine();
        }

        System.out.println("The total number of A's is " + sumA);
        System.out.println("The total number of B's is " + sumB);
        System.out.println("The total number of C's is " + sumC);
        System.out.println("The total number of D's is " + sumD);
        System.out.println("The total number of F's is " + sumF);
        System.out.println("Goodbye!");
     
   } 
}
