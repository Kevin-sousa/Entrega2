package model;
import java.util.ArrayList;

import controle.Menu;

public class VeiculoPasseio extends Veiculo {
    private String tipoVeiculo;

    public VeiculoPasseio(String marca, String modelo, String renavam, String placa, float anoFabricacao, float anoModelo,
           float capacidadeTanque, float valorDiaria, float valorDiariaEmpresarial,
           float valorMensal, String tipoVeiculo) {
           super(marca, modelo, renavam, placa, anoFabricacao, anoModelo, capacidadeTanque, valorDiaria,
           valorDiariaEmpresarial, valorMensal);
           this.tipoVeiculo = tipoVeiculo;
    }

	public static void cadastrarVeiculoPasseio() {
		System.out.println("Digite a marca do VeiculoPasseio: ");
		String marca = Menu.sc.nextLine();

		System.out.println("Digite o modelo do VeiculoPasseio: ");
		String modelo = Menu.sc.nextLine();

		System.out.println("Digite o renavam do VeiculoPasseio: ");
		String renavam = Menu.sc.nextLine();

		System.out.println("Digite a placa do VeiculoPasseio: ");
		String placa = Menu.sc.nextLine();

		System.out.println("Digite o ano de fabricacao do VeiculoPasseio: ");
		float anoFabricacao = Menu.sc.nextFloat();
		Menu.sc.nextLine();

		System.out.println("Digite o ano do modelo do VeiculoPasseio: ");
		float anoModelo = Menu.sc.nextFloat();
		Menu.sc.nextLine();

		System.out.println("Digite a capacidade do tanque do VeiculoPasseio: ");
		float capacidadeTanque = Menu.sc.nextFloat();
		Menu.sc.nextLine();

		System.out.println("Digite o valor da diaria do VeiculoPasseio: ");
		float valorDiaria = Menu.sc.nextFloat();
		Menu.sc.nextLine();
		
		System.out.println("Digite o valor da diaria empresarial do VeiculoPasseio: ");
		float valorDiariaEmpresarial = Menu.sc.nextFloat();
		Menu.sc.nextLine();
		
		System.out.println("Digite o valor mensal do VeiculoPasseio: ");
		float valorMensal = Menu.sc.nextFloat();
		Menu.sc.nextLine();
		
		System.out.println("Digite o tipo do VeiculoPasseio: ");
		String tipoVeiculo = Menu.sc.nextLine();


		VeiculoPasseio veiculoPasseio = new VeiculoPasseio(marca, modelo, renavam, placa, anoFabricacao, anoModelo,
	            capacidadeTanque, valorDiaria, valorDiariaEmpresarial, valorMensal, tipoVeiculo);
		Menu.veiculoPasseio.add(veiculoPasseio);
	}

	public static void listarVeiculoPasseio() {
		for (int i = 0; i < Menu.veiculoPasseio.size(); i++) {
			System.out.print(i + " - ");
			System.out.println(Menu.veiculoPasseio.get(i));
			System.out.println("---------------\n");
		}
	}

	public static void editarVeiculoPasseio(ArrayList<VeiculoPasseio> veiculoPasseio) {

		System.out.println("Digite o número do VeiculoPasseio que deseja editar: ");
		int i = Menu.sc.nextInt();
		Menu.sc.nextLine();
		while (i > veiculoPasseio.size()) {
			System.out.println("Opcao invalida!\nTente novamente");
			i = Menu.sc.nextInt();
			Menu.sc.nextLine();
		}

		System.out.println("Digite a marca do VeiculoPasseio: ");
		String marca = Menu.sc.nextLine();

		System.out.println("Digite o modelo do VeiculoPasseio: ");
		String modelo = Menu.sc.nextLine();

		System.out.println("Digite o renavam do VeiculoPasseio: ");
		String renavam = Menu.sc.nextLine();

		System.out.println("Digite a placa do VeiculoPasseio: ");
		String placa = Menu.sc.nextLine();

		System.out.println("Digite o ano de fabricacao do VeiculoPasseio: ");
		float anoFabricacao = Menu.sc.nextFloat();
		Menu.sc.nextLine();

		System.out.println("Digite o ano do modelo do VeiculoPasseio: ");
		float anoModelo = Menu.sc.nextFloat();
		Menu.sc.nextLine();

		System.out.println("Digite a capacidade do tanque do VeiculoPasseio: ");
		float capacidadeTanque = Menu.sc.nextFloat();
		Menu.sc.nextLine();

		System.out.println("Digite o valor da diaria do VeiculoPasseio: ");
		float valorDiaria = Menu.sc.nextFloat();
		Menu.sc.nextLine();
		
		System.out.println("Digite o valor da diaria empresarial do VeiculoPasseio: ");
		float valorDiariaEmpresarial = Menu.sc.nextFloat();
		Menu.sc.nextLine();
		
		System.out.println("Digite o valor mensal do VeiculoPasseio: ");
		float valorMensal = Menu.sc.nextFloat();
		Menu.sc.nextLine();
		
		System.out.println("Digite o tipo do VeiculoPasseio: ");
		String tipoVeiculo = Menu.sc.nextLine();

		VeiculoPasseio veiculosPasseio = new VeiculoPasseio(marca, modelo, renavam, placa, anoFabricacao, anoModelo,
	            capacidadeTanque, valorDiaria, valorDiariaEmpresarial,
	            valorMensal, tipoVeiculo);
				veiculoPasseio.set(i, veiculosPasseio);
		System.out.println("VeiculoPasseio editado!\n");

	}

	public static void visualizarVeiculoPasseio() {
		for (int i = 0; i < Menu.veiculoPasseio.size(); i++) {
			System.out.print(i + " - ");
			System.out.println(Menu.veiculoPasseio.get(i));
			System.out.println("---------------\n");
		}
	}

	public static void deletarVeiculoPasseio(ArrayList<VeiculoPasseio> veiculoPasseio) {
		System.out.println("Digite o número do VeiculoPasseio que deseja remover");
		int i = Menu.sc.nextInt();
		Menu.sc.nextLine();

		veiculoPasseio.remove(i);
		System.out.println("VeiculoPasseio removido!\n");
	}
	
	public String getTipoVeiculo() {
		return tipoVeiculo;
	}

	public void setTipoVeiculo(String tipoVeiculo) {
		this.tipoVeiculo = tipoVeiculo;
	}

	public static void listarVeiculo() {
		for (int i = 0; i < Menu.veiculoPasseio.size(); i++) {
		            System.out.print(i + " - ");
		            System.out.println(Menu.veiculoPasseio.get(i));
		            System.out.println("__");
		        }
	}

	@Override
    public String toString() {
        return "Veiculo \nMarca do veiculo: " + marca + "\nModelo do carro: " + modelo
                + "\nrenavam: " + renavam + "\nPlaca:" + placa + "\nAno de faricação:" +
        		"\nAno do modelo:" + anoModelo + "\nCapacidade do Tanque:" + capacidadeTanque +
        		"\nvalor diaria:" + valorDiaria + "\nvalor diaria empresarial:" + valorDiariaEmpresarial 
        		+ "\nvalor mensal:" + valorMensal + "\ntipo do veiculo:" + tipoVeiculo;
    }      	          	 
}