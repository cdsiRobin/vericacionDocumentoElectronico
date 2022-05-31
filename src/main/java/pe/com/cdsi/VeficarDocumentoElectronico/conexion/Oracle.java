package pe.com.cdsi.VeficarDocumentoElectronico.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Oracle {

    private String sid;
    private String host;
    private String puerto;
    private String usuario;
    private String password;

    public Oracle(String sid, String host, String puerto, String usuario, String password) {
        this.sid = sid;
        this.host = host;
        this.puerto = puerto;
        this.usuario = usuario;
        this.password = password;
    }

    public Connection conexion() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            //Connection  conexion = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:SID","USER","PASS");
            Connection  conexion = DriverManager.getConnection("jdbc:oracle:thin:@"+this.getHost()+":"+this.getPuerto()+":"+this.getSid()
                    ,this.getUsuario(),this.getPassword());
            return conexion;
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println("Error en la conexión de la base de datos");
        }
        return null;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getPuerto() {
        return puerto;
    }

    public void setPuerto(String puerto) {
        this.puerto = puerto;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
