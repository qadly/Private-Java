package test;

import java.util.Random;
import java.util.Scanner;

/**
 * @author qadly
 */
public class Test6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        function4(sc);
    }

    /**
     * @param sc 输入参数
     */
    public static void function(Scanner sc) {
        System.out.println("逢7过，请输入一个数字：");
        int input = sc.nextInt();
        for (int i = 1; i < input; i++) {
            if (i % 7 == 0) {
                System.out.printf("过,");
                continue;
            }

            int result = i;
            boolean flag = false;
            while (result != 0) {
                if ((result - 7) % 10 == 0) {
                    flag = true;
                    break;
                }
                result /= 10;
            }

            System.out.printf("%s,", flag ? "过" : i);
        }
    }

    public static void function2(Scanner sc) {
        System.out.println("请输入一个整数：");
        int input = sc.nextInt();
        int x = 0;
        while (x * x <= input) {
            x++;
        }
        System.out.printf("%d 的平方根整数部分是：%d", input, x - 1);
    }

    public static void function3(Scanner sc) {
        System.out.println("请输入一个数：");
        int input = sc.nextInt();
        boolean flag = false;

        // 方法一
//        int i = 2;
//        while (i < input) {
//            if (input % i == 0) {
//                flag = true;
//                break;
//            }
//            i++;
//        }
        // 方法二
        int i = 2;
        while (i < Math.sqrt(input)) {
            if (input % i == 0) {
                flag = true;
                break;
            }
            i++;
        }
        System.out.println(!flag ? "是质数" : "不是质数");
    }

    public static void function4(Scanner sc) {
        Random r = new Random();
        int ranNum = r.nextInt(100) + 1;
        while (true) {
            System.out.println("猜数字:请输入一个数字:");
            int input = sc.nextInt();
            if (input == ranNum) {
                System.out.println("猜中了");
                break;
            } else if (input < ranNum) {
                System.out.println("小了");
            } else {
                System.out.println("大了");
            }
        }
    }
}
