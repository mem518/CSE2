// Manuel E. Mendez
//2/17/14
//CSE 2
//Banking Java Program

//The program will act as a bank account and make transactions
//for the person such s view account, withdraw and deposit.


import java.util.Scanner;
//scanner for inputing variables

//public class for Banking
public class Banking{
    //main method
    public static void main(String[] args) {
        Scanner myScanner;
        myScanner=new Scanner(System.in);
        
        int random = (int)((1000) + (int)(Math.random()*((5000 - 1000)+ 1)));
        //creates the random number for account
        System.out.println("Would you like to deposit money? \n Please enter Yes/yes or No/no");
        //asks the user for if they would like to deposit money
        String input1=myScanner.nextLine();
        //variable for answer
        switch(input1){
            //switch statment for first answer
            default:System.out.println("Sorry, you did not enter Yes/yes or No/no.");
            //output if the user did not input a correct input
            return;
            case"Yes": case"yes"://if the user types 'yes', this will happen
                System.out.println("How much would you like to deposit?");
                //asks how much they wish to deposit
                int inputD=myScanner.nextInt();
                //variable for int
                if (inputD<0){
                    System.out.println("I'm sorry, you did not enter a positive number.");
                    //prints out if they did not enter an int
                return;
                }
                if (inputD>0){
                int balanceOfDeposit;
                balanceOfDeposit=inputD+random;
                //equation for new balance
                System.out.println("Your new balance is $"+balanceOfDeposit+" .");
                //prints out their new balance
                return;
                }
            case"No": case"no"://if the user types 'no', this will happen
                System.out.println("Would you like to withdraw money?");
                //asks if they wish to withdraw instead
                String input2=myScanner.nextLine();
                //variable for answer
                switch(input2){
                    default:System.out.println("Sorry, you did not enter Yes/yes or No/no.");
                    //output if the user did not input a correct input
                    case"Yes": case"yes":
                        System.out.println("How much would you like to withdraw?");
                        //asks how much they wish to deposit
                        int inputW=myScanner.nextInt();
                        //variable for int
                        if (inputW<0){
                            System.out.println("I'm sorry, you did not enter a positive number.");
                        return;
                        }
                        if (inputW>random){
                            System.out.println("I'm sorry, you do not have enough in your account to withdraw that amount.");
                            //output if they wish to withdraw more than they have
                        return;
                        }
                        int balanceOfWithdraw;
                        //variable for new balance
                        balanceOfWithdraw=random-inputW;
                        //equation for new balance
                        System.out.println("Your new balance is $"+balanceOfWithdraw+" .");
                        //prints out new balance
                        break;
                    case"No": case"no":
                        System.out.println("Would you like to view your account balance?");
                        //asks if they wish to view their balance
                        String input3=myScanner.nextLine();
                        //variable for answer
                        switch(input3){
                            default:System.out.println("Sorry, you did not enter Yes/yes or No/no.");
                            case"Yes": case"yes":
                                System.out.println("Your account balance is $"+random+" .");
                                //prints out the balance
                                break;
                            case"No": case"no":
                                System.out.println("Thank You. Have a nice day.");
                                //prints out if they have no other answer
                                break;
                }//enjavad of switch w/input3
        }//end of switch w/input2
    }//end of switch w/input1
}//end of main method
}//end of class
        