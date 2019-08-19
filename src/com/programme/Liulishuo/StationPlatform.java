package com.programme.Liulishuo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author yyuanyan
 * @create 2019 - 08 - 19 - 18:11
 */
public class StationPlatform {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //int n = Integer.valueOf(bufferedReader.readLine());
        int n = 4;
        int [] in = new int [n];
        int [] out = new int [n];
        System.out.println("请输入入站时间，用空格隔开");
        String[] strings1 = bufferedReader.readLine().split(" ");
        System.out.println("请输入出站时间，用空格隔开");
        String[] strings2 = bufferedReader.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            in[i] = Integer.parseInt(strings1[i]);
            out[i] = Integer.parseInt(strings2[i]);
        }
        int zhan = 1;
        for (int i = 0; i < n-1; i++) {
                if (out[i] > in[i+1]){
                    zhan++;
                }
        }
        System.out.print("所需站台数：");
        System.out.println(zhan);
    }
}
