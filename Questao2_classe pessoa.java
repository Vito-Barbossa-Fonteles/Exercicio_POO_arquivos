package Objetos;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import javax.swing.JOptionPane;
public class Pessoa {
	NumberFormat formatar = new DecimalFormat("#,##0.00"); 
	private int quantidade_mulheres=0,maior_idade=0,menor_idade=0,idade_menor_salario = 0,contador=1;
	public int idade=10;
	private String sexo_menor_salario ="0",sexo="0";
	private double salario=0,menor_salario = 0,media_salarios=0,salario_menor = 0;
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public void Pesquisa_calcular_idade() {		
		while(idade!=0){		
			try {
			idade=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a idade : "));
			if(contador<=2&&idade==0){
				JOptionPane.showMessageDialog(null, "Insira mais de 1 pessoa para caracterizar um grupo.\n Insira novamente o dado.");
				idade=1;
				continue;
			}else if(idade==0){
				contador--;
				break;
				}else if(idade<0) {
					JOptionPane.showMessageDialog(null,"Idade negativa! insira o dado novamente.",null, JOptionPane.ERROR_MESSAGE);
					continue;					
				}									
			}catch(NumberFormatException e) {	
				e.getCause();
				JOptionPane.showMessageDialog(null, "OPA! entrada inválida! os dados não serão computados\n tente novamente\n"+e);
						
						continue;
			}catch(NullPointerException e) {
				e.getCause();
				JOptionPane.showMessageDialog(null, "OPA! entrada inválida! os dados não serão computados\n tente novamente\n"+e);     				       
				        continue;
			}				
			if(contador==1) {
				menor_idade=idade;
				maior_idade=idade;			
			}					
			if(idade!=0) {						
			if(idade>maior_idade)
				maior_idade=idade;
			else if(idade<menor_idade)
				menor_idade=idade;
		}				
			break;
		}		
	}
        
    /////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void Pesquisa_calcular_sexo() {
    	while(idade!=0) {
    		try {    			
    	sexo=JOptionPane.showInputDialog(null,"Digite o sexo  : ");			
		if(!sexo.equals("F")&&!sexo.equals("M")) {
			JOptionPane.showMessageDialog(null, "Digite apenas F ou M! Insira novamente o dado.");
			continue;
		}
    	}catch(NullPointerException e) {
    		e.getCause();
			JOptionPane.showMessageDialog(null, "OPA! entrada inválida! Insira o dado novamente\n."+e);     
			        continue;
		}  
    		if(sexo.equals("F"))
    			quantidade_mulheres++;
    		break;
		}				  	    	
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////
      public void Pesquisa_calcular_salario() {  	
    	while(idade!=0) {   		  
    		try {    		
    	salario=Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o salário : "));   	
    	if(salario<=0) {
    		JOptionPane.showMessageDialog(null,"Salário inválido! Insira novamente o dado.");
    		continue;
    	}    	
    		}catch(NumberFormatException e) {
    			e.getCause();
    			JOptionPane.showMessageDialog(null, "OPA! entrada inválida! \n insira os dados novamente."+e);	
    			continue;
    		}   		
    		media_salarios+=salario;
    		if(contador==1)
    		menor_salario=salario;    		
    		if(idade!=0) {				
    			if(salario<=menor_salario) {
    				sexo_menor_salario=sexo;
    				idade_menor_salario=idade;
    				menor_salario=salario;
    				salario_menor=salario;    				    				
    			}
    	}   
    		contador++;
    	break;	
    }      	
    }
      ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void pesquisa_finalizar() {
    	media_salarios/=contador;
    	JOptionPane.showMessageDialog(null,"A média dos salários é "+formatar.format (media_salarios)+"\n A maior idade é "+maior_idade+"\n A menor idade é "
				+menor_idade+"\n A quantidade de mulheres é "+quantidade_mulheres+"\n a pessoa com o menor salário tem "+idade_menor_salario
				+" anos, sexo "+sexo_menor_salario+" e salario de "+formatar.format (menor_salario));
    }   
}
