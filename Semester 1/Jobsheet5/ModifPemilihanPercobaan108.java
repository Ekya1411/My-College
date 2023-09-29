import java.util.Scanner;
public class ModifPemilihanPercobaan108 {
    public static void main(String[] args) {
        Scanner input00 = new Scanner(System.in);
    
        System.out.println("Masukkan angka: ");
        int angka = input00.nextInt();
        
        String jenisAngka = (angka%2 == 1) ? "Merupakan bilangan ganjil" : "Merupakan bilangan genap";
        System.out.println(angka + " Merupakan bilangan " + jenisAngka);
}
}
