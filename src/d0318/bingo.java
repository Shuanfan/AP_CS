package d0318;

import java.util.ArrayList;

public class bingo {
    public static void main(String[] args) {
        Board k = new Board(5,5);
        for (int i = 0; i < 25; i++) {
            k.set();
            k.show();
            k.check();
            System.out.println();
            System.out.println();
        }
        }
    }

class Board {
    private int[][] table;
    private boolean[][] check;


    public Board(int row, int col) {
        table = new int[row][col];
        check = new boolean[row][col];
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                int c = (int) (Math.random() * 25) + 1;
                while (list.contains(c) == true) {
                    c = (int) (Math.random() * 25) + 1;
                }
                table[i][j] = c;
                list.add(c);
            }
        }
    }

    public void set() {
        int v = (int) (Math.random() * 25) + 1;
        for (int k = 0; k < table.length; k++) {
            for (int l = 0; l < table[k].length; l++) {
                if (table[k][l] == v) {
                    check[k][l] = true;
                }
            }
        }
    }

    public void show() {
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                if (check[i][j] == true) {
                    System.out.print("X");
                    System.out.print(" ");
                } else if (table[i][j] < 10) {
                    System.out.print(table[i][j]);
                    System.out.print(" ");
                    System.out.print(" ");
                } else {
                    System.out.print(table[i][j]);
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void check() {
        int c = 0;
        int o = 0;
        for (int i = 0; i < check.length; i++) {

            int d = 0;
            for (int j = 0; j < check[i].length; j++) {
                if (check[i][j] == true) {
                    d++;
                }
            }

            if (d == check.length) {
                o++;

            }
        }
        System.out.println("BINGO :) by " +o+ " row");
        for (int j = 0; j < check[0].length; j++) {

            int d = 0;
            for (int i = 0; i < check.length; i++) {
                if (check[i][j] == true) {
                    d++;
                }
            }

            if (d == check.length) {
                c++;

            }
        }
        System.out.println("BINGO :) by " +c+ " column");
    }
}
