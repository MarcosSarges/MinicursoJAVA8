package repeticoes;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class Repeticoes {
    //Dialog para setar a posição do JOptionPane
    static JDialog d = null;
    
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
            final JOptionPane pane = new JOptionPane("Estou aprendendo WHILE em JAVA\n"+"Contador = "+condicional, JOptionPane.WARNING_MESSAGE);
            d = pane.createDialog(null, "While");
            d.setLocation(500,300); //(x,y)
            d.setVisible(true);
            //System.out.println("Estou aprendendo while em JAVA");
            //System.out.println(condicional);
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
            final JOptionPane pane = new JOptionPane("Estou aprendendo FOR em JAVA\n"+"Contador = "+contador, JOptionPane.WARNING_MESSAGE);
            d = pane.createDialog(null, "While");
            d.setLocation(300,300); //(x,y)
            d.setVisible(true);
            //System.out.println("Estou aprendendo for em JAVA");
            //System.out.println(contador);
        }
    }
}
