public class PatternBuilder {
    static int[][] a = new int[][]{
            {0, 0, 0, 0, 1, 0, 0, 0, 0},
            {0, 0, 0, 1, 0, 1, 0, 0, 0},
            {0, 0, 1, 0, 0, 0, 1, 0, 0},
            {0, 1, 1, 1, 1, 1, 1, 1, 0},
            {1, 0, 0, 0, 0, 0, 0, 0, 1}
    };
    private static char [][] aChar = new char[5][9];

    static int[][] b = new int[][]{
            {0, 0, 1, 1, 1, 1, 1, 0, 0},
            {0, 0, 1, 0, 0, 0, 0, 1, 0},
            {0, 0, 1, 1, 1, 1, 1, 0, 0},
            {0, 0, 1, 0, 0, 0, 0, 1, 0},
            {0, 0, 1, 1, 1, 1, 1, 0, 0}
    };


    public static char[][] getPatternForLetter(char input) {
        int row, col;

        int[][] pattern = null;
        char[][] result = new char[5][9];

        switch(input) {
            case 'a':
                pattern = a;
                break;
            case 'b':
                pattern = b;
                break;
            default:
                pattern = new int[][]{ };
                break;

        }

        for (col = 0; col <9; col++){
            for (row = 0; row < 5; row++){
                if (pattern[row][col] == 1){
                    result[row][col] = input;
                }else{
                    result[row][col] = ' ';
                }
            }
        }
        return result;
    }
}
