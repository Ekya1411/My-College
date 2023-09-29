package Codingan;
import java.util.Scanner;
public class StudiKasus08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int JmlhBuku;
        float PtngnHarga = 0.01f, HrgBuku, TotHarga, HrgStlhDskn;

        System.out.println("Masukkan harga buku(lusin): ");
        HrgBuku = input.nextInt();
        System.out.println("Masukkan jumlah (lusin) buku yang dibeli: ");
        JmlhBuku = input.nextInt();

        HrgStlhDskn = HrgBuku*PtngnHarga;
        System.out.println("Harga");
        TotHarga = HrgStlhDskn*JmlhBuku;


    }
}
