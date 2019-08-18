package com.programme.Liulishuo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author yyuanyan
 * @create 2019 - 08 - 18 - 1:09
 */
public class MaxsubArray {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(bufferedReader.readLine());
        int [] value = new int [n];
        for (int i = 0; i < n; i++) {
            value[i] = Integer.valueOf(bufferedReader.readLine());
        }
        if (n == 0)
            System.out.println("0");
        else if (n == 1)
            System.out.println(value[0]);
        else {
            int max = value[0];
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += value[i];
                if (sum > max)
                    max = sum;
                if (sum < 0) {
                    sum = 0;
                }
            }
            System.out.println(max);
        }
    }
}
