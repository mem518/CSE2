// Manuel E. Mendez
//2/10/14
//CSE 2
//Cookies Java Program

//The program will print out if 
//someone has enough cookies to share between people 


import java.util.Scanner;
//scanner for inputing variables

//public class for Cookies
public class Cookies{
    //main method
    public static void main(String[] args) {
        Scanner myScanner;
        myScanner=new Scanner(System.in);
        
        System.out.print("Enter the number of people: "); //ask for people input
        int people; //people variable
        if(myScanner.hasNextInt()){ //makeing sure people is an int
            people=myScanner.nextInt(); }//end of if statement 
        else{
            System.out.println("You did not enter an int.");//states if people is not an int
            return; // leaves the program i.e. the program terminates
        }//end of else statement 
        
        if(people<0){
            System.out.println("You did not enter a positive int.");//make sure people is a positive int
            return;// leaves the program i.e. the program terminates
        }//end of if statement 
        
        
         System.out.print("Enter the number of cookies you are planning to buy: ");//ask for cookies input
        int ncookies;//number of cookies variable
        if(myScanner.hasNextInt()){
            ncookies=myScanner.nextInt(); }//end of if statement 
        else{
            System.out.println("You did not enter an int.");//states if ncookies is not an int
            return; // leaves the program i.e. the program terminates
        }//end of else statement 
        
        if(ncookies<0){
            
            System.out.println("You did not enter a positive int.");
            return; // leaves the program i.e. the program terminates
        }//end of if statement 
        
        
         System.out.print("Enter the number of cookies per person: "); //ask for cookies per person input
        int cookiesPerPerson;//cookies per person variable
        if(myScanner.hasNextInt()){
            cookiesPerPerson=myScanner.nextInt(); }//end of if statement 
        else{
            System.out.println("You did not enter an int.");//states if cookiesPerPerson is not an int
            return; // leaves the program i.e. the program terminates
        }//end of else statement 
        
        if(cookiesPerPerson<0){
            
            System.out.println("You did not enter an int.");
            return;// leaves the program i.e. the program terminates
        }//end of if statement 
        
        int actualCookies=(people*cookiesPerPerson); //equation for cookies will need
       
        if(actualCookies<ncookies){
            System.out.println("You have enough cookies for each person, but there will be cookies left over.");}
            //states that theres enough cookies and there will be extra
        if (actualCookies>ncookies){
            System.out.println("You do not have enough cookies per person.\n");
            //states that theres not enough cookies
            int needCookies; //variable for how many more cookies you will need
            needCookies=actualCookies-ncookies;//equation for how many more cookies you will need
            System.out.println("You will need to buy "+needCookies+" .");
            //states how many more cookies you will need
        }//end of if statement 
        
        if (actualCookies==ncookies){ 
            System.out.println("You have enough cookies and they will devide evenly.");
            //have exactly the correct amouont of cookies for everyone
        }//end of if statement 
    }
    
}