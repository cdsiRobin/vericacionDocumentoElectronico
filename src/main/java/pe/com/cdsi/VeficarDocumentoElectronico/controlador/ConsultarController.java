package pe.com.cdsi.VeficarDocumentoElectronico.controlador;

import java.util.List;
import java.util.TimerTask;

import javax.swing.JTextPane;

public class ConsultarController extends TimerTask {
	
    private MainContro mainContro;
    private JTextPane txaLog;
    
	public ConsultarController(JTextPane txaLog) {
		this.txaLog = txaLog;
	}

	@Override
	public void run() {
		ArfafeContro arfafeContro = new ArfafeContro();
		List<String> cias = arfafeContro.listaCias();									
		for(String cia: cias) {
			mainContro = new MainContro(cia,txaLog);
			mainContro.start();
		}
	}
	
	public void dejarConsultarBD() {
		mainContro.interrupt();
	}

}
