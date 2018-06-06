import java.util.Random;

/**
 * Created by sbt-panichev-sl on 04.06.2018.
 */
public class PyzirObr {
    public static void main(String[] args) {
        int[] m = new int[100];
        pyzirMassive(m);
        System.out.println("Новый массив");
        pyzirPrint(m);
        pyzirSort(m);
        System.out.println("Упорядоченный массив");
        pyzirPrint(m);
        pyzirNewMassive(m);
        System.out.println("Развернутый массив");
        pyzirPrint(m);

    }

    //Формируем массив случайных чисел
    public static void pyzirMassive(int[] m) {
        Random r = new Random();
        for (int i = 0; i < m.length; i++) {
            m[i] = r.nextInt(100);
        }
    }


    //Сортировка массива
    public static void pyzirSort(int[] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length - 1 - i; j++) {
                if (m[j + 1] <= m[j]) {
                    int temp = m[j + 1];
                    m[j + 1] = m[j];
                    m[j] = temp;
                }
            }
        }
        System.out.println();
    }

    //Разворачиваем массив
    public static void pyzirNewMassive(int[] m) {
        for (int i = 0; i < m.length / 2; i++) {
            int temp = m[i];
            m[i] = m[m.length - 1 - i];
            m[m.length - 1 - i] = temp;
        }
        System.out.println();
    }

    //Вывод на экран массива
    public static void pyzirPrint(int[] m) {
        for (int i = 0; i < m.length; i++) {
            System.out.print(m[i] + " ");
        }
        System.out.println();
    }
}
