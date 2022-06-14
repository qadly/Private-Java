package com.qadly.Test;

/**
 * @author qadly
 */
public class Test {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};
//        function(arr);
        copyOfRange(arr, 1, 5);
    }

    public static void function(int[] arr) {
        System.out.print("[");
        String output = new String();
        for (int i = 0; i < arr.length; i++) {
            output += "%s%s".formatted("%d".formatted(arr[i]), i == arr.length - 1 ? "" : ",");
        }
        System.out.print(output);
        System.out.println("]");
    }

    public static int[] copyOfRange(int[] arr, int form, int to) {
        int[] arrCopy = new int[to - form];
        int j = 0;
        for (int i = form; i < to; i++) {
            arrCopy[j] = arr[i];
            j++;
        }

        showArray(arrCopy);

        return arrCopy;
    }

    public static void showArray(int[] arr) {
        for (int i : arr) {
            System.out.printf("%d,", i);
        }
    }
}
