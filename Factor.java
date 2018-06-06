import java.util.Scanner;

/**
 * Created by sbt-panichev-sl on 04.06.2018.
 */
public class Factor {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.print("Введите число ");
        int n=sca.nextInt();
        int fact=1;
        for (int i=1; i<=n; i++) {
            fact *= i;
        }
        System.out.printf("Факториал равен " + fact);

    }

}


