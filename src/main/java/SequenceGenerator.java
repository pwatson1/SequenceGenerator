/**
 * Created by pwatson on 2/8/16.
 */
public class SequenceGenerator {
    //public means send to object
    //private mean send to itself

    /*
    Write a method that counts from 1-26.
    print A - Z and only print odd numbers 1-26
    */


    public String printNumbers(int begin, int end) {
        String stringOfNumbers = "";
        for(int i = begin; i < end; i++  ) {
            stringOfNumbers = stringOfNumbers + " "+ i;
        }

        return stringOfNumbers;
    }

    public String printAlphabet(char beginChar, char endChar) {
        char theChar = 0;
        String theStringOfLetters = "";
        for(int i = beginChar; i < endChar; i++) {
            theChar = (char)i;
            theStringOfLetters = theStringOfLetters+ " "+ theChar;
        }

        return theStringOfLetters;
    }

    public String printOddNumbers(int begin, int end ) {
        int theNumbers = 0;
        String  theOddNumbers = "";
        for (int i = begin; i < end; i++) {
            theNumbers = i;

        if (theNumbers % 2 == 1) {
            theOddNumbers = theOddNumbers + " " + theNumbers;
        }
    }

        return theOddNumbers;
    }
}
