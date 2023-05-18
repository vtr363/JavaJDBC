package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import bancojava.ConnectionFactory;

public class ContatoDao {
	private Connection con;
	
	public ContatoDao() throws SQLException {
		this.con = ConnectionFactory.getConnection();
	}
	
	public void adciona(Contato contato) throws SQLException {
		PreparedStatement stmt = con.prepareStatement("insert into contatos (nome, email, endereco) values(?,?,?)");
		stmt.setString(1, contato.getNome());
		stmt.setString(2, contato.getEmail());
		stmt.setString(3, contato.getEndereco());
		stmt.execute();
		stmt.close();
		con.close();
	}
}
