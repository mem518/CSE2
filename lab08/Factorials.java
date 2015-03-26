//Manuel E. Mendez
//3/17/14
//CSE 2
//Factorials Java Program

//

import java.util.Scanner;
//scanner for inputing variables

//public class for Factorials
public class Factorials{
    //main method
    public static void main(String[] args) {
        Scanner myScanner;
        myScanner=new Scanner(System.in);
        
        System.out.println("Enter a number for the super factorial: ");//asks the user for an input
        int n;
        n=myScanner.nextInt();
        int factorial=1;
        
        if(n>1){
            for(int x=2; x<=n; x++){
                factorial=factorial*x;
                
            }
        }
        print(factorial);
        //return factorial;
    }
    
    public static int factorial(int input){
        int mul=1;
        for(int i=1; i<=input; i++){
            mul*=i;
        }
        System.out.println(mul);
        return mul;
    }
    
    /*
    int sf 
    for(int j=n; j>0; J--){
        for(int i=0; i>j; i++){
            //FACTORIAL  
                --> more than 1 loop 
        }
        //ADDING
    }
    */
    
    public static void print(int sum){
        System.out.println("The super factorial is: "+sum);
    }
}
        