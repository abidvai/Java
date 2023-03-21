package Abid_java;

//Question : Take a matrix as input from user. Search for a given number x and print the indices at which it occurs.

import java.util.*;


import java.util.Scanner;

public class _2D_Array {
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter the size of Column: ");
        int column = sc.nextInt();

        int[][] numbers = new int[rows][column];

        // Input
        // Rows
        for (int i = 0; i < rows; i++) {
            // Column
            for (int j = 0; j < column; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Enter the element You want to search: ");
        int x = sc.nextInt();

        // Output
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < column; j++) {
                System.out.println(numbers[i][j] + " ");
            	if (numbers[i][j] == x) {
                    System.out.println(" X Found at location (" + i + "," + j + ")");
                }
            }
       }
        
        
        
    }
}

