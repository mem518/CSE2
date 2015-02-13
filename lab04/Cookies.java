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
        
        System.out.print("Enter the number of people: ");
        int people;
        if(myScanner.hasNextInt()){
            people=myScanner.nextInt(); }
        else{
            System.out.println("You did not enter an int.");
            return; // leaves the program i.e. the program terminates
        }
        
        if(people<0){
            System.out.println("You did not enter a positive int.");
            return;
        }
        
        
         System.out.print("Enter the number of cookies you are planning to buy: ");
        int ncookies;
        if(myScanner.hasNextInt()){
            ncookies=myScanner.nextInt(); }
        else{
            System.out.println("You did not enter an int.");
            return; // leaves the program i.e. the program terminates
        }
        
        if(ncookies<0){
            
            System.out.println("You did not enter a positive int.");
            return;
        }
        
        
         System.out.print("Enter the number of cookies per person: ");
        int cookiesPerPerson;
        if(myScanner.hasNextInt()){
            cookiesPerPerson=myScanner.nextInt(); }
        else{
            System.out.println("You did not enter an int.");
            return; // leaves the program i.e. the program terminates
        }
        
        if(cookiesPerPerson<0){
            
            System.out.println("You did not enter an int.");
            return;
        }
        
        int actualCookies=(people*cookiesPerPerson);
       
        if(actualCookies<ncookies){
            System.out.println("You have enough cookies for each person, but there will be cookies left over.");}
        
        if (actualCookies>ncookies){
            System.out.println("You do not have enough cookies per person.\n");
            int needCookies;
            needCookies=actualCookies-ncookies;
            System.out.println("You will need to buy "+needCookies+" .");
        }
        
        if (actualCookies==ncookies){ 
            System.out.println("You have enough cookies and they will devide evenly.");
        }
    }
    
}