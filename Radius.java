import java.util.Scanner;
import java.lang.Math;


public class Radius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Задайте радиус окружности: ");
        double r=scanner.nextDouble();
        double sqr=Math.PI * r * r;
        System.out.println("Результат:" + sqr);
    }
}