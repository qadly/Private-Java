package test;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Function3(sc);
    }

    public static void Function(Scanner sc) {
        System.out.println("请输入第一个整数：");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个整数");
        int num2 = sc.nextInt();
        System.out.println(num1 == 6 || num2 == 6 || (num1 + num2) % 6 == 0);
    }

    public static void Function2(Scanner sc) {
        System.out.println("请输入第一只老虎体重：");
        int num1 = sc.nextInt();
        System.out.println("请输入第一只老虎体重：");
        int num2 = sc.nextInt();
        System.out.println(num1 == num2 ? "相同" : "不同");
    }

    public static void Function3(Scanner sc) {
        int height1 = 150;
        int height2 = 210;
        int height3 = 165;

        System.out.println(height1 > height2 ? Math.max(height1, height3) : Math.max(height2, height3));
    }
}
