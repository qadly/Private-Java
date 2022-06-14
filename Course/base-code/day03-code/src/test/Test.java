package test;

import java.util.Scanner;

/**
 * @author qadly
 */
public class Test {
    public static void main(String[] args) {
        Function5();
    }

    private static void Function1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入三位数：");
        int input = sc.nextInt();

        System.out.println("个位是：" + (input % 10));
        System.out.println("十位是：" + (input / 10 % 10));
        System.out.println("百位是：" + (input / 100 % 10));

        System.out.println(3.7 + "abc1");
    }

    public static void Function2() {
        System.out.println(1 + 'a');
        System.out.println('a' + "abc");
    }

    public static void Function3() {
        int a = 10;
        a++;
        System.out.println(a);
        ++a;
        System.out.println(a);
        a--;
        System.out.println(a);
        --a;
        System.out.println(a);
    }

    public static void Function4() {
        int x = 10;
        int y = x++;
        int z = ++x;

        // x:12
        System.out.printf("x:%d%n", x);
        // y:10
        System.out.printf("y:%d%n", y);
        // z:12
        System.out.printf("z:%d%n", z);
    }

    public static void Function5() {
        int a = 10;
        int b = 20;
        // 相当于 int a = (int)(a + b)
        a += b;
        System.out.println(a);
        System.out.println(b);
    }
}
