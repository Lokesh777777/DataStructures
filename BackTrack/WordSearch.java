package BackTrack;

public class WordSearch {
    static public boolean isWordExist(char[][] mat, String word) {
        char[] s = word.toCharArray();
        
        for(int i = 0; i < mat.length; i++) {
            for(int j = 0; j < mat[0].length; j++) {
                if(dfs(mat, i, j, s, 0)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    static boolean dfs(char[][] mat, int i, int j, char[] s, int idx) {
        if(idx == s.length) {
            return true;
        }
        if(i < 0 || j < 0 || i >= mat.length || j >= mat[0].length || mat[i][j] != s[idx]) {
            return false;
        }
        
        char temp = mat[i][j];
        mat[i][j] = ' ';  // Mark the cell as visited
        boolean found = dfs(mat, i + 1, j, s, idx + 1) ||
                        dfs(mat, i - 1, j, s, idx + 1) ||
                        dfs(mat, i, j + 1, s, idx + 1) ||
                        dfs(mat, i, j - 1, s, idx + 1);
        mat[i][j] = temp;  // Restore the cell's original value
        
        return found;
    }
}
