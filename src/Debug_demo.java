public class Debug_demo {

    public static void main(String[] args) {
//        数组最大值
        int max = 0;
        int[] arr = {11,12,23,434,234};
        max = arrMax(arr);
        System.out.println(max);
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



