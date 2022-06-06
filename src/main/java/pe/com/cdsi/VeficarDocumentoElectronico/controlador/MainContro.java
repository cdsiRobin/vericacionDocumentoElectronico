package pe.com.cdsi.VeficarDocumentoElectronico.controlador;

import java.util.List;

import javax.swing.JTextPane;

import pe.com.cdsi.VeficarDocumentoElectronico.entidad.Arfamc;
import pe.com.cdsi.VeficarDocumentoElectronico.entidad.DocumentoEnti;

public class MainContro extends Thread {
	
	private String cia;
	private JTextPane txaLog;
	
	public MainContro(String cia, JTextPane txaLog) {
		this.cia = cia;
		this.txaLog = txaLog;
	}

	@Override
	public void run() {
		try {
			ArfafeContro arfafeContro  = new ArfafeContro();
			ArfamcContro arfamcContro = new ArfamcContro();
			Arfamc arfamc = arfamcContro.getEmpresas(this.getCia());
			String razonSocial = arfamc.getCia()+"-"+arfamc.getNombre()+"\n";
			this.verTexto(razonSocial);
			List<String> documentos = arfafeContro.listarDocuElectro(this.getCia());
			for(String documento: documentos) {
				DocumentoContro docuContro = new DocumentoContro();
				DocumentoEnti docuEnti = docuContro.getDocumento(documento, arfamc.getDirecSfs());
				if(docuEnti != null) {
					arfafeContro.actuEstadoSunatDocuElec(arfamc.getCia(), docuEnti.getNUM_DOCU(), docuEnti.getIND_SITU());				
					String texto = arfamc.getCia()+"_"+docuEnti.getNUM_DOCU()+"_"+docuEnti.getIND_SITU()+"\n";
					this.verTexto(texto);	
				}				
			}
		}catch (Exception e) {
			System.out.println("Error : "+e.getMessage());
		}
	}
	
	private void verTexto(String texto) {
		this.txaLog.setText( this.txaLog.getText()+"\n"+texto );
	}

	public String getCia() {
		return cia;
	}

	public void setCia(String cia) {
		this.cia = cia;
	}
	
}
