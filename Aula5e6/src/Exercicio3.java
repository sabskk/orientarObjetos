import javax.swing.JOptionPane;

public class Exercicio3 {
	
	public static double calcular(){
		
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Favor digitar o valor de sua altura."));
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Favor digitar o valor de seu peso."));
		double imc = peso/(altura*altura);
		
		return imc;
		
	}
	
	public static void main(String[] args) {
		
		double imc = calcular();
		JOptionPane.showMessageDialog(null, "Seu IMC é de: " + imc);
		System.exit(0);

	}

}

