import javax.swing.JOptionPane;

public class Exercicio4 {

	public static void main(String[] args) {
		String nome;
		int horastrabalhadas, funcionarios;
		double valorhora, salario;
		
		funcionarios = Integer.parseInt(JOptionPane.showInputDialog("Favor digitar o n�mero de funcion�rios dos quais deseja calcular o INSS."));
		
		for (int i = 1; i <= funcionarios; i++){
			nome = JOptionPane.showInputDialog("Favor digitar o nome do funcion�rio.");
			valorhora = Double.parseDouble(JOptionPane.showInputDialog("Favor digitar o valor das horas trabalhadas pelo funcion�rio."));
			horastrabalhadas = Integer.parseInt(JOptionPane.showInputDialog("Favor digitar o n�mero de horas trabalhadas pelo funcion�rio."));
			
			salario = valorhora * horastrabalhadas;
			double descontoinss = salario - (salario*0.2);
		}

	}

}
