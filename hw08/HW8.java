//Manuel E. Mendez
//3/24/15
//CSE2
//HW08-MG Game

//This program is a game that depends on what the user inputs.
//The game also relies on multiple methods

import java.util.Scanner;
public class HW8{
  public static void main(String [] args){
      char option;
      Scanner scan=new Scanner(System.in);
      
      System.out.println("Welcome to MG's adventure world. Now your journey begins. Good Luck!");
      
      System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
      String input=getInput(scan, "Cc");
      System.out.println("You are now in a dead valley.");
      System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
      input=getInput(scan, "Cc");
      System.out.println("You walked and walked and walked and you saw a cave!");
      cave();
      System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
      input=getInput(scan, "Cc");
      System.out.println("You entered a cave!");
      System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
      input=getInput(scan, "Cc");
      System.out.println("Unfortunately, you ran into a GIANT!");
      giant();
      System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'e' to Escape, Anything else to YIELD");
      input=getInput(scan, "AaEe", 10);
      System.out.println("Congratulations! You SURVIVED! Get your REWARD!");
      System.out.println("There are 3 treasure box in front of you! Enter the number you want to open!");
      box();
      input=getInput(scan);
      System.out.println("Hero! Have a good day!");
  }
  
  public static void giant() {
      System.out.println("                                 ---------                    ");
      System.out.println("                                |  /    \\|                   ");
      System.out.println("                      ZZZZZH    |    O    |    HZZZZZ             ");
      System.out.println("                           H     -----------   H              ");
      System.out.println("                      ZZZZZHHHHHHHHHHHHHHHHHHHHHZZZZZ                   ");
      System.out.println("                           H    HHHHHHHHHHH    H                      ");
      System.out.println("                      ZZZZZH    HHHHHHHHHHH    HZZZZZ               ");
      System.out.println("                                HHHHHHHHHHH                   ");
      System.out.println("                                HHH     HHH                   ");
      System.out.println("                               HHH       HHH                   ");
    }
    
    public static void cave() {
      System.out.println("                              *****   * * * * * * * *        ");
      System.out.println("                         ***         ***                      ");
      System.out.println("                      ***               ***                   ");
      System.out.println("                 |    ***               ***                   ");
      System.out.println("                 |    ***               ***                   ");
      System.out.println("             O __|__  ***               ***                   ");
      System.out.println("           ******l    ***               ***                   ");
      System.out.println("            * *       ***               ***                   ");
      System.out.println("           *   *      ********************* * * * * * *       ");
    }
    
    public static void box(){
      System.out.println("                     *********************     *********************    *********************             ");
      System.out.println("                     ***               ***     ***               ***    ***               ***              ");
      System.out.println("                     ***       1       ***     ***       2       ***    ***       3       ***              ");
      System.out.println("                     ***               ***     ***               ***    ***               ***              ");
      System.out.println("                     *********************     *********************    *********************               "); 
    }
    
    public static String getInput(Scanner scan, String string){
      
      String step=scan.next();  
      if(step.equals("C")|| step.equals("c")){
        return step;
      }
      else{
        System.out.println("Yeah right LOSER!");
        System.exit(0);
      }
      return step; 
    }
    
      public static String getInput(Scanner scan, String string, int trial){
      String hit="";
      boolean hitB=true;
      int escape=0;
      
      while(hitB){
        hit=scan.next();
        if(hit.equals("A") || hit.equals("a")){
          escape=(int)(Math.random()*10 + 1);
          if(escape%2==0){
            System.out.println("Critical Hit!");
            trial--;
          }
          else{
            System.out.println("Gosh! How can you miss it!");
          }
          System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
        }
        
        else if(hit.equals("E") || hit.equals("e")){
          escape=(int)(Math.random()*10 + 1);
          if(escape==10){
            System.out.println("You've escaped the giant!");
            hitB=false;
          }
          else{
            System.out.println("Failed to escape the giant");
          }
          System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
        }
        
        else{
          System.out.println("Executed by giant! GAME OVER!");
          System.exit(0);
        }
        if(trial==0){
          System.out.println("Congratulations! You SURVIVED! Get your REWARD!");
          hitB = false;
        }
      }
      return hit;
    } 
      
    public static String getInput(Scanner scan){
      String reward="";
      if(scan.hasNextInt()){
        int choice=scan.nextInt();
        switch (choice){
          case 1: reward="It's a solid gold coin! Have a good day!";
          break;
          case 2: reward="It's one million dollars! Have a good day!";
          break;
          case 3: reward="It's an old shoe! Have a good day!";
          break;
          default: reward="A Wrong Number! You get nothing! Better restart the game LOL";
          break;
        }
        System.out.println(reward);
      }
      else{
        System.out.println("A Wrong Input! You get nothing! Better restart the game LOL");
      }
      return reward;
    }
}