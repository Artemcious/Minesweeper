import cells.Cell;

import java.util.Scanner;

public class Field {

    final private Cell[][] field = new Cell[9][9];
    final private Scanner s = new Scanner(System.in);
    private int countMines;
    int x;
    int y;
    boolean winCondition = true;

    public void appRun() {
        greetingsPlayer();
        creationField();
        playing();
    }

    private void greetingsPlayer() {
        System.out.println("Welcome to game Minesweeper! I hope u know rules.");
        System.out.println("_ Select number of mines!");
        countMines = s.nextInt();
        System.out.println("Memo rules: Select coordinates x/y and action ( 1 2 open, 5 5 flag )");
    }

    private void creationField() {
        for (int i = 0; i < 9;i++) {
            for (int j = 0; j < 9;j++) {
                field[i][j] = new Cell();
            }

        }
    }

    private void playing() {
        do {
            System.out.println("Select coordinates x/y and action_ ");
            x = s.nextInt();
            y = s.nextInt();
            printField();
        } while (winCondition);

        printField();
        System.out.println("Congratulations! You stayed alive.");


    }

    private void turn() {

    }

    private void printField() {

        System.out.println(" |123456789|");
        System.out.println("-|---------|");
        for (int i = 1; i < 10; i++) {
            System.out.print(i);
            System.out.print("|");
            for (int j = 0; j < 9;j++) {
                System.out.print(field[i-1][j]);
            }
            System.out.println("|");
        }
        System.out.println("-|---------|");
    }

}
