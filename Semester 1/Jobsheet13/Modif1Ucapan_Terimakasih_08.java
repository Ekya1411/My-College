import java.util.Scanner;
public class Modif1Ucapan_Terimakasih_08 {
    static Scanner sc = new Scanner(System.in);
    public static String PenerimaUcapan() {
        System.out.print("Tuliskan NAMA orang yang ingin anda beri ucapan: ");
        String namaOrang = sc.nextLine();
        return namaOrang;
    }
        public static String UcapanTambahan() {
        System.out.print("Tuliskan ucapan tambahan yang ingin anda ucapkan: ");
        String ucapTambah = sc.nextLine();
        return ucapTambah;
    }
    public static void UcapanTerimaKasih() {
        String nama = PenerimaUcapan();
        String ucapTambah = UcapanTambahan();
        System.out.println("Thank you " + nama + " for being the best teacher in the world.\n" + 
        "You inspired in me a love for learning and made me feel like I could ask you anything.\n" +
        ucapTambah);
        sc.close();
    }

    public static void main(String[] args) {
        UcapanTerimaKasih();
        UcapanTambahan();
    }
}
