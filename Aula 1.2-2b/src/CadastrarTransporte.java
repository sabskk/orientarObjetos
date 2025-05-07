import java.util.Scanner;

public class CadastrarTransporte {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		//Escolher o tipo de transporte
		System.out.println("Escolha o tipo de transporte: ");
        System.out.println("1 - Aqu�tico");
        System.out.println("2 - A�reo");
        System.out.println("3 - Terrestre");
        int escolha = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer de entrada
	
     // Perguntar os dados comuns para todos os transportes
        System.out.print("Descri��o: ");
        String descricao = scanner.nextLine();
        
        System.out.print("Comprimento: ");
        float comprimento = scanner.nextFloat();
        
        System.out.print("Peso: ");
        float peso = scanner.nextFloat();
        
        if (escolha == 1){
        	// Dados espec�ficos do Aqu�tico
        	System.out.print("Altura: ");
        	float altura = scanner.nextInt();
        	
        	// Criar objeto do Aqu�tico
        	Aquatico aquatico = new Aquatico(descricao, comprimento, peso, altura);
        	aquatico.dadosAquatico();
        }
        else if (escolha == 2){
        	// Dados espec�ficos do A�reo
        	System.out.print("N�mero de Passageiros: ");
        	int passageiros = scanner.nextInt();
        	
        	// Criar objeto do A�reo
        	Aereo aereo = new Aereo(descricao, comprimento, peso, passageiros);
        	aereo.dadosAereo();
        }
        else if (escolha == 3){
        	// Dados espec�ficos do Terrestre
        	System.out.print("N�mero de rodas: ");
        	int rodas = scanner.nextInt();
        	
        	// Criar objeto do Terrestre
        	Terrestre terrestre = new Terrestre(descricao, comprimento, peso, rodas);
        	terrestre.dadosTerrestre();
        }
	}
}
