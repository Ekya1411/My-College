import java.util.Scanner;
public class Kubus08 {
    public static double HitungVol(double sisi) {
        double vol = sisi * sisi * sisi;
        return vol;
    }
    public static double HitungPer(double sisi) {
        double permukaan = 6 * (sisi * sisi);
        return permukaan;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan sisi dari kubus yang ingin di hitung : ");
        double p = scan.nextDouble();

        double vol = HitungVol(p);
        double per = HitungPer(p);

        System.out.println("Volume kubus anda " + vol + " dengan luas permukaan total " + per);
    }
}
