
package declaracaovariaveis;

public class DeclaracaoVariaveis {
    /*
        #VisuAlg
        Estrutura
            <Nome da Variavel> : < Tipo de dado >
            saldo: real
     */
    /*
        #JAVA
        Estrutura básica
            <Tipo de dado> <Nome da Variavel>
            int saldo;
     */
    public static void main(String[] args) {
        //int num sorte <- não funciona porque não pode existir espaços na declaração
        //int %num1 <- Também não funciona porque não pode 
        //começar com caracteres especiais ou numeriocos

        byte numBemPequeno = 0; //<- Camel case
        short numPequeno = 0;
        int num1 = 1;
        float num2 = 2.0f;
        double num3 = 4.251; // inteiros ou fracionarios
        long num4 = 1294898312; //somente inteiros
        char letra = 1; //o Char receber um inteiro que corresponde a tabela ASCII
        boolean verdade = true; // receber um valor verdade
        String nome = "minicurso"; // Essa tipo de variavel não é um tipo primitivo
        // mas já vem importada no pacote java.lang 
        //(importe nativo e automatico)
        
        //Teste
        System.out.println(nome);
    }

}
