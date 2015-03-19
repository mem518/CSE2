// Manuel E. Mendez
//2/17/14
//CSE 2
//zigzag Java Program

//The program will output the factorial of an input


import java.util.Scanner;
//scanner for inputing variables

//public class for zigzag
public class zigzag{
    //main method
    public static void main(String[] args){
        Scanner myScanner;
        myScanner=new Scanner(System.in);
        
        int nStars;
        nStars=10;
        
        int loopCount1;
        loopCount1=0;
        String finalStars="";
        while (loopCount1<nStars){
            finalStars+="*";
            loopCount1+=1;
        }
        System.out.println(finalStars);
        
        String crossStars="*";
        int loopCount2;
        loopCount2=0;
        while (loopCount2<nStars){
            crossStars+=" ";
            loopCount2+=1;
            System.out.println(crossStars);
        }    
    }
}