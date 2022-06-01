package pe.com.cdsi.VeficarDocumentoElectronico.entidad;

public class OracleEnti {
    private String sid;
    private String host;
    private String puerto;
    private String usuario;
    private String password;

    public OracleEnti() {
    }

    public OracleEnti(String sid, String host, String puerto, String usuario, String password) {
        this.sid = sid;
        this.host = host;
        this.puerto = puerto;
        this.usuario = usuario;
        this.password = password;
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
