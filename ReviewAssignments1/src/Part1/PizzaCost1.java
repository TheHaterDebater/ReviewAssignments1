package Part1;

import java.util.Scanner;

public class PizzaCost1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int top;
        double total, size;
        final double labour = 1.50, gas = 0.75;
        System.out.print("Enter your pizza size > ");
        size = s.nextInt();
        System.out.print("Enter how many toppings you want > ");
        top = s.nextInt();
        total = (top * 0.75) + (size * 0.50) + labour + gas;
        System.out.format("Total: %.2f\n", total);
    }
    
}
