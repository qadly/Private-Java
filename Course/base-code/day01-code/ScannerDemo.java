import java.util.Scanner;


/**
 * @author qadly
 */
public class ScannerDemo {
    public static void main(String[] args) {
        function2();
    }

    /**
     * 键盘录入指定值
     */
    public static void function() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字：");
        int i = sc.nextInt();
        System.out.println(i);
    }

    /**
     *
     */
    public static void function2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字");
        int num = sc.nextInt();
        System.out.println("请输入第二个数字");
        int num2 = sc.nextInt();

        System.out.println(num + num2);
    }
}
