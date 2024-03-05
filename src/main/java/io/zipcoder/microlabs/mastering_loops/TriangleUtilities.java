package io.zipcoder.microlabs.mastering_loops;

import java.util.Arrays;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        String triangle = "";
        for(int i = 1; i < numberOfRows; i++){
            for(int j = 0; j < i; j++) {
                triangle += "*";
            }
            triangle += "\n";
        }
        return triangle;
    }

    public static String getRow(int numberOfStars) {
        String output = "";
        for(int i = 0; i < numberOfStars; i++){
            output += "*";
        }

        return output;
    }

    public static String getSmallTriangle() {
        String triangle = "";
        int numberOfRows = 3;
        for(int i = 1; i < numberOfRows; i++){
            for(int j = 0; j < i; j++) {
                triangle += "*";
            }
            triangle += "\n";
        }
        return triangle;
    }

    public static String getLargeTriangle() {
        return null;
    }
}
