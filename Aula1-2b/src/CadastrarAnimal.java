import java.util.Scanner;

public class CadastrarAnimal {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
        
        // Escolher o tipo de animal
        System.out.println("Escolha o tipo de animal: ");
        System.out.println("1 - Peixes");
        System.out.println("2 - Mam�meros");
        System.out.println("3 - Aves");
        int escolha = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer de entrada
        
        // Perguntar os dados comuns para todos os animais
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        
        System.out.print("Comprimento: ");
        float comprimento = scanner.nextFloat();
        
        System.out.print("Cor: ");
        String cor = scanner.nextLine();
        scanner.nextLine();
        
        System.out.print("Ambiente: ");
        String ambiente = scanner.nextLine();
        
        System.out.print("Velocidade M�dia: ");
        float velocidadeMedia = scanner.nextFloat();
        
        if (escolha == 1){
        	// Dados espec�ficos do Peixe
        	System.out.print("Tipo de �gua: ");
        	String tipoAgua = scanner.nextLine();
        	
        	// Criar objeto do Peixe
        	Peixe peixe = new Peixe(nome, comprimento, cor, ambiente, velocidadeMedia, tipoAgua);
        	System.out.print(" ");
        	System.out.print("Relat�rio do Peixe: ");
        	peixe.dadosPeixe();
        }
        else if (escolha == 2){
        	// Dados espec�ficos do Mam�fero
        	System.out.print("N�mero de Patas: ");
        	int numeroPatas = scanner.nextInt();
        	
        	// Criar objeto do Mam�fero
        	Mamifero mamifero = new Mamifero(nome, comprimento, cor, ambiente, velocidadeMedia, numeroPatas);
        	System.out.print("Relat�rio do Mam�fero: ");
        	mamifero.dadosMamifero();
        }
        else if (escolha == 3){
        	// Dados espec�ficos da Ave
        	System.out.print("Tipo de Bico: ");
        	String tipoBico = scanner.nextLine();
        	scanner.nextLine();
        	
        	// Criar objeto do Mam�fero
        	Ave ave = new Ave(nome, comprimento, cor, ambiente, velocidadeMedia, tipoBico);
        	System.out.print(" ");
        	System.out.print("Relat�rio da Ave: ");
        	ave.dadosAve();
        }
	}
}
