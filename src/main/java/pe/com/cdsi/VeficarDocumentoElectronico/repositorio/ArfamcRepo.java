package pe.com.cdsi.VeficarDocumentoElectronico.repositorio;

import pe.com.cdsi.VeficarDocumentoElectronico.conexion.Oracle;
import pe.com.cdsi.VeficarDocumentoElectronico.entidad.Arfamc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ArfamcRepo {
    private Oracle oracle;

    public ArfamcRepo(String sid,String host,String puerto,String user,String password) {
        this.oracle = new Oracle(sid,host,puerto,user,password);
    }

    public List<Arfamc> listaCompania(){
        try {
            Connection conn = this.oracle.conexion();
            Statement stmt = conn.createStatement();
            String sql = "SELECT TRIM(NO_CIA) CIA, TRIM(NO_CLIENTE_ONLINE) RUC,TRIM(DIREC_SFS) DIREC FROM FACTU.ARFAMC";
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
