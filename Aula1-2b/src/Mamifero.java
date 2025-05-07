
public class Mamifero extends Animal {
	private int numeroPatas;
	
	// Construtor 
	public Mamifero(String nome, float comprimento, String cor, String ambiente, float velocidadeMedia, int numeroPatas){
		super(nome, comprimento, cor, ambiente, velocidadeMedia);
		this.numeroPatas = numeroPatas;
	}
	
	// Método para exibir os dados do peixe
	public void dadosMamifero(){
		super.dados(); // Chamar a função do pai
		System.out.print("Número de patas: " + numeroPatas);
	}
}
