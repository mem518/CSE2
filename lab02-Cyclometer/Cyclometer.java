// Manuel E. Mendez
//1/30/14
//CSE 2
//Cyclometer Java Program

//Program will be able to determine the # of minutes for a trip
//determine the count of rations of the front wheel, determine
//the distance of each trip in miles, and determine the distance
//two trips combined

public class Cyclometer{
    //main mehod
    public static void main(String[] args) {
    int secsTrip1=480; //Variable for time in trip 1
    int secsTrip2=3220; //Variable for time in trip2
    int countsTrip1=1561; //Variable for # of rotations for trip 1
    int countsTrip2=9037; //Variable for # of rotations for trip 2
    
    double wheelDiameter=27.0; //diameter of the wheel
    double PI=3.14159; //PI
    double feetPerMile=5280; //feet in one mile
    double inchesPerFoot=12; //inches in one foot
    double secondsPerMinute=60; ///seconds in one minute
    double distanceTrip1, distanceTrip2, totalDistance; //variables for the distances
    
    System.out.println("Trip 1 took "+(secsTrip1/secondsPerMinute)+
        " minutes and had "+countsTrip1+" counts."); // Print how long &# of counts for trip 1
    System.out.println("Trip 2 took " +
        (secsTrip2/secondsPerMinute)+" minutes and had "+
        countsTrip2+" counts "); // Print how long &# of counts for trip 2
        
    distanceTrip1=countsTrip1*wheelDiameter*PI;
    //Above gives distance in inches
    //(for each count, a rotation of the wheel travels
    //the diameter in inches times PI)
    distanceTrip1/=inchesPerFoot*feetPerMile; //gives the distance in miles
    distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile; //Distance in miles for trip 2
        //Ptint out the data
    totalDistance=distanceTrip1+distanceTrip2; //equation for the total distance
    System.out.println("Trip 1 was "+distanceTrip1+" miles");//print out dis. for trip 1
    System.out.println("Trip 2 was "+distanceTrip2+" miles");//print out dis. for trip 2
    System.out.println("The total distance was "+totalDistance+" miles");//print out the total dis.
    }
}