import java.util.Scanner;
public class Pemilihan2Percobaan3 {
    public static void main(String[] args) {
    Scanner input08 = new Scanner(System.in);

    String kategori;
    int penghasilan, gajibersih;
    double pajak = 0;
    
    System.out.print("Masukkan Kategori : ");
    kategori = input08.nextLine();
    System.out.print("Masukkan Besarnya Penghasilan : ");
    penghasilan = input08.nextInt();

    if (kategori.equalsIgnoreCase("pekerja")) {
        if (penghasilan <= 2000000) {
            pajak = 0.1;
        }else if (penghasilan <= 3000000) {
            pajak = 0.15;
        }else{
            pajak = 0.2;
        }
        gajibersih = (int) (penghasilan - (pajak * penghasilan));
        System.out.print("Gaji Bersih : " + gajibersih);
    }else if (kategori.equalsIgnoreCase("pebisnis")) {
        if (penghasilan <= 2500000) {
            pajak = 0.15;
        }else if (penghasilan <= 3500000) {
            pajak = 0.2;
        }else{
            pajak = 0.25;
        }
        gajibersih = (int) (penghasilan - (pajak * penghasilan));
        System.out.print("Penghasilan bersih : " + gajibersih);
    }else{
        System.out.println("Masukan Kategori Salah");


    }
    }
}
