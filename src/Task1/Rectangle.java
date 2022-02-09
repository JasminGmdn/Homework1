package Task1;

import java.util.Scanner;

public class Rectangle {

        static double side1;
        static double side2;

        double areaCalculator() {
            double result;
            result = side1 * side2;
            System.out.println("Площадь прямоугольника = " + result);
            return result;
        }

        double perimeterCalculator(){
            double result;
            result = 2 * (side1 + side2);
            System.out.println("Периметр прямоугольника =  " + result);
            return result;
        }

        public static void main(String[] args) {
            System.out.println("Введите длину первой стороны прямоугольника: ");
            Scanner in = new Scanner(System.in);
            side1 = in.nextInt();


            System.out.println("Введите длину второй стороны прямоугольника: ");
            in = new Scanner(System.in);
            side2 = in.nextInt();

            Rectangle Rectangle = new Rectangle();
            Rectangle.areaCalculator();
            Rectangle.perimeterCalculator();

        }

}
