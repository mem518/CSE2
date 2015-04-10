import java.util.Scanner;

public class methods{
    public static void main(String[] args){
        Scanner myScanner;
        myScanner=new Scanner(System.in);
        
        System.out.println("enter an int ");
        
        int m;
        m=myScanner.nextInt();
        
        System.out.println("enter an int greater than "+m);
        int n;
        n=myScanner.nextInt();
        
        while(n<m){
            System.out.print("Sorry, the second int is not larger. Try again: ");
            n=myScanner.nextInt();
        }
        sum(m, n);
    }
    public static void sum(int a, int b){
        int sum=0;
        for(int x=a; x<=b; x++){
            
            sum+=x;
        }
        for(int y=a; y<=b; y++){
            System.out.print(y);
            for(int z=y; z<b; z++){
                System.out.print("+");
                break;
            }
        }
        System.out.println("="+sum);
        //return sum;
    }
}