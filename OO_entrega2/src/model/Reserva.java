package model;

import controle.Menu;

public class Reserva {

    private static Locatario locatario;
    private static VeiculoPasseio veiculoPasseio;

    public Reserva(Locatario locatario, VeiculoPasseio veiculoPasseio) {
        Reserva.locatario = locatario;
        Reserva.veiculoPasseio = veiculoPasseio;
    }

    public Locatario getLocatario() {
        return locatario;
    }

    public void setLocatario(Locatario locatario) {
        Reserva.locatario = locatario;
    }
    
    public Veiculo getVeiculoPasseio() {
        return veiculoPasseio;
    }

    public void setVeiculoPasseio(VeiculoPasseio veiculoPasseio) {
        Reserva.veiculoPasseio = veiculoPasseio;
    }
    public static void cadastraReserva() {
    	
    	System.out.println("Digite o nome do cliente: ");
    	String nome = Menu.sc.nextLine();
		try {
			for (Locatario c : Menu.locatario) {
				if (c.getNome().toUpperCase().equals(nome.toUpperCase())) {
					System.out.println("Digite o renavam do veiculo: ");
					String renavam = Menu.sc.nextLine();
		    		try {
		    			for (VeiculoPasseio v : Menu.veiculoPasseio) {
		    				if (v.getRenavam().toUpperCase().equals(renavam.toUpperCase())) {
		    				Reserva reserva = new Reserva(c, v);
		    			    Menu.reserva.add(reserva);
		    				}
		    			}
		    		}
		    		catch (Exception e) {
		    			System.out.println("Veiculo não encontrado");
		    		}
				}
			}
			
		}
		catch (Exception e) {
			System.out.println("Cliente não encontrado");
		}
    }
}