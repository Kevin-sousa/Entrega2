package model;

import java.util.ArrayList;

import controle.Menu;


public class Locatario {
	private String nome;
	private String email;  
    private String telefone; 
    
    public Locatario(String nome, String email,  String telefone) {
    	this.nome = nome;
    	this.email = email;
        this.telefone = telefone;
    }
    
    public String getNome() {
        return nome;
    }
 
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }


    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public static void cadastraLocatario() {
		
        System.out.println("Digite o nome do locatario: ");
        String nome = Menu.sc.nextLine();
        
        System.out.println("Digite o email do locatario: ");
        String email = Menu.sc.nextLine();

        System.out.println("Digite o telefone do locatario: \n(Somente numeros EX.: DDNNNNNNNN)");
        String telefone = Menu.sc.nextLine();
       
        Locatario locatario = new Locatario(nome, email, telefone);
        Menu.locatario.add(locatario);
	}
    
    public static void listarLocatario() {
    	for (int i = 0; i < Menu.locatario.size(); i++) {
    	            System.out.print(i + " - ");
    	            System.out.println(Menu.locatario.get(i));
    	            System.out.println("__");
    	        }
    }
    public static void buscarLocatario(ArrayList<Locatario> locatario) {
    		System.out.print("Digite o nome do cliente: ");
    		String nome = Menu.sc.nextLine();
    		try {
    			for (Locatario c : locatario) {
    				if (c.getNome().toUpperCase().equals(nome.toUpperCase())) {
    					System.out.println("---------------");
    					System.out.println(c);
    					System.out.println("---------------");
    				}
    			}
    		}
    		catch (Exception e) {
    			System.out.println("Cliente não encontrado");
    		}

    }
    public static void deletarLocatario(ArrayList<Locatario> locatario) {
    	
    	System.out.println("Digite o número do cliente que deseja deletar: ");
    	String nome = Menu.sc.nextLine();
		try {
			for (Locatario c : locatario) {
				if (c.getNome().toUpperCase().equals(nome.toUpperCase())) {
					locatario.remove(c);
			        System.out.println("Cliente removido!\n");
				}
			}
		}
		catch (Exception e) {
			System.out.println("Cliente não encontrado");
		}

    }
    	
    	
    
    @Override
    public String toString() {
        return "Cliente \nNome do cliente: " + nome + "\nEmail do cliente: " + email
                + "\nTelefone do cliente: " + telefone + "\n";
    }      	          	 
}

