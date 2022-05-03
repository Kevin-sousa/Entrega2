package controle;
import java.util.Scanner;
import java.util.ArrayList;
import model.Locatario;
import model.Reserva;
import model.VeiculoPasseio;


public class Menu {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static ArrayList<Locatario> locatario;
	public static ArrayList<VeiculoPasseio> veiculoPasseio;
	public static ArrayList<Reserva> reserva;
	
	public static void main(String[] args) {
		
		locatario = new ArrayList<Locatario>();
		veiculoPasseio = new ArrayList<VeiculoPasseio>();
		reserva = new ArrayList<Reserva>();
		
		locatario.add(new Locatario("Ana", "ana@gmail.com", "61123456789"));
		locatario.add(new Locatario("Jefferson", "jefferson@gmail.com", "61987654321"));
	
		int opcao = 0;
		
		while ((opcao = menu_principal()) != 4) {
			
			switch (opcao) {
	        case 1:
	        	menu_gerenciar_locatarios();
	            break;

	        case 2:
	        	menu_gerenciar_frota();
	            break;

	        case 3:
	        	menu_gerenciar_reserva();
	            break;
			}
		}
	}
	
	public static int menu_principal(){
		
		System.out.println("bem vindo ao sistema de controle locatario, para continuar selecione uma das seguintes opções:\n");
		System.out.println("Digite (1) - Gerenciar Locatários");
		System.out.println("Digite (2) - Gerenciar Frota");
		System.out.println("Digite (3) - Gerenciar Reservas");
		System.out.println("Digite (4) - Sair do Programa");
		int opcao = sc.nextInt();
		if(opcao>4 || opcao < 1) {
			System.out.println("Por favor informe um valor valido");
		}
		
		return opcao;
	}
	
	public static int menu_gerenciar_locatarios(){
		
		System.out.println("gerenciamento de locatarios, para continuar selecione uma das seguintes opções:");
		System.out.println("Digite (1) - Cadastrar Locatário");
		System.out.println("Digite (2) - Buscar Locatário");
		System.out.println("Digite (3) - listar Locatários");
		System.out.println("Digite (4) - Excluir locatário");
		System.out.println("Digite (5) - para voltar ao menu principal");
		
		int opcao = sc.nextInt();
		sc.nextLine();  
		switch (opcao) {
		
			case 1:
			Locatario.cadastraLocatario();
			break;
			
			case 2:
			Locatario.buscarLocatario(locatario);
			
			case 3:
			Locatario.listarLocatario();
			break;
			
			case 4:
			Locatario.deletarLocatario(locatario);
			break;
		}
		
		
		return opcao;
	}
	
	public static int menu_gerenciar_frota(){
			System.out.println("gerenciamento de frota, para continuar selecione uma das seguintes opções:");
			System.out.println("Digite (1) - Cadastrar veículos");
			System.out.println("Digite (2) - Pesquisar Veículo");
			System.out.println("Digite (3) - Atualizar dados de um veículo");
			System.out.println("Digite (4) - Remover veículo da frota");
			System.out.println("Digite (5) - para voltar ao menu principal");
			
			int opcao = sc.nextInt();
			sc.nextLine();  
			switch (opcao) {
			
				case 1:
				VeiculoPasseio.cadastrarVeiculoPasseio();
				break;
				
				case 2:
				VeiculoPasseio.listarVeiculoPasseio();
				
				case 3:
				VeiculoPasseio.editarVeiculoPasseio(veiculoPasseio);
				break;
				
				case 4:
				VeiculoPasseio.deletarVeiculoPasseio(veiculoPasseio);
				break;
			}
			
			
			return opcao;
	}
			
	public static void menu_cadastra_veiculo(){
		
		System.out.println("Digite (1) - Cadastrar veiculo de passeio");
		System.out.println("Digite (2) - Cadastrar veículo utilitário");
		System.out.println("Digite (3) - Cadastrar Motocicleta");
		System.out.println("Digite (4) - para voltar ao menu principal");	
		
	}
	
	public static void menu_pesquisa_veiculo(){
		System.out.println("Digite (1) - Pesquisar veículo pelo Renavam");
		System.out.println("Digite (2) - Pesquisar veículo por marca, modelo ou renavam");
		System.out.println("Digite (3) - para voltar ao menu principal");	
	}
	
	public static void menu_gerenciar_reserva(){
		System.out.println("gerenciamento de reserva");
		System.out.println("Digite (1) - fazer nova reserva");
		
		int opcao = sc.nextInt();
		sc.nextLine();  
		switch (opcao) {
		
			case 1:
			Reserva.cadastraReserva();
			break;
			
		}
	}
}
