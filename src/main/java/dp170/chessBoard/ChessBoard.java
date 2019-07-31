package dp170.chessBoard;

import java.util.Scanner;

public class ChessBoard {
    public String oddString = "";
    public String evenString = "";
    public int height;
    public int width;
    public Scanner scan;

    public ChessBoard(Scanner scan) {
        this.scan = scan;
    }

    public void enterTheBoardSize() {
/**Check if entered value for height is integer*/
        boolean isHeightPositiveInteger = false;
        Scanner heightSize = new Scanner(System.in);

        while (!isHeightPositiveInteger) {
            System.out.print("Enter the board height: ");

            if (heightSize.hasNextInt()) {
                height = heightSize.nextInt();
                if (height > 0) {
                    isHeightPositiveInteger = true;
                }
            }

            if (!isHeightPositiveInteger) {
                heightSize.nextLine();
                System.out.println("Enter a positive Integer value for height");
            }
        }

/**Check if entered value for width is integer*/

        boolean isWidthPositiveInteger = false;
        Scanner widthSize = new Scanner(System.in);

        while (!isWidthPositiveInteger) {
            System.out.print("Enter the board width: ");

            if (widthSize.hasNextInt()) {
                width = widthSize.nextInt();
                if (width > 0) {
                    isWidthPositiveInteger = true;
                }
            }

            if (!isWidthPositiveInteger) {
                widthSize.nextLine();
                System.out.println("Enter a positive Integer value for width");
            }
        }
    }

    public void drawYourChessBoard() {
        for (int i = 1; i <= width; i++) {
            if ((i % 2) == 0) {
                oddString += "*";
                evenString += " ";
            } else {
                oddString += " ";
                evenString += "*";
            }
        }

        for (int i = 1; i <= height; i++) {
            if ((i % 2) == 0) {
                System.out.println(oddString);
            } else {
                System.out.println(evenString);
            }
        }
    }
}
