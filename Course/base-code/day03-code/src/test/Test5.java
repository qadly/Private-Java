package test;

import java.util.Scanner;

/**
 * @author qadly
 */
public class Test5 {
    public static void main(String[] args) {
        Function3();
    }

    public void Function1() {
        int everest = 8844430;
        double folding = 0.1;
        int count = 0;
        while (folding <= everest) {
            folding = folding * 2;
            count++;
        }
        System.out.println(count);
    }

    /**
     * 回文数
     */
    public static void Function2() {
        System.out.println("请输入一个数字:");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int input = x;
        int result = 0;
        while (x != 0) {
            result = result * 10 + x % 10;
            x = x / 10;
        }
        System.out.printf("结果：%d%n", result);
        System.out.println(result == input ? "是回文数" : "不是回文数");
    }

    public static void Function3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个被除数:");
        int dividend = sc.nextInt();
        System.out.println("请输入一个除数:");
        int divisor = sc.nextInt();
        int result = dividend;
        int count = 0;
        while (result >= divisor) {
            result = result - divisor;
            count++;
        }
        System.out.printf("商：%d %n余数：%d", count, result);
    }
}
