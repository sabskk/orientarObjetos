import java.util.Scanner;

public class CadastrarTransporte {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		//Escolher o tipo de transporte
		System.out.println("Escolha o tipo de transporte: ");
        System.out.println("1 - Aquático");
        System.out.println("2 - Aéreo");
        System.out.println("3 - Terrestre");
        int escolha = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer de entrada
	
     // Perguntar os dados comuns para todos os transportes
        System.out.print("Descrição: ");
        String descricao = scanner.nextLine();
        
        System.out.print("Comprimento: ");
        float comprimento = scanner.nextFloat();
        
        System.out.print("Peso: ");
        float peso = scanner.nextFloat();
        
        if (escolha == 1){
        	// Dados específicos do Aquático
        	System.out.print("Altura: ");
        	float altura = scanner.nextInt();
        	
        	// Criar objeto do Aquático
        	Aquatico aquatico = new Aquatico(descricao, comprimento, peso, altura);
        	aquatico.dadosAquatico();
        }
        else if (escolha == 2){
        	// Dados específicos do Aéreo
        	System.out.print("Número de Passageiros: ");
        	int passageiros = scanner.nextInt();
        	
        	// Criar objeto do Aéreo
        	Aereo aereo = new Aereo(descricao, comprimento, peso, passageiros);
        	aereo.dadosAereo();
        }
        else if (escolha == 3){
        	// Dados específicos do Terrestre
        	System.out.print("Número de rodas: ");
        	int rodas = scanner.nextInt();
        	
        	// Criar objeto do Terrestre
        	Terrestre terrestre = new Terrestre(descricao, comprimento, peso, rodas);
        	terrestre.dadosTerrestre();
        }
	}
}
