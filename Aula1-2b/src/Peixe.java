
public class Peixe extends Animal {
	private String tipoAgua;

	// Construtor
	public Peixe(String nome, float comprimento, String cor, String ambiente, float velocidadeMedia, String tipoAgua){
		super(nome, comprimento, cor, ambiente, velocidadeMedia);
		this.tipoAgua = tipoAgua;
	}
	
	// Método para exibir os dados do peixe
	public void dadosPeixe(){
		super.dados(); // Chamar a função do pai
		System.out.println("Tipo de Água: " + tipoAgua);
	}
}
