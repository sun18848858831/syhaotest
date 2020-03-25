package com.syh;

/**
 * @author shkstart
 * @create 2020-03-19 18:44
 */
public class mopaopaixu {

    public static void main(String[] args) {
        //谢谢

        int[] arr = new int[]{1,2,3,4,5,8,11,9,10};
        //冒泡排序
        for (int i=0;i<arr.length-1;i++){

            for (int j=0;j<arr.length-1-i;j++){

                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }

        }
        //遍历
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+"\t");
        }


        int arr1[] = {1,3,5,7,8,6,0,9};
        for(int i=0;i<arr1.length-1;i++){
            for(int j=0;j<arr1.length-1-i;j++){
                if(arr1[j]>arr1[j+1]){
                    int temp = arr1[j];
                    arr1[j] = arr1[j+1];
                    arr1[j+1] = temp;
                }
            }
        }
        for (int i=0;i<arr1.length-1;i++){
            System.out.println(arr1[i]);
        }

    }

}
