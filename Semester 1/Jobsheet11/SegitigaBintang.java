import java.util.Scanner;
public class SegitigaBintang {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int panjang;

        System.out.print("Masukkan bintang tinggi segitiga bintang yang akan dibuat (minimal 3) : ");
        panjang = scan.nextInt();
        System.out.println();
        
        int bintang = panjang;
        for (int p = 0; p <= panjang; p++) {
            for (int i = 1; i <= bintang; i++) {
                System.out.print('*');
            }
            bintang--;
            System.out.println();
        }
    }
}
