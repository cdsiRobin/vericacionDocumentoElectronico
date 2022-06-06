package pe.com.cdsi.VeficarDocumentoElectronico.controlador;

import pe.com.cdsi.VeficarDocumentoElectronico.repositorio.ArfafeRepo;

import java.util.List;

public class ArfafeContro {

    public List<String> listaCias(){
        ArfafeRepo arfafeRepo = new ArfafeRepo();
        return arfafeRepo.listaCias();
    }

    public List<String> listarDocuElectro(String cia){
        ArfafeRepo arfafeRepo = new ArfafeRepo();
        return arfafeRepo.listaDocumentoElectronico(cia);
    }

    public void actuEstadoSunatDocuElec(String cia, String noFactu, String estadoSunat){    	
        ArfafeRepo arfafeRepo = new ArfafeRepo();
        arfafeRepo.actuEstadoSunatDocuElec(cia, this.editarNoFactu(noFactu), this.cambioEstado(estadoSunat));
    }
    
    private String editarNoFactu(String noFactu) {
    	return noFactu.substring(0, 4)+noFactu.substring(5);
    }
    
    private String cambioEstado(String estadoSunat) {
    	String resultado = "";
    	switch (estadoSunat) {
			case "04":
				resultado = "3";
			case "03":
				resultado = "0";
			case "12":
				resultado = "3";
			case "05":
				resultado = "1";
			case "11":
				resultado = "0";
		}
    	return resultado;
    }
}
