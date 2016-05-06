package tankreportapp.db;

import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DBSelectRows {

    public DBSelectRows() {
    }

    public List<DBObjBaseStd> sel(String driver, String url, String dbName, String userName, String password) {
        Connection conn = null;
        List<DBObjBaseStd> dboBSt=new ArrayList<>();
        DBObjBaseStd dbObj;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url + dbName, userName, password);
            Statement st = conn.createStatement();
            ResultSet resQnt = st.executeQuery("SELECT COUNT(*) as 'rowQuantity' FROM tankreportapp_db.tbltankslist");
            resQnt.next();
            int rowQnt = resQnt.getInt(1);
            
            resQnt = null;
            

            ResultSet res = st.executeQuery("SELECT * FROM tankreportapp_db.tbltankslist");
            
            while (res.next()) {
                dbObj = new DBObjBaseStd(res.getInt("id"), res.getString("name"), res.getString("label"), res.getString("descrShort"), res.getString("descrLong"), res.getInt   ("idx"), res.getString("createdDT") );
                
                dboBSt.add(dbObj);
                dbObj=null;
               //System.out.println(res.getString("name"));
            }
//            System.out.println(dbObj.intArrID[1]+" "+dbObj.floatArrC1[1]+" "+dbObj.stringArrC2[1]);
            
            conn.close();
            return dboBSt;
        } catch (Exception e) {
            e.printStackTrace();

        }
        return dboBSt = null;
    }

}
