// Manuel E. Mendez
//2/10/14
//CSE 2
//Root Java Program

//Root program will calculate the cube root of a number
//and also claculate the grude estimate of the number cubed

import java.util.Scanner;
//scanner for inputing variables

//public class for Root
public class Root{
    //main method
    public static void main(String[] args) {
        
        Scanner myScanner;
        myScanner=new Scanner(System.in);
        
        //calculation for Root
        System.out.print("Enter the number: ");
        double X=myScanner.nextDouble();
        double guess=X/3;
        double guess1, guess2, guess3, guess4, guess5, guess6, numberCubed;
        
        guess1=(2*guess*guess*guess+X)/(3*guess*guess);
        
        guess2=(2*guess1*guess1*guess1+X)/(3*guess1*guess1);
        
        guess3=(2*guess2*guess2*guess2+X)/(3*guess2*guess2);
        
        guess4=(2*guess3*guess3*guess3+X)/(3*guess3*guess3);
        
        guess5=(2*guess4*guess4*guess4+X)/(3*guess4*guess4);
        
        guess6=(2*guess5*guess5*guess5+X)/(3*guess5*guess5);
        
        numberCubed=(guess6*guess6*guess6);
        
        System.out.println("The cube root is "+guess6+" . \nThe cube of the number is "+
        numberCubed+" .");
        
    }//end main method
}//end class