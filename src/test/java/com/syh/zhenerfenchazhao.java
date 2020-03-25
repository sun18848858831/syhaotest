package com.syh;

import sun.rmi.server.InactiveGroupException;

import java.util.Arrays;

/**
 * @author shkstart
 * @create 2020-03-19 21:20
 */
public class zhenerfenchazhao {

    public static void main(String[] args) {
        //System.out.println((Integer)5/2);
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(binarySearch(arr,7));
        System.out.println(erfenchazhao(arr,7));
    }

    public static Integer binarySearch(int []array,Integer findNum){

        //如果查找的数组为空或者要查找值小于数组的最小的arry[0]
        //或者大于数组最大的元素array[length-1]直接返回-1
        if(array == null || array.length<=0 || findNum<array[0] || findNum>array[array.length-1]){
            return -1;
        }

        Integer low = 0;
        Integer high = array.length -1;
        //循环退出条件即子表不存在
        while (low<=high){
            Integer mid = (low+high)/2;
            if(array[mid] == findNum){
                return mid;
            }else if(array[mid] > findNum){
                high =mid - 1;
            }else if(array[mid] < findNum){
                low = mid + 1;
            }
        }


        return -1;

    }

    public static int erfenchazhao(int[] arr,int num){

        if(arr == null || arr.length <= 0 || arr[0]>num || arr[arr.length - 1]<num){
            return -1;
        }

        int low = 0;
        int high = arr.length - 1;
        while (low <=high){
            int temp = (low + high)/2;
            if(arr[temp] == num){
                return temp;
            }else if(arr[temp] < num){
                low = temp + 1;
            }else if(arr[temp] > num){
                high = temp - 1;
            }
        }
        return 0;

    }

}
