
public class Animal {
	private String nome;
	private float comprimento;
	private String cor;
	private String ambiente;
	private float velocidadeMedia;


	//Construtor
	public Animal(String nome, float comprimento, String cor, String ambiente, float velocidadeMedia) {
		this.nome = nome;
		this.comprimento = comprimento;
		this.cor = cor;
		this.ambiente = ambiente;
		this.velocidadeMedia = velocidadeMedia;
	}
	
	// Método para exibir dados do animal
	public void dados(){
        System.out.println("Nome: " + nome);
        System.out.println("Comprimento: " + comprimento + " cm");
        System.out.println("Cor: " + cor);
        System.out.println("Ambiente: " + ambiente);
        System.out.println("Velocidade média: " + velocidadeMedia + " m/s");
	}
}