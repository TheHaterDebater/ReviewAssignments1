package Part1;

import java.util.Scanner;

public class Momentum {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double mass, speed, momentum;
        
        System.out.print("Enter object mass > ");
        mass = s.nextDouble();
        System.out.print("Enter object speed > ");
        speed = s.nextDouble();
        momentum = mass * speed;
        System.out.println("The objects momentum is kg-m/s" + momentum);
    }
    
}
