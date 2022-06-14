package com.qadly.logicoperator;

/**
 * @author qadly
 */
public class Demo {
    public static void main(String[] args) {
        System.out.println("&");
        System.out.println(true & true);
        System.out.println(true & false);
        System.out.println(false & true);
        System.out.println(false & false);

        System.out.println("|");
        System.out.println(true | true);
        System.out.println(true | false);
        System.out.println(false | true);
        System.out.println(false | false);

        System.out.println("^");
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ true);
        System.out.println(false ^ false);

        System.out.println("!");
        System.out.println(!true);
        System.out.println(!false);

        System.out.println("&&");
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        System.out.println("||");
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        System.out.println("===================");
        int a = 10;
        int b = 10;
        boolean result = ++a < 5 && ++b > 5;
        System.out.println(result);
        System.out.println(a);
        System.out.println(b);

        System.out.println("三元表达式========");
        int num1 = 10;
        int num2 = 20;
        System.out.println(num1 > num2 ? num1 : num2);
        ;
    }
}
