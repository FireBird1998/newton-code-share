package loops;

import java.util.Scanner;

public class LoopsExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        //print 1 2 3 ...n
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // print 2 4 6 8..n
        for (int i = 2; i <= n; i = i + 2) {
            System.out.print(i + "");
        }
        System.out.println();

        // print 1 3 5 7 .. n
        for (int i = 1; i <= n; i = i + 2) {
            System.out.print(i + "");
        }
        System.out.println();

    }
}
