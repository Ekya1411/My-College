import java.util.Scanner;
public class SegitigaAngka {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int tinggi;
        
        System.out.print("Masukkan tinggi segitiga angka yang akan dibuat(Minimal 3) : ");
        tinggi = scan.nextInt();
        int thinggi [] = new int [tinggi];
        int plus = 1;
        for (int i = 0; i < thinggi.length; i++) {
            thinggi[i] += plus;
            plus++;
        }
        int spasi = tinggi - 1;
        
        for (int i = 0; i < tinggi; i++) {
            for (int j = 0; j < spasi; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(thinggi[j]);
            }
            spasi--;
            System.out.println();
        }

    }

}
