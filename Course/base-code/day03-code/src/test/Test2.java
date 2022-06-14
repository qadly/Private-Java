package test;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您时髦程度（0~10）:");
        int x = sc.nextInt();
        System.out.println("请输入您对象时髦程度（0~10）:");
        int y = sc.nextInt();
        System.out.println(x > y);
    }
}
