
public class Transporte {
	private String descricao;
	private float comprimento;
	private float peso;


	//Construtor
	public Transporte(String descricao, float comprimento, float peso) {
		this.descricao = descricao;
		this.comprimento = comprimento;
		this.peso = peso;
	}
	
	// M�todo para exibir dados do transporte
	public void dados(){
    	System.out.print(" ");
    	System.out.print("Relat�rio do Transporte: ");
        System.out.println("Descri��o: " + descricao);
        System.out.println("Comprimento: " + comprimento + " cm");
        System.out.println("Peso: " + peso);
	}
}

