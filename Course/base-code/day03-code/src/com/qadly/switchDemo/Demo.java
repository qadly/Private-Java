package com.qadly.switchDemo;

/**
 * @author qadly
 * switch JDK 12 后的新特性
 */
public class Demo {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(switch (a) {
            case 1 -> "一";
            case 10 -> "十";
            case 100 -> "百";
            default -> "其他";
        });
    }
}
