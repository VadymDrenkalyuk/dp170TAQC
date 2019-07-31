package dp170.chessBoard;

import java.util.Scanner;

public class GrandmastersDream {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

       ChessBoard myChessBoard = new ChessBoard(myScanner);

       myChessBoard.enterTheBoardSize();
       myChessBoard.drawYourChessBoard();
    }
}
