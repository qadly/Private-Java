package test;

import java.util.Random;

public class ArrayDemo {
    public static void main(String[] args) {
        function4();
    }

    /**
     * 定义数组 {33，5，22，44，55} 求最大值
     */
    public static void function() {
        int[] arr = {33, 5, 22, 44, 55};
        int max = arr[0];
        int min = arr[0];

        for (int i : arr) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
        System.out.println(max);
        System.out.println(min);
    }

    /**
     * 生成10个1~100之间的随机数存储到数组中
     * 求数组内所有数字和
     * 求数组内所有数字平均数
     * 统计数组内比平均数小的数字
     */
    public static void function2() {
        int[] arr = new int[10];
        Random r = new Random();
        String msg = "随机数组： {";
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100) + 1;
            msg += "%d,".formatted(arr[i]);
        }
        System.out.println("%s}".formatted(msg.substring(0, msg.length() - 1)));

        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        int ave = sum / arr.length;
        System.out.printf("Sum: %d%n", sum);
        System.out.printf("Ave：%d%n", ave);
        String strArr = new String();
        for (int i : arr) {
            if (i < ave) {
                strArr += "%d,".formatted(i);
            }
        }

        System.out.printf("小于平均数的数据：%s", strArr.substring(0, strArr.length()));
    }

    /**
     * 交换数组
     */
    public static void function3() {
        int[] arr = {1, 2, 3, 4, 5};
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }

        showArray(arr);
    }

    public static void function4() {
        int[] arr = {1, 2, 3, 4, 5};
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int tmp = arr[i];
            int j = r.nextInt(arr.length);
            arr[i] = arr[j];
            arr[j] = tmp;
        }

        showArray(arr);
    }

    public static void showArray(int[] arr) {
        for (int i : arr) {
            System.out.printf("%d,", i);
        }
    }
}
