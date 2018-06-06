import java.util.Random;

/**
 * Created by sbt-panichev-sl on 04.06.2018.
 */
public class Maksim {
    public static void main(String[] args) {
        int [] a = new int [10];
        Random r = new Random();
        for (int i=0; i<a.length; i++) {
            a [i] = r.nextInt(100);
            System.out.println (a[i] + " ");
        }
        int MAX=a[0];
        int MIN=a[0];
        for (int i=0; i< a.length; i++ ) {
            if (a[i]>=MAX)
                MAX=a[i];
            if (a[i]<=MIN)
                MIN=a[i];
        }
        System.out.println("");
        System.out.println("MAX " + MAX);
        System.out.println("MIN " + MIN);
    }
}
