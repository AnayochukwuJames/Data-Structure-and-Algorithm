package org.example;

import java.util.Arrays;

public class WorkingWith2DArrays {
    public static void main(String[] args) {
        char[][] board = new char[3][3];
        for(int i=0; i<3; i++){
            for (int j = 0; j<3; j++){
                board[i][j] = '-';
            }
        }
        char[][] boardTwo = new char[][]{
                new char[]{'0', '-', '-'},
                new char[]{'0', '-', '-'},
                new char[]{'0', '-', '-'},
        };
        board [0][0]= '0';
        board [0][1]= '0';
        board [0][2]= '0';
        System.out.println(Arrays.deepToString(board));
        System.out.println(Arrays.deepToString(boardTwo));
    }

}
