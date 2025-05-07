
public class Ave extends Animal {
	private String tipoBico;
	
	// Construtor
	public Ave(String nome, float comprimento, String cor, String ambiente, float velocidadeMedia, String tipoBico){
		super(nome, comprimento, cor, ambiente, velocidadeMedia);
		this.tipoBico = tipoBico;
	}
	
	// Método para exibir os dados do peixe 
	public void dadosAve(){
		super.dados(); // Chamar a função do pai
		System.out.print("Número de patas: " + tipoBico);
	}
}
