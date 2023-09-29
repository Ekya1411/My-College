import java.util.Scanner;
public class PemilihanPercobaan108 {
    public static void main(String[] args) {
        Scanner input08 = new Scanner(System.in);
    
        System.out.println("Masukkan angka: ");
        int angka = input08.nextInt();
        boolean jenisAngka;
        if (angka %2 == 0)
            System.out.println("Angka " + angka + " Bilangan genap");
        else
            System.out.println("Angka " + angka + " Bilangan ganjil");  
    }
}