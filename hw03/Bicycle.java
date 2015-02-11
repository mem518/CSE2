// Manuel E. Mendez
//2/10/14
//CSE 2
//Bicycle Java Program

//Bicycle program will calculate the distance 
//traveled and the miles per hour

import java.util.Scanner;
//scanner for inputing varriables 

//Public class for Bicycles
public class Bicycle{
    //main method
    public static void main(String[] args) {

       
        Scanner myScanner;
        myScanner=new Scanner(System.in);
        
         //Variables needed for calculations 
       double diameter=27.0;
       double PI=3.141459;
       double feetPerMile=5280;
       double inchesPerFoot=12;
       double secondsPerMinute=60;
       double minutesPerHour=60;
       double distance, totalTime, milesPerHour;
        
        //scanner variables 
        System.out.print("Enter the number of counts: ");
        int nCounts=myScanner.nextInt();
        System.out.print("Enter the time (in seconds): ");
        double nTime=myScanner.nextDouble();
        
        //Calculations
        distance=(double)(((int)(nCounts*PI*diameter)/(inchesPerFoot*feetPerMile)*100)/100);
        
       double minutes=(nTime/secondsPerMinute);
       double hours=(minutes/minutesPerHour);
       
        totalTime=(double)(nTime/secondsPerMinute);
        milesPerHour=((int)(distance/hours*100)/100);
        
        System.out.println("Total distance is "+distance+" miles. \nThe total time was "+
        totalTime+" minutes.");
        System.out.println("The average miles per hour is "+milesPerHour+" miles per hour.");
     
    }//end main method
}//end class