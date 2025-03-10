import java.util.*;
/*** Stella Bertoli
 * 3/10/2025
 * Concrete.java
 * Determine the cost of buying concrete
 */

public class Concrete {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many poles do you need? ");
        int poles = input.nextInt();
        input.close();
        int numberOfPads = poles;
        double r = 1.5;
        double h = 5.0;
        double volume = 3.14*(r*r)*h;
        double cubicFeet = volume*(double)numberOfPads;
        double cubicYards = cubicFeet/27.0;

        double money = cubicYards*12.98;

        System.out.println("You will need " + cubicYards + " cubic yards of concrete for " + money + " dollars");
    }
    
}
