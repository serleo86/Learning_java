/**
 * Created by sbt-panichev-sl on 04.06.2018.
 */
public class TablYmn {
    public static void main(String[] args) {
        int [] [] m = new int [10][10];
        for (int i =0; i<m.length; i++) {
            for (int j =0; j<m.length; j++) {
                m[i][j] = (i+1) * (j+1);
            }
        }
        for (int i=0; i<m.length; i++) {
            for (int j=0; j<m.length; j++) {
                System.out.print (m[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
