class Solution {
    static List<List<String>> result = new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        result.clear();
        char[][] board = new char[n][n];
        for(int i = 0 ; i < n; i++) {
            Arrays.fill(board[i], '.');
        }
        backTrack(board, 0);
        return result;
    }
    public static void backTrack(char[][] board, int row) {
        if(row == board.length) {
            result.add(construct(board));
            return;
        }
        for(int col = 0; col < board.length; col++) {
            if(isSafe(board, row, col)) {
                board[row][col] = 'Q';
                backTrack(board, row+1);
                board[row][col] = '.';
            }
        }
    }
    public static boolean isSafe(char[][] board, int row, int col) {
        // column
        for(int i = 0; i < row; i++) {
            if(board[i][col] == 'Q') return false;
        }

        // upper left diagonal
        for(int i = row-1, j = col-1; i >= 0 && j >= 0; i--, j--) {
            if(board[i][j] == 'Q') return false;
        }

        // upper right diagonal
        for(int i = row-1, j = col+1; i >= 0 && j < board.length; i--, j++) {
            if(board[i][j] == 'Q') return false;
        }
        return true;
    }
    public static List<String> construct(char[][] board) {
        List<String> temp = new ArrayList<>();
        for(char[] row : board) {
            temp.add(new String(row));
        }
        return temp;
    }
}