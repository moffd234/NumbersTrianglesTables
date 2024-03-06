package io.zipcoder.microlabs.mastering_loops;

//
public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        return getMultiplicationTable(5);
    }

    public static String getLargeMultiplicationTable() {
        return getMultiplicationTable(10);
    }

    /*
    Create a StringBuilder name output
    for i = 1; i < size; i++      // This line and the line below will help us access our columns and rows
        for j = 1; j < size; j++
            append i * j to output
     */

    public static String getMultiplicationTable(int tableSize) {
        StringBuilder table = new StringBuilder();
        for(int i = 1; i <= tableSize; i++){  // Start from 1 so we don't have a column of 0s
            for(int j = 1; j <= tableSize; j++){
                table.append(String.format("%3d %s", i * j, "|"));
            }
            table.append("\n");
        }
        return table.toString();
    }
}
