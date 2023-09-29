package Codingan;
import java.util.Scanner;
public class HargaBayar08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String Judul;
        int harga, jumlah, hlmn;
        double dis, total, bayar, jmlDis;

        System.out.print("Masukkan judul buku yang dibeli: ");
        Judul = input.nextLine();
        System.out.print("Masukkan harga buku yang dibeli: ");
        harga = input.nextInt();
        System.out.print("Masukkan jumlah buku yang dibeli: ");
        jumlah = input.nextInt();
        System.out.print("Masukkan jumlah halaman buku yang dibeli: ");
        hlmn = input.nextInt();
        System.out.print("Masukkan jumlah diskon: ");
        dis = input.nextDouble();

        total = harga * jumlah;
        jmlDis = total * dis;
        bayar = total - jmlDis;

        System.out.println("Diskon yang anda dapatkan adalah " + jmlDis );
        System.out.println("Jumlah yang harus dibayar adalah " + bayar);
        System.out.println("Buku " + Judul + " dengan halaman " + "berjumlah " + jumlah + hlmn + " Laskar berharga " + bayar);
    }
} 


