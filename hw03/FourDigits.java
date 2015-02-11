// Manuel E. Mendez
//2/10/14
//CSE 2
//FourDigits Java Program

//The program will print out the first four digits to
//the right of the decimal point


import java.util.Scanner;
//scanner for inputing variables

//public class for FourDigits
public class FourDigits{
    //main method
    public static void main(String[] args) {
        Scanner myScanner;
        myScanner=new Scanner(System.in);
        
        System.out.print("Enter a double: ");
        //inputing a variable
        
        //organizing the decimal places
        double variableDouble=myScanner.nextDouble();
        
        int variableNumber=(int)(variableDouble*10000);
        
        int fourthDigit=(variableNumber%10);
        
        int thirdDigit=((variableNumber/10)%10);
        
        int secondDigit=((variableNumber/100)%10);
        
        int firstDigit=((variableNumber/1000)%10);
        
        
        System.out.println("The first four digits to the right of the decimal point are: "+
        firstDigit+secondDigit+thirdDigit+fourthDigit+" .");
    }//end main method
}//end class