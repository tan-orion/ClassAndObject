package QuadraticEquation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a");
        double a= sc.nextDouble();
        System.out.println("Enter b");
        double b= sc.nextDouble();
        System.out.println("Enter c");
        double c= sc.nextDouble();
        QuadraticEquation quadraticEquation=new QuadraticEquation(a,b,c);
        quadraticEquation.getAnsewr();

    }
}
