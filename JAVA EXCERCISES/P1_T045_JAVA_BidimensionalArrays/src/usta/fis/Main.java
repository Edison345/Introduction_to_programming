package usta.fis;
Edison Ramírez
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        final int FILAS = 5, COLUMNAS = 4;
        Scanner sc = new Scanner(System.in);
        int i, j, mayor, menor;
        int filamayor, filamenor, colmayor, colmenor;

        int[][] A = new int[FILAS][COLUMNAS]; //Se crea una matriz de 5 filas y 4 columnas

        //Se introducen por teclado los valores de la matriz
        System.out.println("Lectura elementos de matriz: ");
        for (i = 0; i < FILAS; i++) {
            for (j = 0; j < COLUMNAS; j++) {
                System.out.print("bidimensional_array[" + i + "][" + j + "]= ");
                A[i][j] = sc.nextInt();
            }
        }

        //Mostrar en la pantalla los valores que contiene la matriz
        System.out.println("valores introducidos:");
        for (i = 0; i < A.length; i++) {
            for (j = 0; j < A[i].length; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }
}
