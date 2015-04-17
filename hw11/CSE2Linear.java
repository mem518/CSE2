//Manuel E. Mendez
//4/9/14
//CSE 2
//RemoveElements Java Program

//This program manipulates arrays making it a practice hw for arrays.



import java.util.Scanner;

public class CSE2Linear{
  public static void main(String [] args){
    
    Scanner scan=new Scanner(System.in);
    
    int grades[]=new int[15];
    
    accept(grades);
    
    System.out.println("The array is:");
    for(int i=0; i<grades.length; i++){
        System.out.println(grades[i]+" ");
    }
    
    binarySearch(grades);
    
    shuffle(grades);
    
    System.out.println("Enter a grade to look for.");
    linearSearch(grades);
    
    
  }
  
  public static void accept(int [] list){
    java.util.Scanner Scanner=new java.util.Scanner(System.in);    
      System.out.println("Please enter 15 integers for students grades in accending order.");
      boolean check=false;
      
      for(int i=0; i<list.length; i++){
          list[i]=Scanner.nextInt();
          while(check==false){
              if(Scanner.hasNextInt()){
                  check=true;
              }
              else{
                  System.out.println("Invalid input. Please enter an int.");
                  list[i]=Scanner.nextInt();
              }
          }
          if(list[i]<0 || list[i]>100){
              System.out.println("Invalid input. Grades must be from 0-100. Enter again");
              list[i]=Scanner.nextInt();
          }
          if(list[i]<list[i-1]){
              System.out.println("Invalid input. The input must be greater than last input. Enter a greater input.");
              list[i]=Scanner.nextInt();
          }
      }
  }
  
  public static void binarySearch(int [] list){
    java.util.Scanner Scanner=new java.util.Scanner(System.in);
      int key;
      int mid;
      int iterations=0;
      int low=0;
      int high=list.length-1;
      mid=(low+high)/2;
      
      System.out.println("Enter a grade to look for.");
      key=Scanner.nextInt();
      
      while(high>=low){
          if(key<list[mid]){
              high=mid-1;
          }
          else if(key==list[mid]){
              System.out.println(key+" was found.");
          }
          else{
              low=mid+1;
          }
          iterations++;
      }
      if(key<mid || key>mid){
          System.out.println(key+" was not found.");
      }
      System.out.println("It took "+iterations+" iterations.");
  }
  
  public static void shuffle(int [] list){
    for(int i=0; i<list.length; i++){
      int j=(int)(Math.random()*list.length);
      
      int temp=list[i];
      list[i]=list[j];
      list[j]=temp;
    }
    System.out.println("The shuffled array is:");
    for(int i=0; i<list.length; i++){
        System.out.println(list[i]+" ");
    }
  }
  
  public static void linearSearch(int [] list){
    java.util.Scanner Scanner=new java.util.Scanner(System.in);
   System.out.println("Enter a grade to look for.");
    int key;
    key=Scanner.nextInt();
    int iterations=0;
    for(int i=0; i<=list.length; i++){
      iterations++;
      if(key==list[i]){
        System.out.println(key+" was found with "+iterations+" iterations.");
        break;
      }
      if(list[i]==list.length){
        System.out.println(key+" was found with "+iterations+" iterations.");
        break;
      }
    }
  }
}