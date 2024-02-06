import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        System.out.print("Masukan angka: ");
        try (Scanner input = new Scanner(System.in)) {
            int num = input.nextInt();
            
            for (int i = 1; i <= num; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("  " + i*j);
                }

                System.out.print("\n");
            }
        }
    }
}