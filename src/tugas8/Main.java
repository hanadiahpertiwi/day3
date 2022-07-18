package tugas8;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Masukkan rentang perkalian:");

        int x=input.nextInt();

        System.out.println("\t Tabel Perkalian 1-"+x);

        for (int i = 1; i <= x; i++) {

            for(int j = 1; j <= x; j++){

                System.out.print(" " + i * j + "\t");
            }
            System.out.print("\n\n");
        }
    }
}
