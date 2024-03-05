package io.zipcoder.microlabs.mastering_loops;

import java.util.Arrays;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        StringBuilder output = new StringBuilder();
        for(int i = 1; i < numberOfRows; i++){
            output.append(getRow(i));
            output.append("\n");
        }

        return output.toString();
    }

    public static String getRow(int numberOfStars) {
        String output = "";
        for(int i = 0; i < numberOfStars; i++){
            output += "*";
        }

        return output;
    }

    public static String getSmallTriangle() {
        return getTriangle(4);
    }

    public static String getLargeTriangle() {
        return getTriangle(10);
    }
}
