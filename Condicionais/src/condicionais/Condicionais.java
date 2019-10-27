package condicionais;

public class Condicionais {

    public static void main(String[] args) {
        int saldo = 1;

        //# visualg
        //se <expressão-lógica> entao
        //<sequência-de-comandos-1>
        //senao
        //<sequência-de-comandos-2>
        //fimse
        //#JAVA
        // if(<expressão-lógica>){
        //<sequência-de-comandos-1>
        //}else{
        //<sequência-de-comandos-2>
        //}
        // Vamos testar cada operador

        //IGUAL
        if (saldo == 1) {
            System.out.println("O resultado do teste é true");
        } else {
            System.out.println("O resultado do teste é false");
        }

        //DIFERENTE
        if (saldo != 1) {
            System.out.println("O resultado do teste é true");
        } else {
            System.out.println("O resultado do teste é false");
        }

        // MAIOR
        if (saldo > 1) {
            System.out.println("O resultado do teste é true");
        } else {
            System.out.println("O resultado do teste é false");
        }

        // MAIOR OU IGUAL
        if (saldo >= 1) {
            System.out.println("O resultado do teste é true");
        } else {
            System.out.println("O resultado do teste é false");
        }

        //MENOR
        if (saldo < 1) {
            System.out.println("O resultado do teste é true");
        } else {
            System.out.println("O resultado do teste é false");
        }

        //MENOR OU IGUAL
        if (saldo <= 1) {
            System.out.println("O resultado do teste é true");
        } else {
            System.out.println("O resultado do teste é false");
        }

        // Variavel booleana
        boolean teste = true;
        // o proprio if já verifica o valor da variavel, ele verificar se a variavel é True
        if (teste) {
            System.out.println("A variavel teste é verdadeira");
        } else {
            System.out.println("A variavel teste é falsa");
        }

        // testes com duas ou mais variaveis e condicionais
        // 'E' é igual a '&&' na programação
        if (saldo == 2 && teste) {
            System.out.println("Duas condições, no minimo 1 verdade");
        } else {
            System.out.println("Uma ou as duas condições são falsas");
        }

        // 'OU' é igual a '||' na programação
        if (saldo == 2 || teste) {
            System.out.println("Duas condições, no minimo 1 verdade");
        } else {
            System.out.println("As duas condições são falsas");
        }

        //NÃO ou NEGAÇÃO
        teste = true;
        if (!teste) {
            System.out.println("O valor da variavel teste é true");
        } else {
            System.out.println("O valor da variavel teste é false");
        }

        // A condicional switch case == escolha caso do visualg
        /*
        escolha <expressão-de-seleção>
            caso <exp11>, <exp12>, ..., <exp1n>
               <seqüência-de-comandos-1>
            caso <exp21>, <exp22>, ..., <exp2n>
               <seqüência-de-comandos-2>
            outrocaso
               <seqüência-de-comandos-extra>
        fimescolha
         */
        /*
        switch(<expressão-de-seleção>){
            case <exp11>:
                <seqüência-de-comandos-1>
                break;
            default:
                <seqüência-de-comandos-extra>
        }
        */

        saldo = 1;
        switch (saldo) {
            case 1:
                System.out.println("Saldo = 1");
                break;
            default:
                System.out.println("Valor invalido");
        }
    }
}
