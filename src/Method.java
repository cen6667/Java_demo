import java.util.Scanner;


public class Method {

    public static void main(String[] args) {
        System.out.println("请输入一个数字：");
        Scanner sc = new Scanner(System.in);
//        接收数据
        int x = sc.nextInt();
        method_demo(x);
//        数组最大值
        int max = 0;
        int[] arr = {11,12,23,434,234};
        max = arrMax(arr);
        System.out.println(max);
    }

// 定义一个方法，判断一个变量是否为偶数
    public static boolean method_demo(int number) {
        if(number%2 == 0) {
            System.out.println("是偶数");
            return true;
        }
        else System.out.println("不是偶数");
        return false;
    }

    public static int arrMax(int[] arr) {
        int max = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if(max < arr[i]){
//                max = arr[i];
//            }
//        }
        for (int j : arr) {
            System.out.println(j);
            if (max < j) {
                max = j;
            }
        }
        System.out.println("数组最大值为：" + max);
        return max;
    }
}


