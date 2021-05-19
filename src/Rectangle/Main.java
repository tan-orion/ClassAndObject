package Rectangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        double a = sc.nextDouble();
//        double b=sc.nextDouble();
//
//        Rectangle rect=new Rectangle();
//        rect.width=sc.nextDouble();
//        rect.height= sc.nextDouble();
//        Rectangle rect2=new Rectangle(a,b);
//        System.out.println(rect2.display());
// ................................................
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter the width:");
//        double width = scanner.nextDouble();
//        System.out.print("Enter the height:");
//        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(5, 4);
        System.out.println("Your Rectangle \n"+ rectangle.display());
        System.out.println("Perimeter of the Rectangle: "+ rectangle.getPerimeter());
        System.out.println("Area of the Rectangle: "+ rectangle.getArea());


    }
}
