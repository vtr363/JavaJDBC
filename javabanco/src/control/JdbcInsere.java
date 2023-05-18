package control;

import java.sql.SQLException;
import java.util.Scanner;

import modelo.Contato;
import modelo.ContatoDao;

public class JdbcInsere {
	public static void main(String[] args) {
		Contato contato = new Contato();
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o nome:");
		contato.setNome(sc.nextLine());
		System.out.println("Digite o email:");
		contato.setEmail(sc.nextLine());
		System.out.println("Digite o endereço:");
		contato.setEndereco(sc.nextLine());
		
		ContatoDao dao;
		
			try {
				dao = new ContatoDao();
				dao.adciona(contato);
				System.out.println("sucesso");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		
	}
}	
