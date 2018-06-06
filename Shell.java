import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

/**
 * Created by sbt-panichev-sl on 04.06.2018.
 */
public class Shell {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        while (true) {
            System.out.printf(">");
            String s=sca.nextLine();
            switch (s) {
                case "time":
                    System.out.println(LocalTime.now());
                    break;
                case "date":
                    System.out.println(LocalDate.now());
                    break;
                case "exit":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Команда неизвестна");
            }
        }
    }
}
