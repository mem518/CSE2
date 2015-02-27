// Manuel E. Mendez
//2/17/14
//CSE 2
//ToHex Java Program

//The program will convert R,G,&B ints for colors to hex decimals

import java.util.Scanner;
//scanner for inputing variables

//public class for ToHex
public class ToHex{
    //main method
    public static void main(String[] args) {
        Scanner myScanner;
        myScanner=new Scanner(System.in);
        
        System.out.println("Please enter three numbers representing RGB values: ");
        
        int input1;
        if(myScanner.hasNextInt()){ //makeing sure input1 is an int
            input1=myScanner.nextInt(); }//end of if statement 
        else{
            System.out.println("Sorry, you did not enter an integer.");//states if people is not an int
            return; // leaves the program i.e. the program terminates
        }
        int input2;
        if(myScanner.hasNextInt()){ //makeing sure input 2 is an int
            input2=myScanner.nextInt(); }//end of if statement 
        else{
            System.out.println("Sorry, you did not enter an integer.");//states if people is not an int
            return; // leaves the program i.e. the program terminates
        }
        int input3;
        if(myScanner.hasNextInt()){ //makeing sure input 3 is an int
            input3=myScanner.nextInt(); }//end of if statement 
        else{
            System.out.println("Sorry, you did not enter an integer.");//states if people is not an int
            return; // leaves the program i.e. the program terminates
        }
        if ((input1 < 0 ||  input2 < 0 || input3 < 0) || (input1 > 255 || input2 > 255 || input3 > 255)){
            System.out.println("Sorry, you must enter values between 0-255.");
            return;}
            

        String finalnum=" ";
   
        
        int hNumber1=(input1)/16;//finds first hex value of input 1
        int hNumber2=(input1)%16;// seconds hex value of input 1
        
        int hNumber3=(input2)/16;//finds first hex value of input 2
        int hNumber4=(input2)%16;//finds second hex value of input 2
        
        int hNumber5=(input3)/16;//finds first hex value of input 3
        int hNumber6=(input3)%16;//finds second hex value of input 3
        
        switch(hNumber1){
            //if first hex value is greater than 10, 
            //switch statment converts int to proper hex decimal
            case 0: finalnum+=0;
            break;
            case 10: finalnum+="A";
            break;
            case 11: finalnum+="B";
            break;
            case 12: finalnum+="C";
            break;
            case 13: finalnum+="D";
            break;
            case 14: finalnum+="E";
            break;
            case 15: finalnum+="F";
            break;
            default: finalnum+=hNumber1;
            break;
        }//end of switch
        switch(hNumber2){
            //if second hex value is greater than 10, 
            //switch statment converts int to proper hex decimal
            case 0: finalnum+=0;
            break;
            case 10: finalnum+="A";
            break;
            case 11: finalnum+="B";
            break;
            case 12: finalnum+="C";
            break;
            case 13: finalnum+="D";
            break;
            case 14: finalnum+="E";
            break;
            case 15: finalnum+="F";
            break;
            default: finalnum+=hNumber2;
            break;
        }//end of switch
        switch(hNumber3){
            //if third hex value is greater than 10, 
            //switch statment converts int to proper hex decimal
            case 0: finalnum+=0;
            break;
            case 10: finalnum+="A";
            break;
            case 11: finalnum+="B";
            break;
            case 12: finalnum+="C";
            break;
            case 13: finalnum+="D";
            break;
            case 14: finalnum+="E";
            break;
            case 15: finalnum+="F";
            break;
            default: finalnum+=hNumber3;
            break;
        }//end of switch
        switch(hNumber4){
            //if fourth hex value is greater than 10, 
            //switch statment converts int to proper hex decimal
            case 0: finalnum+=0;
            break;
            case 10: finalnum+="A";
            break;
            case 11: finalnum+="B";
            break;
            case 12: finalnum+="C";
            break;
            case 13: finalnum+="D";
            break;
            case 14: finalnum+="E";
            break;
            case 15: finalnum+="F";
            break;
            default: finalnum+=hNumber4;
            break;
        }//end of switch
        switch(hNumber5){
            //if fifth hex value is greater than 10, 
            //switch statment converts int to proper hex decimal
            case 0: finalnum+=0;
            break;
            case 10: finalnum+="A";
            break;
            case 11: finalnum+="B";
            break;
            case 12: finalnum+="C";
            break;
            case 13: finalnum+="D";
            break;
            case 14: finalnum+="E";
            break;
            case 15: finalnum+="F";
            break;
            default: finalnum+=hNumber5;
            break;
        }//end of switch
        switch(hNumber6){
            //if sixth hex value is greater than 10, 
            //switch statment converts int to proper hex decimal
            case 0: finalnum+=0;
            break;
            case 10: finalnum+="A";
            break;
            case 11: finalnum+="B";
            break;
            case 12: finalnum+="C";
            break;
            case 13: finalnum+="D";
            break;
            case 14: finalnum+="E";
            break;
            case 15: finalnum+="F";
            break;
            default: finalnum+=hNumber6;
            break;
        }//end of switch
        System.out.println("The decimal numbers R:"+input1+", G:"+input2+", and B:"+
            input3+" are represented as the hex decimal: "+finalnum);

   
    }//end of main method
}//end of class