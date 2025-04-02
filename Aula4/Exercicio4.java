import javax.swing.JOptionPane;

public class Exercicio4 {

	public static void main(String[] args) {
		String nome;
		int horastrabalhadas, funcionarios;
		double valorhora, salario;
		
		funcionarios = Integer.parseInt(JOptionPane.showInputDialog("Favor digitar o número de funcionários dos quais deseja calcular o INSS."));
		
		for (int i = 1; i <= funcionarios; i++){
			nome = JOptionPane.showInputDialog("Favor digitar o nome do funcionário.");
			valorhora = Double.parseDouble(JOptionPane.showInputDialog("Favor digitar o valor das horas trabalhadas pelo funcionário."));
			horastrabalhadas = Integer.parseInt(JOptionPane.showInputDialog("Favor digitar o número de horas trabalhadas pelo funcionário."));
			
			salario = valorhora * horastrabalhadas;
			double descontoinss = salario - (salario*0.2);
		}

	}

}
