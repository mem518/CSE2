//Manuel E. Mendez
//3/17/14
//CSE 2
//Factorials Java Program

//

import java.util.Scanner;
//scanner for inputing variables

//public class for Factorials
public class ArrayInputs{
    //main method
    public static void main(String[] args) {
        Scanner myScanner;
        myScanner=new Scanner(System.in);
        
        System.out.println("Enter a positive number for the size of the array. ");//asks the user for an input
        int n;
        n=myScanner.nextInt();
        
        check(n);
        
        System.out.println("working");
    }
    
    public static int check(int x){
        
        if(x<0){
            while(x<0){
                System.out.println("Sorry, invalid input. Please enter again.");
                
                Scanner myScanner;
                myScanner=new Scanner(System.in);
                x=myScanner.nextInt();
            }
            return x;
        }
        else{
            return x;
        }
    }
}