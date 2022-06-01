package pe.com.cdsi.VeficarDocumentoElectronico.conexion;

import pe.com.cdsi.VeficarDocumentoElectronico.entidad.OracleEnti;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Oracle {

    private String sid;
    private String host;
    private String puerto;
    private String usuario;
    private String password;

    public Oracle() {
        this.sid      = "TGSTEEL";
        this.host     = "192.168.1.88";
        this.puerto   = "1521";
        this.usuario  = "LLE";
        this.password = "YVL";
    }

    public Connection conexion() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            //Connection  conexion = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:SID","USER","PASS");
            Connection  conexion = DriverManager.getConnection("jdbc:oracle:thin:@"+this.host+":"+this.puerto+":"+this.sid
                    ,this.usuario,this.password);
            return conexion;
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println("Error en la conexión de la base de datos");
        }
        return null;
    }

}
