package org.example.tictactoe;

import java.util.Scanner;

public class TicTacToeCommand implements Runnable {

    private TicTacToeGame game = new TicTacToeGame();
    @Override
    public void run() {
        // If no move is provided, start the interactive mode
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your move (row and column): ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();
            game.makeMove(row, col);
            game.printBoard();

            char winner = game.checkWinner();
            if (winner != '-') {
                System.out.println("Player " + winner + " wins!");
                break;
            } else if (game.isBoardFull()) {
                System.out.println("It's a draw!");
                break;
            }
        }
    }
}
