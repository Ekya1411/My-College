import java.util.Scanner;
public class ModifForKelipatan08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int kelipatan, jumlah = 0;
        double rata, counter = 0;

        System.out.print("Masukkan bilangan kelipatan (1-9): ");
        kelipatan = scan.nextInt();

        for (int i = 1; i <= 50; i++) {
            if (i % kelipatan == 0) {
                jumlah += i;
                counter++;
            }
        }
        rata = jumlah / counter;

        System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %.0f\n", kelipatan, counter);
        System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, jumlah);
        System.out.printf("Rata-rata dari dari seluruh bilangan kelipatan %d adalah %.2f", kelipatan, rata);
    }
}