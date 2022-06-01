package pe.com.cdsi.VeficarDocumentoElectronico.repositorio;

import pe.com.cdsi.VeficarDocumentoElectronico.conexion.Sqlite;
import pe.com.cdsi.VeficarDocumentoElectronico.entidad.DocumentoEnti;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DocumentoRepo {

    public DocumentoEnti getDocumento(String noFactu, String direcSfs){
        try{
            String sql = "SELECT TIP_DOCU, NUM_DOCU, IND_SITU FROM DOCUMENTO WHERE NUM_DOCU = '"+noFactu+"'";
            Sqlite sqlite = new Sqlite(direcSfs);
            Connection connection = sqlite.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            //DocumentoEnti documentoEnti;
            while (resultSet.next()){
                DocumentoEnti  documentoEnti = new DocumentoEnti(resultSet.getString(1),resultSet.getString(2),
                                                  resultSet.getString(3));
                return documentoEnti;
            }

        }catch (SQLException ex){
            System.out.println("No se pudo hacer la consulta, "+ex.getMessage());
        }
        return null;
    }
}
