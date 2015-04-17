// Manuel E. Mendez
//2/17/14
//CSE 2
//WhichNumber Java Program

//The program will output what number the person
//has thought of by asking yes or no questions


import java.util.Scanner;
public class ArraySearch{
    //main method
    public static void main(String[] args) {
        Scanner myScanner;
        myScanner=new Scanner(System.in);
        
    int num1;
    int num2;
    int array1[50];//array 1 size of 50
    int array2[50];//array 2 size of 50
    
    num1=(Math.random();*100);
    num2=(Math.random();*100);
    
    System.out.println("Please enter a positive integer. Anything else to exit.");
    int answer;
    answer=myScanner.nextInt();
    
    if(answer>0){
        
    }
    else{
        System.out.println("Have a nice day.");
    }
    }
}