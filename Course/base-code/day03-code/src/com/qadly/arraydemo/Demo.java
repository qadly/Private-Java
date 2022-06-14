package com.qadly.arraydemo;

/**
 * @author qadly
 */
public class Demo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        function3(arr);
    }

    public static void function(int[] arr) {
        for (int i : arr) {
            System.out.println(i);
        }
    }

    /**
     * @param arr
     */
    public static void function2(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }

    /**
     * 数组越界异常
     * @param arr
     */
    public static void function3(int[] arr) {
        System.out.println(arr[10]);
    }
}
