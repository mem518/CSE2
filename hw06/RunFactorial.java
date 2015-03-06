// Manuel E. Mendez
//2/17/14
//CSE 2
//RunFactorial Java Program

//The program will output the factorial of an input


import java.util.Scanner;
//scanner for inputing variables

//public class for RunFactorial
public class RunFactorial{
    //main method
    public static void main(String[] args){
        Scanner myScanner;
        myScanner=new Scanner(System.in);
        System.out.println("Please enter a valid input.");//asks for an input
        int n;
        int m;//two variables for the factorial equation
        n=myScanner.nextInt();//n variable becomes the input
        while (myScanner.hasNextInt()){//makes sure the input is an int
                    m=n-1;
            if (n>=9 || n<=16){//makes sure the input is between 9 and 16
                while (m>=9 || m<=16){
                    n=n*m;//equation for factorial
                    m=m-1;
                }
        
            }
            else {
                System.out.println("Invalid input. Enter again.");// output if not an int
            }
        }
        System.out.println("Factorial is: "+n);// prints out factorial
    }    
}