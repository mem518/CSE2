//Manuel E. Mendez
//4/9/14
//CSE 2
//RemoveElements Java Program

//This program manipulates arrays making it a practice hw for arrays.



import java.util.Scanner;
import java.lang.Math;

public class RemoveElements{
  public static void main(String [] args){
    
    Scanner scan=new Scanner(System.in);
    
    int num[]=new int[10];
    int array1[];//array 1
    int array2[];//array 2
    int index;
    int target;
    
    String output="";
    
    do{
      System.out.print("Random input 10 ints [0-9]");
      num=randomInput();//shows the random numbers
      String out="The original array is:";
      out+=listArray(num);
      System.out.println(out);//shows original array
      
      System.out.print("Enter the index ");
      index=scan.nextInt();
      array1=delete(num,index);
      String out1="The output array is ";
      out1+=listArray(array1); //return a string of the form "{6, 1, -5}"  
      System.out.println(out1);
      
      System.out.print("Enter the target value ");
      target=scan.nextInt();
      array2=remove(array1,target);
      String out2="The output array is ";
      out2+=listArray(array2); //return a string of the form "{6, 1, -5}"  
      System.out.println(out2);
      
      System.out.println("Go again? Enter 'y' or 'Y', anything else to quit-");
    
      output=scan.nextLine(); 
    }while(output=="Y" || output=="y");
 
  }
  
  public static String listArray(int num[]){
    String out="{";
    for(int j=0;j<num.length;j++){
      if(j>0){
        out+=", ";
      }
      out+=num[j];
    }
    out+="} ";
    return out;
  }
  
  public static int[] randomInput(){
    int[] random = new int[10];
    for(int i =0; i < 9; i++){
      int randomNum =  (int)(Math.random()*10);
      random[i] = randomNum;
    }
    return random;
  }
  
  public static int[] delete(int[] list, int pos){
    int[] newArray=new int[list.length -1];
    int counter1=0;//counter 1
    int counter2=0;//counter 2
    while(counter1<list.length){
      if(counter1==pos)
        counter1++;
      newArray[counter2]=list[counter2];
      counter1++;//adds a counter
      counter2++;//adds a counter
    }
    return newArray;//returns the value of the array
  }
  
  public static int[] remove(int[] list, int target){
    //scans list for elements that equals target

    int[] listCopy=list;
    int removeCounter=0;
    Boolean elementDeleted=false;
    for(int i=0; i<list.length; i++){ //loops through every element of old list
      if( list[i]==target ){ //removes elements from list
        listCopy=delete(listCopy, (i-removeCounter));
        removeCounter++;

        elementDeleted = true;
      }
    }
    if(elementDeleted){
      System.out.println("The element has been found");
    }
    else{
      System.out.println("The element has not been found");
    }
    
    
    return listCopy;
  }
  

}