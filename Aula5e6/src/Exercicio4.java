import javax.swing.JOptionPane;


public class Exercicio4 {
	
	public static double media(){
		
		double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Favor digitar o valor de sua primeira nota."));
		double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Favor digitar o valor de sua segunda nota."));
		double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Favor digitar o valor de sua terceira nota."));
		
		double media = (nota1+nota2+nota3)/3;
		
		return media;
		
	}

	public static void main(String[] args) {

		double media = media();
		JOptionPane.showMessageDialog(null, "Sua média é de: " + media);
		System.exit(0);
		
	}

}
