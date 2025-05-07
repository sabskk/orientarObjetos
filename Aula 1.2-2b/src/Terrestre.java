
public class Terrestre extends Transporte {
	private int rodas;
	
	//Construtor
	public Terrestre(String descricao, float comprimento, float peso, int rodas) {
		super(descricao, comprimento, peso);
		this.rodas = rodas;
	}
	
	//Método para exibir os dados do transporte
	public void dadosTerrestre(){
		super.dados();
		System.out.print("Número de Rodas: " + rodas);
	}
}
