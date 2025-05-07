
public class Aereo extends Transporte {
	private int passageiros;
	
	//Construtor
	public Aereo(String descricao, float comprimento, float peso, int passageiros) {
		super(descricao, comprimento, peso);
		this.passageiros = passageiros;
	}
	
	//M�todo para exibir os dados do transporte
	public void dadosAereo(){
		super.dados();
		System.out.print("N�mero de passageiros: " + passageiros);
	}
}

