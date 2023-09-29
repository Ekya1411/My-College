package Codingan;
import java.util.Scanner;
public class Gaji08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int BsrnGaji, BsrnPotGaji, jmlMasuk, JmlTdkMasuk, TotGaji;

        System.out.println("Masukkan besaran gaji anda perhari: ");
        BsrnGaji = input.nextInt();
        System.out.println("Masukkan besaran potongan gaji anda apabila tidak masuk kerja: ");
        BsrnPotGaji = input.nextInt();
        System.out.println("Masukkan jumlah hari kerja anda: ");
        jmlMasuk = input.nextInt();
        System.out.println("Masukkan jumlah hari tidak masuk kerja anda: " );
        JmlTdkMasuk = input.nextInt();
        
        TotGaji = (jmlMasuk*BsrnGaji)-(JmlTdkMasuk*BsrnPotGaji);
        System.out.println("Gaji yang anda terima adalah: " + TotGaji);
    }
}
