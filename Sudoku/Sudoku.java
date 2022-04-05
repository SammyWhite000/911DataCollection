/*
 *    File: Sudoku.java
 *    Creator: Samuel T White
 *    Created: Tuesday Apr 05 2022 at 10:00:53 AM
 *    For: 
 *    Description: Sudoku Solver
*/
class Sudoku{

    private static final int GRID_SIZE= 9;

    //Same number cannot be in row, check if a number is already in row
    private static boolean isNumberInRow(int[][] board, int number, int row){
        for (int i = 0; i < GRID_SIZE; i++){
            if (board[row][i] == number){
                return true;

            }
        }
        return false;
    }

    //Same number cannot be in column, check if number is already in column
    private static boolean isNumberInCol(int[][] board, int number, int col){
        for (int i = 0; i < GRID_SIZE; i++){
            if (board[i][col] == number){
                return true;

            }
        }
        return false;
    }   

    //Check if the number is in the 3x3 Square
    private static boolean isNumberInBox(int[][] board, int number, int row,int col){
        //must get the top left row and column of the box
        int localBoxRow = row - row % 3;
        int localBoxCol = col - col % 3;
        
        //Start checking if number is in box
        return false;
    }    
    public static void main(String[] args) {
        //board that will use
        //Later can add a class that generates a board itself
        int[][] board = {
            {7, 0, 2, 0, 5, 0, 6, 0, 0},
            {0, 0, 0, 0, 0, 3, 0, 0, 0},
            {1, 0, 0, 0, 0, 9, 5, 0, 0},
            {8, 0, 0, 0, 0, 0, 0, 9, 0},
            {0, 4, 3, 0, 0, 0, 7, 5, 0},
            {0, 9, 0, 0, 0, 0, 0, 0, 8},
            {0, 0, 9, 7, 0, 0, 0, 0, 5},
            {0, 0, 0, 2, 0, 0, 0, 0, 0},
            {0, 0, 7, 0, 4, 0, 2, 0, 3} 
        };
        System.out.println(board[0][0]);
        System.out.println("Hello, World!"); 
    }
}
    