
//Dante T Nguyen
//ATM Machine Prototype

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


//Class
public class atmpoints {
private double balance;

    //Main
    public static void main (String arg[]) throws IOException
    {
        atmpoints  amy = new atmpoints();
        amy.menu();
    }
    //Menu Method
    public void menu () throws IOException
    {
    Scanner stanly = new Scanner(System.in);
    int selector;
    
    
    //Menu
       do
       { 
         System.out.println("\nPlease choose from the following options");
         System.out.println("\n1.Deposit. \n2.Withdraw \n3.Check Balance \n0.Exit");
         
         selector = stanly.nextInt();
         if(selector==1)
         {
             deposit();
         }
         else if(selector==2)
         {
             withdraw();
         }
         else if(selector==3)
         {
             checkbalance();
         }
         else if (selector==0)
         {
             System.exit(0);
         }
         else
         {
             System.out.println("Input not recognized. Do try again");
         }
       }
       while(true);
  }

//Deposit method
public void deposit() throws IOException
{
    BufferedReader buffy;
    String damount;
    System.out.println("Enter deposit amount...");
    buffy = new BufferedReader(new InputStreamReader(System.in));
    damount = buffy.readLine();
    double amount = Double.valueOf(damount).doubleValue();
    balance = balance + amount;
    
    System.out.println("Your balance is now: $" + balance);
}

//Withdraw Method
public void withdraw() throws IOException
{
    BufferedReader buffy;
    String wamount;
    System.out.println("Enter withdraw amount...");
    buffy = new BufferedReader(new InputStreamReader(System.in));
    wamount = buffy.readLine();
    double amount = Double.valueOf(wamount).doubleValue();
    balance = balance - amount;
    
    System.out.println("Your balance is now: $" + balance);
}

//Check Balance Method
public void checkbalance() throws IOException
{
    System.out.println("Your balance is... $" +  balance); 
}

}
