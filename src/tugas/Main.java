package tugas;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);

        String kalimat = s.nextLine();

        kalimat = kalimat.toLowerCase();

        int[] jum = new int[256];

        for (int i=0; i<256; i++) {
            jum[i] = 0;
        }

        int jumlahVokal = 0;
        int jumlahKonsonan = 0;
        for (int i=0; i<kalimat.length(); i++) {
            jum[(int)kalimat.charAt(i)]++;
            if (kalimat.charAt(i) == 'a' || kalimat.charAt(i) == 'i' || kalimat.charAt(i) == 'u'
                    || kalimat.charAt(i) == 'e' || kalimat.charAt(i) == 'o') {
                jumlahVokal++;
            }
            else {
                jumlahKonsonan++;
            }
        }

        System.out.println();
        System.out.println("\nJumlah karakter : " + kalimat.length());
        System.out.println("\nJumlah vokal : " + jumlahVokal);
        System.out.println("\nJumlah konsonan : " + jumlahKonsonan);
        System.out.println();
    }
}
