import java.util.Random;

/**
 * Created by sbt-panichev-sl on 04.06.2018.
 */
public class Pyzir {
    public static void main(String[] args) {
        int [] m = new int[10];
        Random r = new Random ();
        for (int i=0; i<m.length; i++) {
            m[i]= r.nextInt(10);
            System.out.print(m[i] + " ");
        }
        System.out.println();
        System.out.println();
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length - 1 - i; j++) {
                if (m[j + 1] <= m[j]) {
                    int temp = m[j + 1];
                    m[j + 1] = m[j];
                    m[j] = temp;
                }
            }
            for (int j = 0; j < m.length; j++) { //как перебирает
                System.out.print(m[j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i=0; i<m.length; i++)
            System.out.print(m[i] + " ");
    }
}



