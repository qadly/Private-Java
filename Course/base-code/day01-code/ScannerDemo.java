import java.util.Scanner;


/**
 * @author qadly
 */
public class ScannerDemo {
    public static void main(String[] args) {
        function2();
    }

    /**
     * ����¼��ָ��ֵ
     */
    public static void function() {
        Scanner sc = new Scanner(System.in);
        System.out.println("���������֣�");
        int i = sc.nextInt();
        System.out.println(i);
    }

    /**
     *
     */
    public static void function2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("����������");
        int num = sc.nextInt();
        System.out.println("������ڶ�������");
        int num2 = sc.nextInt();

        System.out.println(num + num2);
    }
}
