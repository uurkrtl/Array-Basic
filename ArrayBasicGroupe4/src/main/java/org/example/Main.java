package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Coding: Array Basics
        //Step 1: Create an array with numbers from 1 to 10 and print it to the console.
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Print array:");
        for(int number : arr){
            System.out.println(number);
        }
        System.out.println();

        //Step 2: Calculate the sum of all numbers in the array and print the result to the console.
        int sum = 0;
        for (int number : arr){
            sum += number;
        }
        System.out.println("Sum of all numbers in the array: " + sum + "\n");

        //Step 3: Find the largest number in the array and print it to the console.
        int max = Integer.MIN_VALUE;
        for (int number : arr){
            if (number>max){
                max = number;
            }
        }
        System.out.println("Largest number in the array: " + max + "\n");

        //Step 4: Create a second array with numbers from 11 to 20.
        int[] arr2 = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        //Step 5: Perform element-wise addition of both arrays and store the result in a third array. Print the result array to the console.
        int[] arr3 = new int[arr.length];
        for (int i = 0; i<arr.length; i++){
            arr3[i] = arr[i] + arr2[i];
        }
        System.out.println("Element-wise addition: ");
        for (int number : arr3){
            System.out.println(number);
        }

        //Bonus
        //Implement a program that reads a text from the console and then outputs the letters individually. Tip: Learn about the Scanner class.

        scanInputAsString();
    }

    public static void scanInputAsString(){
        System.out.println("Scanning Input (enter 'q' to exit programm):");
        Scanner scanner = new Scanner(System.in);
        while (true){
            String s = scanner.next();
            char[] word = s.toCharArray();
            for(char element : word){
                System.out.println(element);
            }
            if(s.equals("q")) break;
            //System.out.println(s);
            /*  alternative Lösung
            for(int i = 0; i < s.length(); i++)
                System.out.println(s.charAt(i));

             */

        }
        System.out.println("Bye...");
        scanner.close();
    }
}