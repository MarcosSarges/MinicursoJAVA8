package classes_metodos;

/* os modificadores como são chamados são (public, private e protected)
*  eles servem tanto para Variaveis quanto para Metodos
*
*  Exemplo: <modificador> <tipo_da_variavel> <nome_da_variavel>
*/

public class Classes_Metodos {

    //Qualquer classe pode acessar essa variavel por ser public
    public String nome;

    //O modificador protected torna a variavel
    //acessível às classes do mesmo pacote ou através de herança
    protected double valor;

    // Essa visibilidade restringe o acesso da
    //variavel somente a classe que ela pertence
    private int saldo;

    // void significa sem retorno
    public void listar() {
    }

    // quando o metodo tem um tipo necessariamente precisa retornar algo
    public int getSaldo() {
        return this.saldo;
    }

    //metodo princinpal (metodo main onde faz o programa rodar)
    public static void main(String[] args) {
    }
}
