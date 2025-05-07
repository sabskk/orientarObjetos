
public class Aquatico extends Transporte {
	private float altura;
	
	//Construtor
	public Aquatico(String descricao, float comprimento, float peso, float altura) {
		super(descricao, comprimento, peso);
		this.altura = altura;
	}
	
	//Método para exibir os dados do transporte
	public void dadosAquatico(){
		super.dados();
		System.out.print("Altura: " + altura);
	}
}
