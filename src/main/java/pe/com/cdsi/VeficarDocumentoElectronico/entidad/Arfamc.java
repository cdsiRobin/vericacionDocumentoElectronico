package pe.com.cdsi.VeficarDocumentoElectronico.entidad;

public class Arfamc {
    private String cia;
    private String ruc;
    private String direcSfs;

    public Arfamc() {
    }

    public Arfamc(String cia, String ruc, String direcSfs) {
        this.cia = cia;
        this.ruc = ruc;
        this.direcSfs = direcSfs;
    }

    public String getCia() {
        return cia;
    }

    public void setCia(String cia) {
        this.cia = cia;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getDirecSfs() {
        return direcSfs;
    }

    public void setDirecSfs(String direcSfs) {
        this.direcSfs = direcSfs;
    }
}
