package usta.fis;
//AUTHOR     : EDISON RAMIREZ - EMERSON GUTIERREZ - DANIEL BERNAL
//DATE       : 2021-MARCH-26
//DESCRIPTION: THIS PROGRAM CALCULATES THE AVERAGE HEIGHT OF FIVE YEAR OLD CHILDREN

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("---------------------------------------");
        System.out.println("Hello teacher");
        System.out.println("SOFT-HEIGHT : VERSION 1.0");
        System.out.println("---------------------------------------");

        Scanner r= new Scanner(System.in);
        float heigth1;
        float heigth2;
        float heigth3;
        float heigth4;
        float heigth5;
        float average;
        System.out.println("input the first height")
        heigth1 = r.nextInt();
        System.out.println("input the second height")
        heigth2 = r.nextInt();
        System.out.println("input the third height")
        heigth3 = r.nextInt();
        System.out.println("input the fourth height")
        heigth4 = r.nextInt();
        System.out.println("input the fifth height")
        heigth5 = r.nextInt();
        average = (heigth1 + heigth2 + heigth3 + heigth4 + heigth5) /5;

        System.out.println("the average height is"+" "+average);



    }
}
