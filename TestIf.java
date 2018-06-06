/**
 * Created by sbt-panichev-sl on 31.05.2018.
 */
import java.util.Scanner;

public class TestIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a=scanner.nextInt();
        if(a==10)
            System.out.printf("Ten");
        else
            System.out.printf("Other");
    }

}
