/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repeticoes;
/**
 * @author MP
 */
public class Atividades {

    //Exercício 1
    //Escreva um código que imprima todos os números pares entre 0 e 30.
    //Exercício 2
    //Escreva um código que enquanto i<10 imprima o valor atual de i * i+1.
    //Exercício 3
    //Escreva um código que leia 10 idades e conte quantas
    //pessoas possuem mais de 18 anos.
    //Exercício 4
    //Escreva um código que leia um número e imprima seu fatorial.
    public static void main(String[] args) {

    }
//Resposta 1
/*
    for (int i = 0; i <= 30; i++) {
        if ((i%2)==0) {
            System.out.println(i);
        }
    }
     */

//Resposta 2
/*
    int i = 0;
    while (i < 10) {
        System.out.println(i * (i + 1));
        i++;
    }
     */

 /*Resposta 3
    //import java.util.Scanner;     //<--instancia para ler o teclado (Scanner)
    Scanner ler = new Scanner(System.in);
    int idade;
    int contador = 0;
    for (int i = 0; i < 10; i++) {
        idade = ler.nextInt();
        if (idade >= 18) {
            contador++;
        }
    }
    System.out.println("A quantidade de pessoas "
            + "com mais de 18 anos é: " + contador);
     */

//Resposta 4
/*
    long fat = 1;
    int valor = 20; //ou qualquer outro valor que queira calcular;
    for (int i = 2; i <= valor; i++) {
        fat *= i;
  }
    System.out.println("O fatorial de " + valor + " é igual a " + fat);
     */
}
