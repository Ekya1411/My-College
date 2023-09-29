import java.util.Scanner;
public class ModifPemilihanPercobaan208 {
    public static void main(String[] args) {
    Scanner input00 = new Scanner(System.in);
    
    float uas, uts, kuis, tugas, total;
    String message, nilai;

    System.out.print("Nilai UAS       : ");
    uas = input00.nextFloat();
    System.out.print("Nilai UTS       : ");
    uts = input00.nextFloat();
    System.out.print("Nilai Kuis      : ");
    kuis = input00.nextFloat();
    System.out.print("Nilai tugas     : ");
    tugas = input00.nextFloat();

    total = (uas *0.4f) + (uts * 0.3f) + (kuis * 0.1f) + (tugas * 0.2f);

    if(total >80 && total <=100)
        nilai = "A";
    else if(total > 73 && total <= 80)
        nilai = "B+";
    else if(total > 65 && total <= 73)
        nilai = "B";
    else if(total > 60 && total <= 65)
        nilai = "C+";
    else if(total > 50 && total <= 60)
        nilai = "C";
    else if(total > 39 && total <= 50)
        nilai = "D";
    else nilai = "E";

    message = total < 65 ? "Remidi" : "Tidak remidi ";
    System.out.println("Nilai akhir = " + nilai + " dengan nilai total = " + total + " sehingga " + message);
}
}
