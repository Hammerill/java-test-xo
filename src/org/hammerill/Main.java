package org.hammerill;

public class Main {

    public static void main(String[] args) {
        int[][] table = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                table[i][j] = (int)(Math.random() * 3);
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (table[i][j] == 1) {
                    System.out.print("X ");
                } else if (table[i][j] == 2) {
                    System.out.print("O ");
                } else {
                    System.out.print("_ ");
                }
            }
            System.out.println();
        }
    }
}
