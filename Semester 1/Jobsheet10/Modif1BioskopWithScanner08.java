import java.util.Scanner;

public class Modif1BioskopWithScanner08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int baris, kolom, menu;
        String nama, next, sure;

        String[][] penonton = new String[4][2];

        for (int i = 0; i < penonton.length; i++) {
            for (int j = 0; j < penonton[i].length; j++) {
                penonton[i][j] = "***";
            }
        }
        System.out.println("--Welcome--");
        while (true) {
            System.out.println("Masukkan nomor dari menu yang ingin anda buka");
            System.out.println("1. Input penonton");
            System.out.println("2. Cek daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilihan anda: ");
            menu = sc.nextInt();
            switch (menu) {
                case 1:
                    while (true) {
                        while (true) {
                            System.out.print("Masukkan nama: ");
                            nama = sc.next();
                            System.out.print("Masukkan baris: ");
                            baris = sc.nextInt();
                            System.out.print("Masukkan kolom: ");
                            kolom = sc.nextInt();
                            sc.nextLine();
                            if (baris >= 1 && baris <= 4 && kolom >= 1 && kolom <= 2) {
                                if (!penonton[baris-1][kolom-1].equals("***")) {
                                    System.out.println("Kursi telah dipesan!");
                                } else{
                                    penonton[baris-1][kolom-1] = nama;
                                    break;
                                }
                            } else {
                                System.out.println("Tolong pesan didalam kursi yang tekah disediakan");
                            }
                        }
                        System.out.print("Input penonton lainnya? (y/n): ");
                        next = sc.nextLine();
                        if (next.equalsIgnoreCase("n")) {
                            break;
                        }
                    }
                    break;
                case 2:
                    System.out.printf("%s \t %s \n", penonton[0][0], penonton[0][1]);
                    System.out.printf("%s \t %s \n", penonton[1][0], penonton[1][1]);
                    System.out.printf("%s \t %s \n", penonton[2][0], penonton[2][1]);
                    System.out.printf("%s \t %s \n", penonton[3][0], penonton[3][1]);
                break;
                case 3:
                    System.exit(3);
                default:
                    break;
            }
        }
    }
}
