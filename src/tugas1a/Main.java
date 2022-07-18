package tugas1a;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);

        String kalimat = s.nextLine();

        kalimat = kalimat.toLowerCase();
        boolean hasil=false;

        int[] jum = new int[256];

        for (int i=0; i<256; i++) {
            jum[i] = 0;
        }

        int jumlahX = 0;
        int jumlahO = 0;
        for (int i=0; i<kalimat.length(); i++) {
            jum[(int)kalimat.charAt(i)]++;
            if (kalimat.charAt(i) == 'x') {
                jumlahX++;
            }
            else {
                jumlahO++;
            }
        }

        System.out.println();
        if(jumlahO==jumlahX){
            hasil = true;
        }

        System.out.println("\nOutput : " + hasil);
        System.out.println("\nJumlah X : " + jumlahX);
        System.out.println("\nJumlah O : " + jumlahO);
        System.out.println();
    }
}
