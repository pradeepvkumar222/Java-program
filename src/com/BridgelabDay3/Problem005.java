package com.BridgelabDay3;

public class Problem005 {
    //Java Program to print the elements of an array present on an even position
    public static void main(String[] args) {
        int[] arr = new int[] {1, 5, 3, 6, 8, 2, 5, 4, 10};
        System.out.println("Elements of given array present on even position : ");
        for (int i = 1; i < arr.length; i = i + 2) {
            System.out.println(arr [i]);
        }
    }
}
