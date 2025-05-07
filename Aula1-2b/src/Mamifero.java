
public class Mamifero extends Animal {
	private int numeroPatas;
	
	// Construtor 
	public Mamifero(String nome, float comprimento, String cor, String ambiente, float velocidadeMedia, int numeroPatas){
		super(nome, comprimento, cor, ambiente, velocidadeMedia);
		this.numeroPatas = numeroPatas;
	}
	
	// M�todo para exibir os dados do peixe
	public void dadosMamifero(){
		super.dados(); // Chamar a fun��o do pai
		System.out.print("N�mero de patas: " + numeroPatas);
	}
}
