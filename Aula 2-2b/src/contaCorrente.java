
public class contaCorrente {
	public int cod;
	public String cliente;
	public float saldo;
	
	public contaCorrente(int cod, String cliente, float saldo) {
		this.cod = cod;
		this.cliente = cliente;
		this.saldo = saldo;
	}
	
	public void dados(){
        System.out.println("Nome: " + nome);
        System.out.println("Comprimento: " + comprimento + " cm");
        System.out.println("Cor: " + cor);
        System.out.println("Ambiente: " + ambiente);
        System.out.println("Velocidade média: " + velocidadeMedia + " m/s");
	}
}
