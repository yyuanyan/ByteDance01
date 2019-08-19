package com.programme.ByteDance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author yyuanyan
 * @create 2019 - 08 - 14 - 0:37
 */
public class Bonus {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(bufferedReader.readLine());
        int [] value = new int [n];
        int [] s = new int [n];
        String[] strings = bufferedReader.readLine().split(" ");
        if (n == 0)
            System.out.println("0");
        if (n == 1)
            System.out.println("100");
        if (n > 1) {
            for (int i = 0; i < n; i++) {
                value[i] = Integer.parseInt(strings[i]);
                s[i] = 100;
            }
            int sal = 0;
            int min = value[0];
            int tag = 0;
            for (int i = 0; i < n; i++) {
                if (value[i] < min) {
                    min = value[i];
                    tag = i;
                }
            }
            //特殊情况 最小值为value[0]
            if(tag == 0) {
                for (int i = 0; i < n - 1; i++) {
                    if (value[i] < value[i + 1])
                        s[i + 1] = s[i] + 100;
                    if (value[i] > value[i + 1])
                        s[i] = s[i + 1] + 100;
                }
            }
            //特殊情况 最小值为value[n]
            else if (tag == n) {
                for (int i = n; i > 0; i--) {
                    if (value[i] < value[i - 1])
                        s[i - 1] = s[i] + 100;
                    if (value[i] > value[i - 1])
                        s[i] = s[i - 1] + 100;
                }
            }
            //普通情况 分两种情况：[0 ~ min) 和 [min ~ n]
            else {
                for (int i = tag; i > 0; i--) {
                    if (value[i] < value[i - 1])
                        s[i - 1] = s[i] + 100;
                    if (value[i] > value[i - 1])
                        s[i] = s[i - 1] + 100;
                }
                for (int i = tag; i < n - 1; i++) {
                    if (value[i] < value[i + 1])
                        s[i + 1] = s[i] + 100;
                    if (value[i] > value[i + 1])
                        s[i] = s[i + 1] + 100;
                }
            }
            for (int i = 0; i < n; i++) {
                sal += s[i];
            }
            System.out.println(sal);
        }
    }
}
