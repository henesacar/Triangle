import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int data;
        System.out.print("Basamak sayısını girin: ");
        data = scn.nextInt();

        for (int i = data - 1; i >= 0 ; i--) {
            for (int j = 0; j < (data - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
