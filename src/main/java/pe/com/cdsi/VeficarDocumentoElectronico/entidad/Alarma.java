package pe.com.cdsi.VeficarDocumentoElectronico.entidad;

public class Alarma {
    
	private String mensaje;
    private String color;
    	
    public Alarma() {
	}

	public Alarma(String mensaje, String color) {
		this.mensaje = mensaje;
		this.color = color;
	}
    
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
  
}
