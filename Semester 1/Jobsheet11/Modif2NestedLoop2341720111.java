import java.util.Scanner;
public class Modif2NestedLoop2341720111 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] temps = new double[5][7];
        int i = 0;
        double rata;
        double [] total = new double[5];

        for (double[] p : temps) {
            System.out.println("Kota ke-" + (i + 1));
            int j = 0;
            for (double temp : p) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                temps[i][j] = scanner.nextDouble();
                total [i] += temps [i][j];
                j++;
            }
            i++;
            System.out.println();
        }

        i = 0; 
        for (double[] p : temps) {
            System.out.print("Kota ke-" + (i + 1) + ": ");
            for (double temp : p) {
                System.out.print(temp + " ");
            }
            System.out.println();
            rata = total [i]/temps[0].length;
            System.out.println("Rata-rata dari kota ke-" + i + " adalah " + rata);
            i++;
        }
    }
}
