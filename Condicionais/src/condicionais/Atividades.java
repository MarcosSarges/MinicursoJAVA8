/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionais;

/**
 *
 * @author MP
 */
public class Atividades {
    //Exercicio 1
    //Elabore um codigo que verifica se a=(b+c) é maior que b=(c*2), c = 2
    // se a>b imprima "A variavel A é maior"
    // senão imprima "A variavel A é menor"

    //Exercicio 2
    //Elabore um codigo que verifica se o valor passado é impar ou par
    // se (a%2 == 0) imprima "A variavel A é par"
    // senão imprima "A variavel A é impar"
    //Exercicio 3
    /*
        Escreva um programa para ler 3 notas de um aluno e informar se
        o aluno está aprovado, reprovado ou se deverá fazer a prova
        final.

        O aluno será Aprovado a média de suas notas for > 6 e for <= 10
        O aluno será Reprovado se a média de suas notas for >=0 e < 4
        O aluno deverá fazer a prova se a média de suas notas for >= 4 e < 6
        Se a nota do aluno não se enquandrar em nenhuma situação deve-se imprimir "Valor invalido"    
        Média das notas: (Nota1 + Nota2 + Nota3) / 3
     */
    //Exercicio 4:
    /*
        Escreva um codigo que a patir de um valor inteiro
        deve-se imprima o dia correspondente ao dia da semana
     */
    // Exercicio 5:
    /*
        Escreva um codigo que simule um 
        login onde a senha pode ser o cpf ou o aniversario
        se uma das opções for verdadeira imprima "Login com sucesso"
        senap imprima "Login ou senha invalida"
    
     */
    public static void main(String[] args) {

    }

    //Resposta 1:
    /*
        int a;
        int b;
        int c = 2;
        b = (c * 2);
        a = (b + c);
        if (a > b) {
            System.out.println("A variavel A é maior ");
        } else {
            System.out.println("A variavel A é menor ");
        }
     */
    //Resposta 2:
    /*
        int a = 2;
        if ((a%2)==0) {
            System.out.println("A variavel A é par");
        }else{
            System.out.println("A variavel A é impar");
        }
     */
    //Resposta 3:
    /*
        double nota1 = 6.7;
        double nota2 = 5;
        double nota3 = 40;
        double resultado = (nota1 + nota2 + nota3) / 3;
        if (resultado >= 6 && resultado <=10) {
            System.out.println("Aprovado");
        } else if (resultado>=0 && resultado < 4) {
            System.out.println("Reprovado");
        } else if (resultado >= 4 && resultado < 6) {
            System.out.println("Fazer prova final");
        } else {
            System.out.println("Valor invalido");
        }
     */
    //Resposta 4:
    /*
        int diaSemana = 1;
        switch (diaSemana) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Valor invalido");
        }
     */
    // Resposta 5:
    /*
        String login = "Marcos";
        String senha = "18/07/1998";
        String loginCodicao = "Marcos";
        String cpf = "99999999999";
        String dataAniversario = "18/07/1998";
        
        //senha = "99999999999";
        if (login == loginCodicao && (senha == cpf || senha == dataAniversario)) {
            System.out.println("Login com sucesso");
        } else {
            System.out.println("Login ou senha invalida");
        }
     */
}
