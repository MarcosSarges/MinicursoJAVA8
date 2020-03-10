package getset;

import objeto.Cursos;//importando a classe com objetos

/* 
 * 	Tem dois tipo de visualização de variavel no java a (+)publica e (-)privada.
 *  <Public> <Tipo da variavel> <Nome da variavel> = <valor>   [Poder ser visulaizada entre class]
 *  <Private> <Tipo da variavel> <Nome da variavel> = <valor>  [So poder ser visulaizada dentro da propria class]
 * 
 * 
 *  #getters
 *  
 *  É usado para pegar o valor da variavel que esta protegida com termo private.
 * 
 *  
 *  #setters
 *  
 *  É usado para colocar um valor na variavel que esta protegida com termo private
 *  
 *  Ante de iniciar processo de get e set temos que criar um pacote com objetos/classe dentro para 
 *  depos import o pacote com os objtos e depois criar ponte de visulaização entre as nossas classes.
 *  
 */





public class GetSet {  
	
	
	Cursos ligacaoGlobal = new Cursos();
 
	//Public void main e função pricipal,que recebe e verifica tudo.	
	
	public static void main(String[] args) {
	
	// Criando uma ligação entre as classes 
	// new fazer com que objeto do class Curso aparece dentro da nossa class GetSet,esse objeto vamos chamar de ligacao;
	//primeiro vamos coloca valor String na metodo set e depois vamos varificar o valor no main usando get dentro de uma print;

	
	Cursos ligacao = new Cursos();
	ligacao.setMinicurso("MiniCurso de java");
	//agora vamos print o valor com nosso metodo get ou pode chamar direto com parameto dentro da nossa ligacao
	
	
	//<System = no sistema>.<out =coloque>.<print = na tela>(<argumento ou outra coisa>);
	System.out.println(ligacao.getMinicurso()); 
	
	//println para pular linha durante o print
	System.out.println(colocar());
	
}
	public static String colocar() //uma função static que returna uma String 
	{
		Cursos ligacaofuncao = new Cursos(); // fazendo coneção com classe dentro da função
		ligacaofuncao.setCurso("Java");     
		
		return "Um curso de " + ligacaofuncao.getCurso(); //retornado o valor da Strind da função e nome setado
	}	

}
