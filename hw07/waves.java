//Manuel E. Mendez
//2/17/14
//CSE 2
//waves Java Program

//The program will receive an input then make a reapting wave depending on how long the number is

import java.util.Scanner;
//scanner for inputing variables

//public class for waves
public class waves{
    //main method
    public static void main(String[] args) {
        Scanner myScanner;
        myScanner=new Scanner(System.in);
        
        System.out.println("Please enter an intger between 1 and 30.");
        int variable;
        variable=myScanner.nextInt();
        
        
        boolean whichWay=true; //which way the numbers go
        System.out.println("FOR LOOP ");
        for (int x=1; x<=variable; x++){
            if (whichWay==true){//the number goes down
                for (int a=x; a>0; a--){
                    for (int b=a; b>0; b--){
                        System.out.print(x);
                    }
                    System.out.println();
                }
            }
            else{ //the number goes up
                for (int a=1; a<=x; a++){
                    for (int b=a; b>0; b--){
                        System.out.print(x);
                    }
                    System.out.println();
                }
            }
            whichWay=!whichWay;
        }
        
        System.out.println("\nWHILE LOOP: ");
        int x=1;
        while (x<=variable){//controls the number
            if (whichWay==true){// the number goes down
                int c=x;
                while (c>0){
                    int d=c;
                    while (d>0){
                        System.out.print(x);
                        d--;
                    }
                    System.out.println();
                    c--;
                }
            }
            else{ //builds up
                int e=1;
                while (e<=x){
                    int f=e;
                    while (f>0){
                        System.out.print(x);
                        f--;
                    }
                    System.out.println();
                    e++;
                }
            }
            whichWay=!whichWay;
            x++;
        }
        
        System.out.println("\nDO-WHILE LOOPS: "); //controls the variable with a do-while loop
        int g=1;
        do{ //controls the variable with a do-while loop
            if (whichWay==true){
                int c=g;
                do{
                    int d=c;
                    
                    do{ 
                        System.out.print(g);
                        d--;
                    }while(d>0);
                    System.out.println();
                    c--;
                }while (c>0);
            }
            else{ //builds up
                int e=1;
                do{
                    int f=e;
                    do{
                        System.out.print(g);
                        f--;
                    }while(f>0);
                    System.out.println();
                    e++;
                }while (e<=g);
            }
            whichWay=!whichWay;
            g++;
        }while(g<=variable);
    }
}