package tabuada;

import javax.swing.JOptionPane;

public class princ {

	public static void main(String[] args) {
		String result = " ";
		int num;
		
		JOptionPane.showMessageDialog(null, "Bem Vindo(a) ao Tutor Tabuada");
		num = Integer.parseInt(JOptionPane.showInputDialog(null, "Indique o numero para gerar a tabuada"));
		
		for (int i=0; i<=10; i++ ) {
			int mult = num*i;
			result += num + " x " + i + " = " + mult+"\n"; //Aqui vai armazenar todos os resultados
			
			JOptionPane.showMessageDialog(null, result); //Aqui so vai mostrar o resultado
			
			if (i == 9) {
				JOptionPane.showMessageDialog(null, " Tabuada "+ " Do "+ num + " Concluida! ");
				
			} 
			
		}

	}

}
