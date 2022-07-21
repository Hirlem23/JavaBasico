package aula7;

import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Delta delta = new Delta();
        EqXn x = new EqXn();

        System.out.println("Considere a Equacao: Ax^2 Bx C = 0 informe os valores.");
        System.out.println("valor de A?");
        delta.setA(entrada.nextDouble());

    }
}
