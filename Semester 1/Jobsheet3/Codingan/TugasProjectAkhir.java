import java.util.Scanner;

public class TugasProjectAkhir {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String nama_produk;
        int jml_produk;
        double harga_produk, total_harga, uang_diberikan, uang_kembalian;
        System.out.print("Masukkan Nama Produk: ");
        nama_produk = input.nextLine();
        System.out.print("Masukkan Harga Produk: ");
        harga_produk = input.nextDouble();
        System.out.print("Masukkan Jumlah Produk: ");
        jml_produk = input.nextInt();
        total_harga = harga_produk * jml_produk;
        System.out.println("Total Harga " + nama_produk + ": "+ total_harga);
        System.out.print("Uang Yang Diberikan: ");
        uang_diberikan = input.nextDouble();
        uang_kembalian = uang_diberikan - total_harga;
        System.out.println("Uang Kembalian: " + uang_kembalian);

    }
}