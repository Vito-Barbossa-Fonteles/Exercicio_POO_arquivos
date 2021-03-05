package Objetos;

import javax.swing.JOptionPane;

public class Pera {
	private int quantidade;
    private double valor;
	
	
	public void  Calcular_valor_pera() {
		for(;;) {			
			try{
				quantidade=Integer.parseInt(JOptionPane.showInputDialog(null,"Promoção das peras! compras apartir de 12 unidades saem por 0.75 cada unidade!\nDigite o número de peras compradas:")); 						
		if (quantidade > 0 &&quantidade %2==0||quantidade %2==1) {					
			if(quantidade<12) {
				valor=quantidade*1;
				JOptionPane.showMessageDialog(null,"sem desconto! o valor total  da compra saiu"
						+ " por : "+valor+" reais");
			}else {
				valor= quantidade*0.75;		
			JOptionPane.showMessageDialog(null,"com desconto! o valor total  da compra saiu"
					+ " por : "+valor+" reais");
			}					
			break;			
		}else
			JOptionPane.showMessageDialog(null,"Números negativos não permitidos,\n "
			  		+ "tente novamente.","Erro",JOptionPane.ERROR_MESSAGE);
			} catch(NumberFormatException e) { 
				e.getCause();
		  JOptionPane.showMessageDialog(null,"Opa, algo de errado não está certo!\n formato de entrada inválido,\ntente novamente.\n"+e,null, JOptionPane.ERROR_MESSAGE);
      }			
}
		
	}

}
