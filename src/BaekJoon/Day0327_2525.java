package BaekJoon;


import java.util.Scanner;


public class Day0327_2525 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        int minute = sc.nextInt();
        int time = sc.nextInt();

        int totalMinute = hour * 60 + minute;
        int finshedMinute = totalMinute + time;

        hour = (finshedMinute / 60) % 24;
        minute = finshedMinute % 60;

        System.out.println(hour + " " + minute);
    }
}
