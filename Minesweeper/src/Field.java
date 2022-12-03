import cells.Cell;

import java.util.Random;
import java.util.Scanner;

public class Field {

    final private Cell[][] field = new Cell[9][9];
    final private Scanner s = new Scanner(System.in);
    final private Random r = new Random();
    public static int countMines;
    private int x;
    private int y;
    private String action;
    boolean winCondition = true;

    public void appRun() {
        greetingsPlayer();
        creationField();
        playing();
    }

    private void greetingsPlayer() {
        System.out.println("Welcome to game Minesweeper! I hope u know rules.");
        System.out.println("Select number of mines! _");
        countMines = s.nextInt();
        System.out.println("Memo rules: Select coordinates x/y and action ( 1 2 open, 5 5 flag )");
        spawnMine();
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
            System.out.println("Select coordinates x/y and action. _");
            x = s.nextInt();
            y = s.nextInt();
            action = s.next();
            if (turn()) {
                return;
            }
            printField();

        } while (winCondition);

        printField();
        System.out.println("Congratulations! You stayed alive.");


    }
    private boolean turn() {
        switch (action) {
            case "open": {
                if (field[y][x].getClass().equals("class Mine")) {
                    System.out.println("You boomed!");
                    return true;
                }


                break;
            }
            case "flag": {

                field[y][x].flagging();
                if (field[y][x].getClass().equals("class Mine") && field[y][x].equals("*")) {
                    countMines--;
                }
                if

            }
        }
        return true;
    }

    private void spawnMine() {

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
