package Codingan;
import java.util.Scanner;
public class Kasir {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String nama_produk;
        int jml_produk;
        double harga_produk, total_harga, uang_diberikan, uang_kembalian, diskon, total_diskon;

        System.out.print("Masukkan Nama Produk: ");
        nama_produk = input.nextLine();
        System.out.print("Masukkan Harga Produk: ");
        harga_produk = input.nextDouble();
        System.out.print("Masukkan Jumlah Produk: ");
        jml_produk = input.nextInt();
        System.out.print("Masukkan Diskon: ");
        diskon = input.nextInt();

        total_harga = harga_produk * jml_produk;
        total_diskon = total_harga * diskon;
        System.out.println("Total Harga " + nama_produk + " Dengan Jumlah " + jml_produk + ": " + total_diskon);

        System.out.print("Uang Yang Diberikan: ");
        uang_diberikan = input.nextDouble();

        uang_kembalian = uang_diberikan - total_diskon;
        System.out.println("Uang Kembalian: " + uang_kembalian);
    }
}     

