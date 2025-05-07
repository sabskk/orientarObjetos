import javax.swing.JOptionPane;

public class Exercicio3 {

	public static void main(String[] args) {
		String nome, classificacao = null;
		int pessoas;
		double altura, peso, imc;
		
		pessoas = Integer.parseInt(JOptionPane.showInputDialog("Favor digitar a quantidade de pessoas das quais deseja calcular o IMC."));
		
		for(int i = 1; i <= pessoas; i++){
			nome = JOptionPane.showInputDialog("Favor digitar seu nome.");
			altura = Double.parseDouble(JOptionPane.showInputDialog("Favor digitar sua altura."));
			peso = Double.parseDouble(JOptionPane.showInputDialog("Favor digitar seu peso."));
			
			imc = peso / (altura*altura);
			
			if (imc < 18.5){
				classificacao = "Abaixo do Peso.";
			}
			else if (imc >= 18.5 & imc < 24.9){
				classificacao = "Normal.";
			}
			else if (imc >= 24.9 & imc < 29.9){
				classificacao = "Sobrepeso.";
			}
			else if (imc >= 29.9 & imc < 34.9){
				classificacao = "Obesidade grau 1.";
			}
			else if (imc >= 34.9 & imc < 39.9){
				classificacao = "Obesidade grau 2.";
			}
			else if (imc >= 39.9){
				classificacao = "Obesidade mórbida.";
			}
			
			JOptionPane.showMessageDialog(null, "Olá, "+nome+"! Seu IMC é de: "+imc+". Sua classificação é: "+classificacao);
		}
	}

}
