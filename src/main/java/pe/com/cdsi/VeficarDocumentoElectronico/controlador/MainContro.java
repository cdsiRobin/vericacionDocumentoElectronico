package pe.com.cdsi.VeficarDocumentoElectronico.controlador;

import java.util.List;

import pe.com.cdsi.VeficarDocumentoElectronico.entidad.Arfamc;
import pe.com.cdsi.VeficarDocumentoElectronico.entidad.DocumentoEnti;

public class MainContro extends Thread {
	
	private String cia;
	
	public MainContro(String cia) {
		this.cia = cia;
	}



	@Override
	public void run() {
		try {
			ArfafeContro arfafeContro  = new ArfafeContro();
			ArfamcContro arfamcContro = new ArfamcContro();
			Arfamc arfamc = arfamcContro.getEmpresas(this.getCia());
			List<String> documentos = arfafeContro.listarDocuElectro(this.getCia());
			for(String documento: documentos) {
				DocumentoContro docuContro = new DocumentoContro();
				DocumentoEnti docuEnti = docuContro.getDocumento(documento, arfamc.getDirecSfs());
				arfafeContro.actuEstadoSunatDocuElec(arfamc.getCia(), docuEnti.getNUM_DOCU(), docuEnti.getIND_SITU());				
			}
		}catch (Exception e) {
			System.out.println("Error : "+e.getMessage());
		}
	}

	public String getCia() {
		return cia;
	}

	public void setCia(String cia) {
		this.cia = cia;
	}
	
}
