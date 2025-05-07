import javax.swing.JOptionPane;

public class exercicio1 {

	public static void main(String[] args) {
		String nome, cargo;
		int funcionarios;
		double salario, acumulador = 0, aumento, novosalario;
		
		funcionarios = Integer.parseInt(JOptionPane.showInputDialog("Favor digitar a quantidade de funcionários que deseja calcular."));
		
		for(int i = 1; i <= funcionarios; i++){
			nome = JOptionPane.showInputDialog("Favor digitar seu nome.");
			cargo = JOptionPane.showInputDialog("Favor digitar seu cargo.");
			salario = Double.parseDouble(JOptionPane.showInputDialog("Favor digitar o valor de seu salário."));
			
			aumento = salario * 0.05;
			novosalario = salario + (salario * aumento);
			
			acumulador = acumulador + novosalario;
		}
		
		JOptionPane.showMessageDialog(null, "Soma dos salários: " + acumulador);
	}

}
