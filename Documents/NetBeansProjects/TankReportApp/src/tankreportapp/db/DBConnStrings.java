package tankreportapp.db;

public class DBConnStrings {

//    public static final String url = "jdbc:mysql://127.4.60.130:3306/";
//    public static final String dbName = "caewa?useSSL=false";
//    public static final String driver = "com.mysql.jdbc.Driver";
//    public static final String userName = "adminfeUSE44";
//    public static final String password = "BPwuxFU-Qcbl";
    
    public static final String url = "jdbc:mysql://localhost:3306/";
    public static final String dbName = "caewa?useSSL=false";
    public static final String driver = "com.mysql.jdbc.Driver";
    public static final String userName = "root";
    public static final String password = "qazwsx";
    
                
//            String url = "jdbc:mysql://localhost:3306/";
//            String dbName = "caewa?useSSL=false";
//            String driver = "com.mysql.jdbc.Driver";
//            String userName = "root";
//            String password = "qazwsx";
    
    
    
    
    
    
    
//    <%
//            String url = "jdbc:mysql://localhost:3306/";
//           String dbName = "caewa?useSSL=false";
//           String driver = "com.mysql.jdbc.Driver";
//           String userName = "root";
//           String password = "qazwsx";
// Connection conn = null;
//dbObject dbObj;
//        try {
//            Class.forName(driver);
//            conn = DriverManager.getConnection(url + dbName, userName, password);
//            Statement st = conn.createStatement();
//
//            ResultSet resQnt = st.executeQuery("SELECT COUNT(*) as 'cnt' FROM caewa.tblTest1");
//            resQnt.next();
//            int rowQnt = resQnt.getInt(1);
//            dbObj = new dbObject(rowQnt);
//            resQnt = null;
//
//            ResultSet res = st.executeQuery("SELECT * FROM caewa.tblTest1");
//            int index = 0;
//            while (res.next()) {
//                dbObj.addElements(index, res.getInt("id"), res.getString("EmployeeName"));
//                index++;
////                System.out.println(id + "  fl= " + fl + "  timestamp= " + ts);
//            }
//            
////            System.out.println(dbObj.intArrID[1]+" "+dbObj.floatArrC1[1]+" "+dbObj.stringArrC2[1]);
//            index = 0;
//            conn.close();
//            out.println("********");
//            int[] a=new int[dbObj.getArrSize()];
//            String[] s=new String[dbObj.getArrSize()];
//            a=dbObj.getIntArrID();
//            s=dbObj.getStringArrC2();
//            out.println(a[5]+"   "+s[5]);
//            
//        } catch (Exception e) {
//            e.printStackTrace();
//
//        }
//
//
//              
//
//%>
    
//    dbObject dbObj=(dbObject)request.getAttribute("dbObjSelectResult");
//        out.println("-------------");
//        int[] arrInt=new int[5];
//        String[] arrString=new String[5];
//        arrInt=dbObj.getIntArrID();
//        arrString=dbObj.getStringArrC2();
// out.println(" ID  "+arrInt[0]+" EName "+arrString[0]); 
    
    
}
