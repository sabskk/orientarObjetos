import java.util.Scanner;

public class CadastrarAnimal {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
        
        // Escolher o tipo de animal
        System.out.println("Escolha o tipo de animal: ");
        System.out.println("1 - Peixes");
        System.out.println("2 - Mamímeros");
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
        
        System.out.print("Velocidade Média: ");
        float velocidadeMedia = scanner.nextFloat();
        
        if (escolha == 1){
        	// Dados específicos do Peixe
        	System.out.print("Tipo de Água: ");
        	String tipoAgua = scanner.nextLine();
        	
        	// Criar objeto do Peixe
        	Peixe peixe = new Peixe(nome, comprimento, cor, ambiente, velocidadeMedia, tipoAgua);
        	System.out.print(" ");
        	System.out.print("Relatório do Peixe: ");
        	peixe.dadosPeixe();
        }
        else if (escolha == 2){
        	// Dados específicos do Mamífero
        	System.out.print("Número de Patas: ");
        	int numeroPatas = scanner.nextInt();
        	
        	// Criar objeto do Mamífero
        	Mamifero mamifero = new Mamifero(nome, comprimento, cor, ambiente, velocidadeMedia, numeroPatas);
        	System.out.print("Relatório do Mamífero: ");
        	mamifero.dadosMamifero();
        }
        else if (escolha == 3){
        	// Dados específicos da Ave
        	System.out.print("Tipo de Bico: ");
        	String tipoBico = scanner.nextLine();
        	scanner.nextLine();
        	
        	// Criar objeto do Mamífero
        	Ave ave = new Ave(nome, comprimento, cor, ambiente, velocidadeMedia, tipoBico);
        	System.out.print(" ");
        	System.out.print("Relatório da Ave: ");
        	ave.dadosAve();
        }
	}
}
