package arithmetic;
import java.util.Scanner;

public class Arithmetic {

    public static void main(String[] args) {
        Scanner scanstr = new Scanner(System.in);
        
        //user input College Finance Calculations
        System.out.println("What is the total cost of a 4 year college?");
        float annual = scanstr.nextFloat();
        scanstr.nextLine();
        
        System.out.println("How much money can you save in a month per year for this college?");
        float month = scanstr.nextFloat();
        scanstr.nextLine();
        
        System.out.println("How much in additional gift money or scholarship will be given to you?");
        float scholarship = scanstr.nextFloat();
        scanstr.nextLine();
        
        System.out.println("How many more years until you can attend this college?");
        int years = scanstr.nextInt();
        scanstr.nextLine();
        
        //Calculations of input
        float college;
        college = annual - ((month * 12) * years) - scholarship;
        System.out.println("Your cost of college is " + college  + ".");
        
    }
    
}

