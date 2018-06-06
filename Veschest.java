import java.util.Random;

/**
 * Created by sbt-panichev-sl on 04.06.2018.
 */
public class Veschest {
    public static void main(String[] args) {
        double s=0;
        double sred = 0;
        Random r = new Random ();
        double [] m = new double[10];
        for (int i=0; i<m.length; i++ ) {
            m[i]= r.nextDouble();
            s +=m[i];
            System.out.print(m[i] + " ");
        }
        sred = s / m.length;
        System.out.println();
        System.out.println ("Среднее равно " + sred);

    }
}
