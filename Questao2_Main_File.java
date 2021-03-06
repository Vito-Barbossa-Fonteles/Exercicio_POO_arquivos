package Main;

import Objetos.Pessoa;

public class Exercicio_1_pesquisa {
	public static void main(String args[]) {
	
		Pessoa pessoa=new Pessoa();

			for(;pessoa.idade!=0;) {				
				pessoa.Pesquisa_calcular_idade();				
				pessoa.Pesquisa_calcular_sexo();
				pessoa.Pesquisa_calcular_salario();			
			}			
			pessoa.pesquisa_finalizar();
					
	}

}
