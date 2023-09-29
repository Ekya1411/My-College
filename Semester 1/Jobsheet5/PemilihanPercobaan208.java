import java.util.Scanner;
public class PemilihanPercobaan208 {
    public static void main(String[] args) {
    Scanner input00 = new Scanner(System.in);
    
    float uas, uts, kuis, tugas, total;

    System.out.print("Nilai UAS       : ");
    uas = input00.nextFloat();
    System.out.print("Nilai UTS       : ");
    uts = input00.nextFloat();
    System.out.print("Nilai Kuis      : ");
    kuis = input00.nextFloat();
    System.out.print("Nilai tugas     : ");
    tugas = input00.nextFloat();

    total = (uas *0.4f) + (uts * 0.3f) + (kuis * 0.1f) + (tugas * 0.2f);
    String message = total < 65 ? "Remidi" : "Tidak remidi ";
    System.out.println("Nilai akhir = " + total + " sehingga " + message);
    }
}
