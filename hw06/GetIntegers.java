// Manuel E. Mendez
//2/17/14
//CSE 2
//GetIntegers Java Program

//The program will output the sum of 5 inputs


import java.util.Scanner;
//scanner for inputing variables

//public class for GetIntegers
public class GetIntegers{
    //main method
    public static void main(String[] args){
        Scanner myScanner;
        myScanner=new Scanner(System.in);
        
        int integer1,integer2,integer3,integer4,integer5;
        int sum;
        System.out.print("Please enter 5 non-negative integers.");
        for (){   
            if (myScanner.hasNextInt() && ((integer1||integer2||integer3||integer4||integer5)>0)){
                //makes sure that input is an int and that they are positive
                integer1=myScanner.nextInt();//enters the input for the integer
                integer2=myScanner.nextInt();
                integer3=myScanner.nextInt();
                integer4=myScanner.nextInt();
                integer5=myScanner.nextInt();
                
            }
            else{
                    
                System.out.println("Invalid input.");//prints if the input is not an int
            }
        }
        sum=integer1+integer2+integer3+integer4+integer5;//equation for the sum of the integers
        System.out.println("The sum is "+sum" .");//prints out the sum
    }
}
