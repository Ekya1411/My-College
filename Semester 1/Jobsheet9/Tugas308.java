import java.util.Scanner;

public class Tugas308 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, i, tinggi = 0, rendah = 0;
        float jumlah = 0, rata = 0;

        System.out.print("Input jumlah bilangan: ");
        n = input.nextInt();

        int[] arr = new int[n];

        for(i = 0; i < n; i++) {
            System.out.print("Input bilangan ke-" + (i+1) + " : ");
            arr[i] = input.nextInt();
            jumlah += arr[i];
            if(i == 0) {
                tinggi = arr[i];
                rendah = arr[i];
            }
            else {
                if(arr[i] > tinggi) {
                    tinggi = arr[i];
                }
                if(arr[i] < rendah) {
                    rendah = arr[i];
                }
            }
        }

        rata = jumlah / n;

        System.out.println("Bilangan tertinggi: " + tinggi);
        System.out.println("Bilangan terendah: " + rendah);
        System.out.println("Rata rata dari bilangan: " + rata);
    }
}