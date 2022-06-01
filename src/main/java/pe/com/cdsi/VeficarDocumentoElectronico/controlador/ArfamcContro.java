package pe.com.cdsi.VeficarDocumentoElectronico.controlador;

import pe.com.cdsi.VeficarDocumentoElectronico.entidad.Arfamc;
import pe.com.cdsi.VeficarDocumentoElectronico.entidad.OracleEnti;
import pe.com.cdsi.VeficarDocumentoElectronico.repositorio.ArfamcRepo;

import java.util.List;

public class ArfamcContro {

    public List<Arfamc> listaEmpresas() {
        ArfamcRepo arfamcRepo = new ArfamcRepo();
        return arfamcRepo.listaCompania();
    }
}
