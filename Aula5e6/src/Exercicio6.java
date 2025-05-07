import javax.swing.JOptionPane;

public class Exercicio6 {

	public static void resposta(){
		
		double v1 = Double.parseDouble(JOptionPane.showInputDialog("Favor inserir o primeiro valor."));
		double v2 = Double.parseDouble(JOptionPane.showInputDialog("Favor inserir o segundo valor."));
		
		String sigla = JOptionPane.showInputDialog("Favor escolher a operação matemática." + "\n" +
		                                           "A - Adição" + "\n" +
				                                   "S - Subtração" + "\n" + 
				                                   "M - Multiplicação" + "\n" + 
				                                   "D - Divisão");
				                                   
		if (sigla.equalsIgnoreCase("A")){
			double resultado = v1 + v2;
			JOptionPane.showMessageDialog(null, "O resultado é: " + resultado);
		}
		else if (sigla.equalsIgnoreCase("S")){
			double resultado = v1 - v2;
			JOptionPane.showMessageDialog(null, "O resultado é: " + resultado);
		}
		else if (sigla.equalsIgnoreCase("M")){
			double resultado = v1 * v2;
			JOptionPane.showMessageDialog(null, "O resultado é: " + resultado);
		}
		else if (sigla.equalsIgnoreCase("D")){
			double resultado = v1 / v2;
			JOptionPane.showMessageDialog(null, "O resultado é: " + resultado);
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
