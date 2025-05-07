
public class Aereo extends Transporte {
	private int passageiros;
	
	//Construtor
	public Aereo(String descricao, float comprimento, float peso, int passageiros) {
		super(descricao, comprimento, peso);
		this.passageiros = passageiros;
	}
	
	//Método para exibir os dados do transporte
	public void dadosAereo(){
		super.dados();
		System.out.print("Número de passageiros: " + passageiros);
	}
}

