/**
 * Created by pwatson on 2/8/16.
 */
public class SequenceGenerator {
    /*Public methods are sent to object, private sent to itself.
    Identify what methods are common.*/


    private String printSequence(int beginning, int end, boolean printNumber, boolean printOnlyOdd) {
        /*Created a private string method...It's private because...It's a String because...*/
        /*If boolean is true = numbers, if false = letters*/
        String sequenceString = "";//Initializes a string with no content
        boolean shouldPrint = true;//Initializes a boolean and sets it to true
        char theChars = 0;
        for (int i = beginning; i <= end; i++) {//First iteration
            if(printOnlyOdd && (i %2 ==1)){//If both are true...it's a number and is odd
                shouldPrint = true;//Should print...

            }else if (!printOnlyOdd){//If it's odd...
                shouldPrint = true;//
            }else{//
                shouldPrint = false;//Don't print...
            }
            if (printNumber) {
                if(shouldPrint){
                    sequenceString = sequenceString + i + " ";
                }

            } else {//Will print char
                if(shouldPrint) {
                    theChars = (char) i;
                    sequenceString = sequenceString + theChars + " ";
                }
            }
        }

        return sequenceString;
    }

    public String printNumbers(int beginning, int end) {
        return printSequence(beginning, end, true, false);
    }

    public String printAlphabet(int beginning, int end) {
        return printSequence(beginning, end, false, false);
    }

    public String printOddNumbers(int beginning, int end) {

        return printSequence(beginning, end, true,true);
    }
}







