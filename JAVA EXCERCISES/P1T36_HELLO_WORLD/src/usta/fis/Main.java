package usta.fis;
//AUTHOR:. EDISON RAMIREZ
//DATE: 2021-MARCH-16
//DESCRIPTION: THIS IS MY FIRST PROGRAM IN JAVA

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("----------------------------------------");

        System.out.println("SOFT INPUT NUMBER V 1.0");
        System.out.println("MAKER: EDISON RAMIREZ");

        System.out.println("----------------------------------------");



        Scanner keyboard = new Scanner(System.in);

        int v_number1, v_number2, v_sum;
        System.out.println("input the first number");
        v_number1 = keyboard.nextInt();
        System.out.println("input the second number");
        v_number2 = keyboard.nextInt();
        v_sum = v_number1 + v_number2;
        System.out.println("the total sum is" + v_sum);
    }
}
