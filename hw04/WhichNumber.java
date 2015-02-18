// Manuel E. Mendez
//2/17/14
//CSE 2
//WhichNumber Java Program

//The program will output what number the person
//has thought of by asking yes or no questions


import java.util.Scanner;
//scanner for inputing variables

//public class for WhichNumber
public class WhichNumber{
    //main method
    public static void main(String[] args) {
        Scanner myScanner;
        myScanner=new Scanner(System.in);
        
        System.out.print("Think of a number between 1 and 10. \n Is the number even?");//states to think of a number and starts the program
        //inputing a the answer 
        
        String input=myScanner.nextLine();//first variable for the answer
        
        switch(input){//passes the first input to the case statments
        default:System.out.println("Sorry, you did not enter Y/y or N/n."); //state that the input was invalid
            break;//ends the program
        case"y": case"Y"://cases for the input
             System.out.print("Is it divisible by 3?");//asks next question
             String input1=myScanner.nextLine();//2nd variable for the answer
             switch (input1){//passes the 2nd input to the case statments
             default:System.out.println("Sorry, you did not enter Y/y or N/n.");//state that the input was invalid
            break;//ends the program
                case"y": case"Y":
                System.out.println("You're number is 6");//prints out the answer
                break;
                case"n": case"N"://cases for the input
                System.out.println("Is the number divisible by 4?");
                String input2=myScanner.nextLine();//3rd variable for the answer
                switch(input2){
                default:System.out.println("Sorry, you did not enter Y/y or N/n.");//state that the input was invalid
            break;//ends the program
                    case"y": case"Y":
                    System.out.println("Is the number divided by 4 greater than 1?");
                    String input3=myScanner.nextLine();//4th variable for the answer
                    switch(input3){
                    default:System.out.println("Sorry, you did not enter Y/y or N/n.");//state that the input was invalid
            break;
                        case"y": case"Y":
                        System.out.println("You're number is 8.");//prints out the answer
                        break;
                        case"n": case"N":
                        System.out.println("You're number is 4.");//prints out the answer
                        break;
                    }
                    break;
                    case"n": case"N":
                    System.out.println("Is it divisible by 5?");
                    String input4=myScanner.nextLine();//5th variable for the answer
                    switch(input4){
                    default:System.out.println("Sorry, you did not enter Y/y or N/n.");//state that the input was invalid
            break;//ends the program
                        case"y": case"Y":
                        System.out.println("You're number is 10.");//prints out the answer
                        break;//ends the program
                        case"n": case"N":
                        System.out.println("You're number is 2.");//prints out the answer
                        break;
                    }break;
                }break;
            }break;
            
        case"n": case"N":
            System.out.println("Is it divisible by 3?");
            String input5=myScanner.nextLine();//6th variable for the answer
            switch(input5){
            default:System.out.println("Sorry, you did not enter Y/y or N/n.");//state that the input was invalid
            break;
                case"y": case"Y":
                    System.out.println("When divided by 3 is the result greater than 1?");
                    String input6=myScanner.nextLine();//7th variable for the answer
                    switch(input6){
                    default:System.out.println("Sorry, you did not enter Y/y or N/n.");//state that the input was invalid
            break;//ends the program
                        case"y": case"Y":
                            System.out.println("You're number is 9.");//prints out the answer
                            break;
                        case"n": case"N":
                            System.out.println("You're number is 3.");//prints out the answer
                            break;
                    }break;
                case"n": case"N":
                    System.out.println("Is the number greater than 6?");
                    String input7=myScanner.nextLine();//8th variable for the answer
                    switch(input7){
                    default:System.out.println("Sorry, you did not enter Y/y or N/n.");//state that the input was invalid
            break;
                        case"y": case"Y":
                             System.out.println("You're number is 7.");//prints out the answer
                             break;
                        case"n": case"N":
                            System.out.println("Is it less than 3?");
                            String input8=myScanner.nextLine();//9th variable for the answer
                            switch(input8){
                            default:System.out.println("Sorry, you did not enter Y/y or N/n.");//state that the input was invalid
            break;//ends the program
                                case"y": case"Y":
                                    System.out.println("You're number is 1.");//prints out the answer
                                    break;
                                case"n": case"N":
                                    System.out.println("You're number is 5.");//prints out the answer
                                    break;
                            }//end of switch statment
                    }//end of switch statment
            }//end of switch statment
        }//end of switch statment
    }//end of main method
}//end of class