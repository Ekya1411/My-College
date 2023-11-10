import java.util.Scanner;
public class persegiAngka {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sisi, dalam, spasi;

        System.out.print("Masukkan jumlah sisi dari persegi angka yang ingin dibuat (minimal 3) = ");
        sisi = scan.nextInt();
        dalam = sisi-2;
        spasi = sisi-1;
        for (int i = 3; i <= sisi; i++) {
            spasi += 1;
        }

        for (int i = 0; i < sisi; i++) {
            System.out.print(sisi + " ");
        }
        System.out.println();

        for (int i = 0; i < dalam; i++) {
            System.out.print(sisi);
            for (int j = 0; j < spasi; j++) {
                System.out.print(" ");
            }
            System.out.println(sisi);
        }

        for (int i = 0; i < sisi; i++) {
            System.out.print(sisi + " ");
        }
    }
}
