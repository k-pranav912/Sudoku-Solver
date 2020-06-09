public class solver {

    public static boolean validEntry(int[][] sudoku, int row, int col) {
        return checkRow(sudoku, col, row) && checkCol(sudoku, col, row) && checkBox(sudoku, col, row);
    }

    public static boolean checkRow(int[][] sudoku, int row, int col) {

        for (int i = 0; i < 9; i++) {

            if (i == col) {
                continue;
            }

            if (sudoku[row][i] == sudoku[row][col]) {
                return false;
            }

        }

        return true;
    }

    public static boolean checkCol(int[][] sudoku, int row, int col) {

        for (int i = 0; i < 9; i++) {

            if (i == row) {
                continue;
            }

            if (sudoku[i][col] == sudoku[row][col]) {
                return false;
            }

        }

        return true;
    }

    public static boolean checkBox(int[][] sudoku, int row, int col) {

        int rowIndex = row / 3;
        int colIndex = col / 3;

        for (int y = 0; y < 3; y++) {

            for (int x = 0; x < 3; x++) {

                if (y + (3*rowIndex) == row && x + (3*colIndex) == col) {
                    continue;
                }

                if (sudoku[y + (3*rowIndex)][x + (3*colIndex)] == sudoku[row][col]) {
                    return false;
                }

            }

        }

        return true;
    }

    public static void printSudoku(int[][] sudoku) {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (sudoku[row][col] != 0) {
                    System.out.print(sudoku[row][col] + " ");
                } else {
                    System.out.print("_ ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] sudoku = {
                {0, 6, 8, 0, 0, 2, 4, 7, 9},
                {4, 0, 3, 0, 0, 8, 0, 0, 0},
                {0, 2, 1, 6, 0, 0, 5, 3, 0},
                {8, 0, 0, 0, 4, 7, 9, 1, 3},
                {7, 0, 0, 0, 0, 3, 0, 0, 4},
                {2, 3, 4, 1, 9, 0, 0, 8, 7},
                {0, 4, 7, 5, 2, 0, 0, 0, 1},
                {0, 8, 0, 4, 0, 0, 0, 2, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0} };

        printSudoku(sudoku);

        //System.out.println(checkBox(sudoku, 4, 7));

        System.out.println("\n\n");
        
    }

}
