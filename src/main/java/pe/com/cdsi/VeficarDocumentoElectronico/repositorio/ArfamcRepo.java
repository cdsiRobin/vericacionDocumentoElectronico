package pe.com.cdsi.VeficarDocumentoElectronico.repositorio;

import pe.com.cdsi.VeficarDocumentoElectronico.conexion.Oracle;
import pe.com.cdsi.VeficarDocumentoElectronico.entidad.Arfamc;
import pe.com.cdsi.VeficarDocumentoElectronico.entidad.OracleEnti;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ArfamcRepo {

    public List<Arfamc> listaCompania(){
        try {
            Oracle oracle = new Oracle();
            Connection conn = oracle.conexion();
            Statement stmt = conn.createStatement();
            String sql = "SELECT TRIM(NO_CIA), TRIM(NO_CLIENTE_ONLINE),TRIM(DIREC_SFS) FROM FACTU.ARFAMC";
            ResultSet rset = stmt.executeQuery(sql);
            List<Arfamc> arfamcList = new ArrayList<Arfamc>();
            while (rset.next()){
                Arfamc arfamc = new Arfamc(rset.getString(1), rset.getString(2),
                        rset.getString(3));
                arfamcList.add(arfamc);
            }
            return arfamcList;
        }catch (SQLException ex){
            System.out.println("No se puedo consular las compañias :"+ex.getMessage());
        }
        return null;
    }

}
