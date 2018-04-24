import java.util.ArrayList;
import java.util.Scanner;

public class Main extends PatternBuilder{

    public static void main(String[] args) {
        // Request for data input in console
        Scanner inputText = new Scanner(System.in);

        //Declare a variable with the word has been input
        String inputWord = inputText.nextLine();

        //Declare a var with the word length
        int charNumber = inputWord.length();

//        char letter = inputWord.charAt(0);

        ArrayList<char[][]> toGrossLetters = new ArrayList<>();


        for (char c : inputWord.toCharArray()) {
            toGrossLetters.add(Main.getPatternForLetter(c));
        }

        //Cycle to convert letter binary pattern into a B letter pattern

        //int row = 0;
        //int col = 0;
/* TEST ARRAY
        int[][] array = new int[][]{{1, 2},
                {3, 4}
        };

        for (; row < 2; row++) {
            for (int col=0; col < 2; col++) {
                System.out.println(array[row][col]);
            }
        }
*/
        char[] toPrint = new char[((charNumber) * 9*5)];
        int n = 0;
        for (char[][] toLetter : toGrossLetters) {
            for (int col = 0; col < 9; col++) {
            for (int row = 0; row < 5; row++) {

                    toPrint[n] = toLetter[row][col];
                    n++;
                }
            }
        }
        int i = 0;

        for (char l : toPrint) {
            System.out.print(l);
            i++;


            //if
        }

        //Cycle that prints the output of the A letter pattern
//        for (row = 0; row < 5; row++){
//            for (col = 0; col < 9; col++){
//
//                System.out.print(bChar[row][col]);
//            }
//            System.out.println();
//        }
        //TEST
        /*int symbolNumber = 97;
        char symbolValue = (char) symbolNumber;
        System.out.println(symbolValue);*/

    }
}