package test;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入一个票号");
        int ticket = sc.nextInt();
        if (ticket > 0 && ticket <= 100) {
            System.out.println(ticket % 2 == 1 ? "坐左边" : "坐右边");
        }
    }
}
