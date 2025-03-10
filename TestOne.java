/*Kyle Bishop
Java Test One
March 10 2025*/
import java.util.*;
import java.text.NumberFormat;

public class TestOne {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        double poles;
        double diameter;
        double height;
        double totalVolume;
        double cubicYards;
        double cost;
        System.out.println("how many poles will you need");
        poles = input.nextInt();
        diameter = 3;
        height = 5;
        totalVolume = poles * diameter * height;
        cubicYards = totalVolume / 27;
        cost = cubicYards * 12.98;
        System.out.println("you will need " + cubicYards + " cubic yards of concrete\nThis will cost " + cost + " dollars");















    }

    
}
