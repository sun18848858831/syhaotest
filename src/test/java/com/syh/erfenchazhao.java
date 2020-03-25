package com.syh;

/**
 * @author shkstart
 * @create 2020-03-19 21:05
 */
public class erfenchazhao {

    public static void main(String[] args) {
        System.out.println(getNumber(5));
        System.out.println(getjia(5));
    }

    public static int getNumber(int n){

        //结束条件
        if(n == 1){

            return 1;

        }

        return getNumber(n-1)+n;
    }


    public static int getjia(int n){

        if(n == 1){
            return 1;
        }
        return getjia(n-1)+n;

    }

}
