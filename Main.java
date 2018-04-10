import java.util.Scanner;

import static java.lang.System.*;

public class Main {

    public static void main(String[] args) {
        // Request for data input in console
        Scanner inputText = new Scanner(System.in);

        //Declare a variable with the word has been input
        String inputWord = inputText.nextLine();

        //Declare a var with the word length
        int charNumber = inputWord.length();

        //Declare chars from the word has been input letter by letter.
        char letter = inputWord.charAt(0);


        char [][] aChar = new char[5][9];
        int [][] a = new int[][]{
                {0,0,0,0,1,0,0,0,0},
                {0,0,0,1,0,1,0,0,0},
                {0,0,1,0,0,0,1,0,0},
                {0,1,1,1,1,1,1,1,0},
                {1,0,0,0,0,0,0,0,1}
        };
        int [][] b = new int[][]{
                {0,0,1,1,1,1,0,0,0},
                {0,0,1,0,0,0,1,0,0},
                {0,0,1,1,1,1,0,0,0},
                {0,0,1,0,0,0,1,0,0},
                {0,0,1,1,1,1,0,0,0}
        };

        //Cycle to convert letter binary pattern into an A letter pattern
        int row, col;
        for (col = 0; col <9; col++){
            for (row = 0; row < 5; row++){
                if (a[row][col] == 1){
                    aChar[row][col] = 'A';
                }else{
                    aChar[row][col] = ' ';
                }
            }
        }

        //Cycle that prints the output of the A letter pattern
        for (row = 0; row < 5; row++){
            for (col = 0; col < 9; col++){

                System.out.print(aChar[row][col]);
            }
            System.out.println("\n");
        }
        //TEST
        /*int symbolNumber = 97;
        char symbolValue = (char) symbolNumber;
        System.out.println(symbolValue);*/
    }
}
