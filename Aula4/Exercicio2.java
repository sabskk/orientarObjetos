import javax.swing.JOptionPane;


public class Exercicio2 {

	public static void main(String[] args) {
		double altura, base, area;
		
		altura = Double.parseDouble(JOptionPane.showInputDialog("Favor digitar a altura de seu tri�ngulo: "));
		base = Double.parseDouble(JOptionPane.showInputDialog("Favor digitar a base de seu tri�ngulo: "));
		
		area = (altura * base)/2;
		
		JOptionPane.showMessageDialog(null,"�rea do tri�ngulo: " + area);
	}
	
	
}
