package io;

import java.util.Scanner;

/*
 * Entrada e Saída (I/O) de dados no Java
 * 
 * Entrada de dados: Ler dados digitados pelo usuário.
 * Saída de dados: Escrever dados para o usuário
 */
public class IoNotasEstudos {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite um número: ");
            int valorDigitado = scanner.nextInt();
            System.out.println("Você digitou: " + valorDigitado);

            // Saída de dados
            float qualquerNumero = 3.0f;
            System.out.printf("O número digitado foi %.2f", qualquerNumero);
        }
    }
}
