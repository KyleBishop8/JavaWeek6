/*Kyle Bishop
Java Test Two
March 10 2025*/
import java.util.*;
import java.text.NumberFormat;
public class TestTwo {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        NumberFormat money = NumberFormat.getCurrencyInstance();

        int M;
        int N;
        int sideOne;
        int sideTwo;
        int hypotenuse;
        double Cost;
        System.out.println("Enter two integers, M and N, with M being greater than N");
        System.out.print("M = ");
        M = input.nextInt();
        System.out.print("N = ");
        N = input.nextInt();
        sideOne = M * M - N * N;
        sideTwo = 2 * M * N;
        hypotenuse = M * M + N * N;
        System.out.println("The sides of your right triangle are: " + sideOne + ", " + sideTwo + ", " + hypotenuse);
        Cost = 2.412 * sideOne + 3.767 * sideTwo + 15.758 * hypotenuse;
        System.out.println("The cost for this would be: " + money.format(Cost));









    }
    
}
