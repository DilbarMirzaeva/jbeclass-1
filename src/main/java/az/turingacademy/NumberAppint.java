package az.turingacademy;

import java.util.Scanner;

public class NumberAppint {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("number1=");
        int a = sc.nextInt();
        System.out.print("number2=");
        int b = sc.nextInt();
        System.out.print("num1 ededi cutdurse true,tekdirse false:");
        boolean c = (a % 2 == 0) ? true : false;
        System.out.println(c);
        System.out.print("\n num2 ededi cutdurse true,tekdirse false:");
        boolean d = (b % 2 == 0) ? true : false;
        System.out.println(d);

    }
}
