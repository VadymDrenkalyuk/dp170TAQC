package dp170.elementaryTasks;

import java.util.Scanner;

public class ChessBoard {
    public static void main(String[] args) {
        Scanner boardSize = new Scanner(System.in);
        System.out.println("Enter the board height");
        int height = boardSize.nextInt();
        System.out.println("Enter the board width");
        int width = boardSize.nextInt();

        if (height < 0) {
            System.out.println("Please enter a positive number for height");
        }
        if (width < 0) {
            System.out.println("Please enter a positive number for width");
        }

        String a = "";
        String b = "";

        for (int i = -3; i <= width; i++) {
            if ((i % 2) == 0) {
                a += " *";
            } else {
                b += "* ";
            }
        }

        for (int i = 1; i <= height; i++) {
            if ((i % 2) == 0) {
                System.out.println(a);
            } else {
                System.out.println(b);
            }
        }
    }
}



