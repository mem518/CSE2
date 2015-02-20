// Manuel E. Mendez
//2/17/14
//CSE 2
//SpaceExploration Java Program

//The program will be able to out put space events 
//from a random year to 2010


//public class for SpaceExploration
public class SpaceExploration{
    //main method
    public static void main(String[] args) {
       
        
        int year=((int)(Math.random()*11)+2000);
        //eqution to get a random number from 2000-2010
        System.out.println("Here is a list of space explorations from "+year+" to 2010.");
        //prints out the range
        switch(year){
            //switch statement for the range
            case 2000:
                //case if the range falls w/in this number
                System.out.println("2000: First spacecraft orbits an asteroid.");
                //output if the range falls w/in the number
            case 2001:
                System.out.println("2001: First spacecraft lands on an asteroid.");
            case 2002:
                System.out.println("2002: N/A.");
            case 2003:
                System.out.println("2003: Largest infared telescope released.");
            case 2004:
                System.out.println("2004: N/A.");
            case 2005:
                System.out.println("2005: Spacecraft collides with comet.");
            case 2006:
                System.out.println("2006: Spacecraft returns with collections from a comet.");
            case 2007:
                System.out.println("2007: N/A.");
            case 2008:
                System.out.println("2008: Kepler launched to study deep space.");
            case 2009:
                System.out.println("2009: N/A.");
            case 2010:
                System.out.println("2010: SpaceX sucessfully sends spacecraft to orbit and back.");
        }//end switch statment 
    }//end main method
}//end class    