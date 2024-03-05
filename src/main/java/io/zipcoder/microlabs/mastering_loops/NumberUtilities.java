package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        return null;
    }


    public static String getOddNumbers(int start, int stop) {
        return null;
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        return null;
    }

    public static String getRange(int start) {
        return null;
    }


    // Look into the test case 3C - may be a testcase error
    public static String getRange(int start, int stop) {
        String output = "";
        for(int i = start; i < stop; i++) {
            output += i;
        }
        return output;
    }


    public static String getRange(int start, int stop, int step) {
        String output = "";
        for(int i = start; i < stop; i += step){
            output += i;
        }
        return output;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        return null;
    }
}
