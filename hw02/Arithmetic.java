// Manuel E. Mendez
//2/3/14
//CSE 2
//Arithmatic Java Program

//Define a class
public class Arithmetic{
    //add main method
    public static void main(String [] args) {
        int nSocks=3; //number of pairs of socks 
        double sockCost$=2.58; //Cost per pair of socks
        //('$' is part of the variable name)
        int nGlasses=6; //number of drinking glasses
        double glassCost$=2.29; //cost per glass
        int nEnvelopes=1; //number of boxes of envelopes
        double envelopeCost$=3.25; //cost per box of envelopes
        double taxPercent=0.06; //PA sales tax
        
        //Variables for the totals
        double totalSockCost$; //total cost for socks
        double totalSockTax; //tax on socks
        double totalSockCostandTax; //cost of socks and tax
        
        double totalGlassCost$; //total cost of Glasses
        double totalGlassTax; //Tax on glasses
        double totalGlassCostandTax; //total cost of glasses and tax
        
        double totalEnvelopeCost$; // total cost of the box of envelopes
        double totalEnvelopeTax; //total tax on envelopes
        double totalEnvelopeCostandTax; //total cost of envelopes and tax
        
        double totalCost; //total cost of all the items
        double totalTax; //total tax of all the items
        double totalCostandTax; //total cost of all the items with tax
        
        //equations for the socks
        totalSockCost$=nSocks*sockCost$;
        totalSockTax=taxPercent*totalSockCost$;
        totalSockCostandTax=totalSockCost$+totalSockTax;
        //equations for the Glass
        totalGlassCost$=nGlasses*glassCost$;
        totalGlassTax=totalGlassCost$*taxPercent;
        totalGlassCostandTax=totalGlassCost$+totalGlassTax;
        //equations for the envelopes
        totalEnvelopeCost$=nEnvelopes*envelopeCost$;
        totalEnvelopeTax=totalEnvelopeCost$*taxPercent;
        totalEnvelopeCostandTax=totalEnvelopeCost$+totalEnvelopeTax;
        //equations for the totals
        totalCost=totalSockCost$+totalGlassCost$+totalEnvelopeCost$;
        totalTax=totalSockTax+totalGlassTax+totalEnvelopeTax;
        totalCostandTax=totalCost+totalTax;
        
        //Print out the results for the socks
        System.out.println(nSocks+" pairs of socks are bought.");
        System.out.println("$"+sockCost$+" per pair.");
        System.out.println("The total for the socks is $"+totalSockCost$+".");
        System.out.println("The total tax is $"+((double)((int)(totalSockTax*100))/100)+".");
        System.out.println("The total cost and tax for the socks is $"+((double)((int)(totalSockCostandTax*100))/100)+".");
        //Print out the results for the Glass
        System.out.println(nGlasses+" Glasses are bought.");
        System.out.println("$"+glassCost$+" per glass.");
        System.out.println("The total for the glasses is $"+totalGlassCost$+".");
        System.out.println("The total tax is $"+((double)((int)(totalGlassTax*100))/100)+".");
        System.out.println("The total cost and tax for the glasses is $"+((double)((int)(totalGlassCostandTax*100))/100)+".");
        //Print out the results for the envelopes
        System.out.println(nEnvelopes+" box of envelopes is bought.");
        System.out.println("$"+envelopeCost$+" per box.");
        System.out.println("The total for the envelopes is $"+totalEnvelopeCost$+".");
        System.out.println("The total tax is $"+((double)((int)(totalEnvelopeTax*100))/100)+".");
        System.out.println("The total cost and tax for the envelopes is $"+((double)((int)(totalEnvelopeCostandTax*100))/100)+".");
        //Print out the results for the totals
        System.out.println("Total cost of the purchases is $"+totalCost+".");
        System.out.println("The total sales tax is $"+((double)((int)(totalTax*100))/100)+".");
        System.out.println("Finally, the total cost of the purchases with sales tax is $"+((double)((int)(totalCostandTax*100))/100)+".");
        
        //This ends the program
    }
}