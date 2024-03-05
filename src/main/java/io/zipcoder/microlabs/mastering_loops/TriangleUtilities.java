package io.zipcoder.microlabs.mastering_loops;

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
        return null;
    }

    public static String getSmallTriangle() {
        return null;
    }

    public static String getLargeTriangle() {
        return null;
    }
}
