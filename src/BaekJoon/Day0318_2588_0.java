package BaekJoon;

import java.util.Scanner;

public class Day0318_2588_0 {
    // 하나로 입력된 문자(숫자)를 분리하여 연산을 할 수 있는가?

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        String b = scanner.next();

        System.out.println(a * (b.charAt(2) - '0'));
        System.out.println(a * (b.charAt(1) - '0'));
        System.out.println(a * (b.charAt(0) - '0'));
        System.out.println(a * Integer.parseInt(b));
    }
}
