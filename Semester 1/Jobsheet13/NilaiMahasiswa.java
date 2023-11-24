import java.util.Scanner;

public class NilaiMahasiswa {

    public static double[][] inputNilai(double nilai[][], String[] namaMahasiswa) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Input nilai " + namaMahasiswa[i] + ": ");
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Minggu ke-" + (j + 1) + " : ");
                nilai[i][j] = scan.nextDouble();
            }
        }
        System.out.println("===============================================");
        return nilai;
    }

    public static void tampil(double[][] nilai, String namaMahasiswa[]) {
        System.out.println("Nilai Mahasiswa:");
        for (int i = 0; i < nilai.length; i++) {
            System.out.print(namaMahasiswa[i] + ": ");
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print(nilai[i][j] + "    ");
            }
            System.out.println();
        }
        System.out.println("===============================================");
    }

    public static int cariOrang(double[][] nilai) {
        int orangTertinggi = 0;
        int nilaiTertinggi = 0;
        for (int i = 0; i < nilai.length; i++) {
            int totalNilai = 0;
            for (int j = 0; j < nilai[i].length; j++) {
                totalNilai += nilai[i][j];
            }
            if (totalNilai > nilaiTertinggi) {
                nilaiTertinggi = totalNilai;
                orangTertinggi = i;
            }
        }
        System.out.println("===============================================");
        return orangTertinggi;
    }

    static int cariMinggu(double[][] nilai) {
        int mingguTertinggi = 0;
        double nilaiTertinggi = 0;
    
        for (int i = 0; i < nilai.length; i++) {
            for (int j = 0; j < nilai[i].length; j++) {
                if (nilai[i][j] > nilaiTertinggi) {
                    nilaiTertinggi = nilai[i][j];
                    mingguTertinggi = j + 1;
                }
            }
        }
        System.out.println("===============================================");
    
        return mingguTertinggi;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean kondisi = true;

        System.out.println("=== Welcome ===");
        System.out.print("Silahkan masukkan jumlah murid anda : ");
        int jum = scan.nextInt();

        System.out.print("Silahkan masukkan jumlah tugas yang anda berikan : ");
        int tug = scan.nextInt();

        double[][] nilai = new double[jum][tug];
        String[] namaMahasiswa = new String[jum];
        System.out.println("Silahkan masukkan nama-nama murid anda: ");
        for (int i = 0; i < namaMahasiswa.length; i++) {
            System.out.print("Murid ke-" + (i + 1) + " : ");
            namaMahasiswa[i] = scan.next();
        }
        System.out.println("===============================================");

        while (kondisi) {
            int no = cariMinggu(nilai);

            System.out.println("--Main Menu--");
            System.out.println("Input angka sesuai dengan pilihan dibawah");
            System.out.println("1. Input nilai");
            System.out.println("2. Menampilkan nilai");
            System.out.println("3. Menampilkan minggu ke berapa terdapat nilai paling tinggi");
            System.out.println("4. Menampilkan nama murid dengan nilai tertinggi");
            System.out.println("5. Exit program");
            System.out.print("Jawaban anda : ");
            int n = scan.nextInt();
            switch (n) {
                case 1:
                    inputNilai(nilai, namaMahasiswa);
                    break;
                case 2:
                    tampil(nilai, namaMahasiswa);
                    break;
                case 3:
                    
                    System.out.println("Nilai tertinggi ditemukan pada minggu ke-"+ no);
                    break;
                    case 4:
                    int tinggi = cariOrang(nilai);
                    System.out.println("Murid dengan nilai tertinggi adalah " + namaMahasiswa[tinggi] + " pada minggu ke-" + no);
                    break;
                    case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Tolong berikan inputan yang benar");
                    System.out.println("===============================================");
                    break;
            }
        }
    }
}