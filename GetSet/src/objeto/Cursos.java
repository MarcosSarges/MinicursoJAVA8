package objeto;
/*
 *#Pacote objeto dentro dele tem nossa classe Curso
 *
 *Este pacote e classe foi criada para guarda nosso objetos,em seguir vamos chamar na classe GetSet para verificar os item
 *
 *#this 
 *  
 *  Auto-referência ao próprio contexto em que se encontra,
 *  com isso Objeto superior se declara para o objeto criado durante um método.
 *  <this><.><Objeto> = <objeto criado pelo metodo,void publica>;
 *  
 *  #void
 *  
 *  Void é uma subrotina que retorna vazio,ja um método e uma função que tem a combinação dos dois objetivo em uma so rotina,
 *  então métedo e uma partido das interação dentro da classe
 *  
*/
public class Cursos {
		//declarando a variavel privada.
	
		
		private String  minicurso; 		
		private String  curso;
	
		public String getCurso() {
			return curso;
		}

		public void setCurso(String curso) {
			this.curso = curso;
		}

		//Aplicando o get para puxar o valor. 	
		public String getMinicurso() {
			
			//para reporta um valor privado podemos usar o return, retorne o valor para varificar;
			return minicurso;
			
			}

		//Aplicando o set para  colocar um valor.	
		public void setMinicurso(String setvalor) {
			this.minicurso = setvalor;
			
		}

		
}
