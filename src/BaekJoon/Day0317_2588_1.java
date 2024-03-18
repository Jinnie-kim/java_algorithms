package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Day0317_2588_1 {
    // 하나로 입력된 문자(숫자)를 분리하여 연산을 할 수 있는가?

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        sb.append(a * (b % 10));
        sb.append('\n');

        sb.append(a * ((b % 100)/10));
        sb.append('\n');

        sb.append(a * (b / 100));
        sb.append('\n');

        sb.append(a * b);

        System.out.println(sb);



    }
}
