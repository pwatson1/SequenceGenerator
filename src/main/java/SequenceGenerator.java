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

    private String printSequence(int begin, int end, boolean isNumber, boolean justOdd) {

        String stringOfNumbers = "";
        String theStringOfLetters = "";
        char theChar =0;
        for(int i = begin; i < end; i++  ) {
            if(isNumber) {
                stringOfNumbers = stringOfNumbers + " " + i;
            }else{
                theChar = (char)i;
                theStringOfLetters = theStringOfLetters+ " "+ theChar;
            }
        }

    }


    public String printNumbers(int begin, int end) {

        return printSequence(begin, end, true);
    }

    public String printAlphabet(int beginChar, int endChar, boolean isNumber , boolean justOdd) {

        return printSequence(beginChar, endChar, true, true);
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
