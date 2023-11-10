import java.util.Scanner;
public class Modif1NestedLoop2341720111 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] temps = new double[5][7];
        int i = 0;

        for (double[] p : temps) {
            System.out.println("Kota ke-" + (i + 1));
            int j = 0;
            for (double temp : p) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                temps[i][j] = scanner.nextDouble();
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
            i++;
            System.out.println();
        }
    }
}
