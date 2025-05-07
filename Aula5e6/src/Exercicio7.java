import javax.swing.JOptionPane;

public class Exercicio7 {

	public static void resposta(){
		int almo = 1, prod = 1, cont = 1;
		int entrevistados = Integer.parseInt(JOptionPane.showInputDialog("Favor escolher a operação matemática."));
		String sigla = JOptionPane.showInputDialog("Favor escolher a operação matemática." + "\n" +
		                                           "A - Almoxarifado" + "\n" +
				                                   "P - Produção" + "\n" + 
				                                   "C - Contabilidade");
				                                   
		if (sigla.equalsIgnoreCase("A")){
			almo = almo+1;
		}
		else if (sigla.equalsIgnoreCase("S")){
			prod = prod+1;
		}
		else if (sigla.equalsIgnoreCase("M")){
			cont = cont+1;
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