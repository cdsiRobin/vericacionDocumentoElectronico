package pe.com.cdsi.VeficarDocumentoElectronico.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Sqlite {
	private Connection connection = null;
    private String direccionBD;
	public Sqlite(String direccionBD) {
		try{
             this.direccionBD = direccionBD;
	         Class.forName("org.sqlite.JDBC");
	         connection = DriverManager.getConnection("jdbc:sqlite:" + this.direccionBD );
	    }catch(Exception ex){
	         System.out.println(ex);
             System.out.println("Error de conexión con la B.D SQLite [ " + ex.getMessage() + "]");
	    }
	}
    public Connection getConnection() {
        return connection;
    }
    public void desconectar() {
        try {
            connection.close();
            System.out.println("Desconectado de la base de datos [ " + this.direccionBD + "]");
        }
        catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
