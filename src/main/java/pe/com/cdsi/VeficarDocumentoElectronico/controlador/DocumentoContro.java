package pe.com.cdsi.VeficarDocumentoElectronico.controlador;

import pe.com.cdsi.VeficarDocumentoElectronico.entidad.DocumentoEnti;
import pe.com.cdsi.VeficarDocumentoElectronico.repositorio.DocumentoRepo;

public class DocumentoContro {

    public DocumentoEnti getDocumento(String noFactu, String direcSfs){
        DocumentoRepo repo = new DocumentoRepo();
        return  repo.getDocumento(noFactu, direcSfs);
    }

}
