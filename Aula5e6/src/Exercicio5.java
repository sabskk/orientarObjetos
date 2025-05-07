import javax.swing.JOptionPane;


public class Exercicio5 {
	
	public static void resposta(){
	
		String sigla = JOptionPane.showInputDialog("Favor escolher seu estado civil." + "\n" +
		                                           "S - Solteiro" + "\n" +
				                                   "C - Casado" + "\n" + 
				                                   "V - Viúvo" + "\n" + 
				                                   "D - Divorciado");
				                                   
		if (sigla.equalsIgnoreCase("S")){
			JOptionPane.showMessageDialog(null, "Você é solteiro.");
		}
		else if (sigla.equalsIgnoreCase("C")){
			JOptionPane.showMessageDialog(null, "Você é casado.");
		}
		else if (sigla.equalsIgnoreCase("V")){
			JOptionPane.showMessageDialog(null, "Você é viúvo.");
		}
		else if (sigla.equalsIgnoreCase("D")){
			JOptionPane.showMessageDialog(null, "Você é divorciado.");
		}
		else{
			JOptionPane.showMessageDialog(null, "Erro.");
		}
	}

	public static void main(String[] args) {
		
		resposta();
		System.exit(0);

	}

}
