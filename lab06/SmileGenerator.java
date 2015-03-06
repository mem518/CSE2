// Manuel E. Mendez
//2/17/14
//CSE 2
//ToHex Java Program

//The program will output smiley faces from a random number from 1-30

//for loop of smiley faces
public class SmileGenerator{
  public static void main(String args[]){
        
        
        String finalSmiley1=" ";
        
        int n1;//variable for counter
        for (n1=0; n1<5; n1++){//for loop
            finalSmiley1+=":)";//adds smiley
        }
        System.out.println(finalSmiley1);
    




        
        String finalSmiley2=" ";
        
        int n2;//variable for counter
        n2=0;// initial counter
        while (n2<5){//while loop
            finalSmiley2+=":)";//adds smiley
            n2++; //adds a counter
        }
        System.out.println(finalSmiley2);
    


        
        String finalSmiley3=" ";
        
        int n3;//counter variable
        n3=0;//initial counter
        do{//do loop
            finalSmiley3+=":)";//prints out smiley
            n3++;//adds a counter
        }while(n3<5);//sets the condition
        System.out.println(finalSmiley3);
    


        String finalSmiley4=" ";
        
        int random=(int)(Math.random()*100);
        
        int n4=0;//variable while counter
        int smiley30=n4%30;
        while (n4<random){
            finalSmiley4+=":)";
            n4++;
        }
        while((smiley30==0) && (smiley30<random)){
        System.out.println(finalSmiley4);
        }
        /*while (n4<=random){//while 
        
            finalSmiley4+=":)";//prints out 
            
            System.out.println(finalSmiley4);
            
            n4++;
            
            int smiley30=n4%30;
            
            if (smiley30==0){
                
            System.out.println();    
            }
        }*/
    }
}
