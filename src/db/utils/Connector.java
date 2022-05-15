package db.utils;
import java.sql.*;

public class Connector {
    
    public static ResultSet select(String url, String statement) throws SQLException {
        try {
            Class.forName("com.ibm.db2.jcc.DB2Driver"); 
            Connection con = DriverManager.getConnection(url);
            Statement stmt = con.createStatement();
            return stmt.executeQuery(statement);
        } 
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        
        return null;
    }
    
}
