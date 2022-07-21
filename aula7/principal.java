package aula7;

import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Delta delta = new Delta();
        EqXn x = new EqXn();
        System.out.println("\n====>Considere a seguinte equacao: ax^2 bx c = 0 informe os valores.<====");
        System.out.println("Entre com o valor de a:");
        delta.setA(entrada.nextDouble());
        System.out.println("Entre com o valor de b:");
        delta.setB(entrada.nextDouble());
        System.out.println("Entre com o valor de c:");
        delta.setC(entrada.nextDouble());
        delta.calculaDelta();
        System.out.println("==== Resultado da Equação ====");
        System.out.println("Delta: " + String.format("%.2f", delta.getDelta()));
        if(delta.getDelta() < 0){
            System.out.println("== Não existe raizes para delta negativo.");
        }else{
            System.out.println("X' : " + String.format("%.2f", x.calculaXn(delta)));
            System.out.println("X''' : " + String.format("%.2f", x.calculaXp(delta)));
        }
    }
}
