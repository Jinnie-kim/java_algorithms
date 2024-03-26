package BaekJoon;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Day0326_2884 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] strs = br.readLine().split(" ");

        int hour = Integer.parseInt(strs[0]);
        int minute = Integer.parseInt(strs[1]);

        if(minute < 45) {
            hour--;
            minute = 60 - (45 - minute);

            if(hour < 0) {
                hour = 23;
            }
            System.out.println(hour + " " + minute);
        } else {
            System.out.println(hour + " " + (minute -45));
        }
    }
}
