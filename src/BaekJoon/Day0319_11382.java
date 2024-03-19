package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day0319_11382 {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));

        String[] strs = br.readLine().split(" ");

        Long a = Long.parseLong(strs[0]);
        Long b = Long.parseLong(strs[1]);
        Long c = Long.parseLong(strs[2]);

        System.out.println(a + b + c);
    }
}
