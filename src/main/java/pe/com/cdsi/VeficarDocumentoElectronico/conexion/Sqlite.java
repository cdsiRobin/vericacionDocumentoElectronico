package pe.com.cdsi.VeficarDocumentoElectronico.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class Sqlite {
	
	private Connection connection = null;
    private ResultSet resultSet = null;
    private Statement statement = null;
    
    private String direccionBD;

	public Sqlite(String direccionBD) {
		this.direccionBD = direccionBD;
		try{
	         Class.forName("org.sqlite.JDBC");
	         connection = DriverManager.getConnection("jdbc:sqlite:" + this.direccionBD );
	         JOptionPane.showMessageDialog(null, "Conectado a la base de datos SQLite [ " + this.direccionBD + "]");
	    }catch(Exception e){
	         System.out.println(e);
	    }
	}
	
	public void desconectar() {
        try {
            resultSet.close();
            statement.close();
            connection.close();
            System.out.println("Desconectado de la base de datos [ " + this.direccionBD + "]");
        }
        catch (SQLException ex) {
            System.out.println(ex);
        }
    }
    
    

}
