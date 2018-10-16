package classes_metodos;

public class Classes_Metodos {

    //Qualquer classe pode acessar essa variavel
    public String nome;
    //O modificador protected torna o membro 
    //acessível às classes do mesmo pacote ou através de herança
    protected double valor;
    // Essa visibilidade restringe o acesso da 
    //variavel somente a class que ela pertence
    private int saldo;
   
    
    // void significa sem retorno
    public void listar() {

    }
    
    // quando o metodo tem um tipo necessariamente ele precisa retornar algo
    public int getSaldo() {
        return this.saldo;
    }
    
    //metodo princinpal
    public static void main(String[] args) {
        
    }
}
