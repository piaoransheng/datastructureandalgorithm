package algorithm.sort;

import java.util.Arrays;

/**
 * 冒泡排序
 *
 * @Author lhc
 * @Date 2020-10-30 15:53
 **/
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {7, 6, 1, 3, 5, 4, 2};
        int size = arr.length;
        //进行数组的大小-1次循环
        for (int i = 0; i <= size - 1; i++) {
            for (int index = 0; index <= size - 2; index++) {
                int firstNum = arr[index];
                int secondNum = arr[index + 1];
                if (firstNum > secondNum) {
                    arr[index] = secondNum;
                    arr[index + 1] = firstNum;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}