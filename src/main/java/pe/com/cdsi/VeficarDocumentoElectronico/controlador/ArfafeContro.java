package pe.com.cdsi.VeficarDocumentoElectronico.controlador;

import pe.com.cdsi.VeficarDocumentoElectronico.repositorio.ArfafeRepo;

import java.util.List;

public class ArfafeContro {

    public List<String> listarDocuElectro(String cia){
        ArfafeRepo arfafeRepo = new ArfafeRepo();
        return arfafeRepo.listaDocumentoElectronico(cia);
    }

    public void actuEstadoSunatDocuElec(String cia, String noFactu, String estadoSunat){
        ArfafeRepo arfafeRepo = new ArfafeRepo();
        arfafeRepo.actuEstadoSunatDocuElec(cia, noFactu, estadoSunat);
    }
}
