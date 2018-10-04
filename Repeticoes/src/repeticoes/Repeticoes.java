package repeticoes;

public class Repeticoes {

    public static void main(String[] args) {
        /*
        #VISUALG
        enquanto <expressão-lógica> faca
            <seqüência-de-comandos>
        fimenquanto
         */
        //enquanto
        int condicional = 1;
        while (condicional <= 10) {
            System.out.println("Estou aprendendo while em JAVA");
            System.out.println(condicional);
            condicional = condicional + 1;
        }
        
        
        
        /*
        #Visualg
        para <variável> de <valor-inicial> ate <valor-limite> [passo <incremento>] faca
           <sequência-de-comandos>
        fimpara
        */
        //para
        for (int contador = 1; contador <= 10; contador++) {
            System.out.println("Estou aprendendo for em JAVA");
            System.out.println(contador);
        }
        
    }

}
