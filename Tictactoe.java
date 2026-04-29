// Function to check draw condition
public boolean checkDraw(char[][] board) {
    // Traverse entire board
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            // If any cell is empty, game is not a draw
            if (board[i][j] == ' ') {
                return false;
            }
        }
    }
    // No empty cells found → it's a draw
    return true;
}
