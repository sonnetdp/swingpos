
package PointOfSales;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;

public class Database extends JFrame{
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/pointofsales";

    //  Database credentials
    static final String USER = "root";
    static final String PASS = "";

    private Connection conn=null;
    
    public Connection getConnection() {
        try {
            Class.forName(JDBC_DRIVER);
            this.conn = (Connection) DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (ClassNotFoundException cnf) {
            conn = null;
        } catch (SQLException se) {

        }
        return this.conn;

    }
    
    public void insertProduct(String productid, String name, String stock, String price, String category){
        Statement st=null;
        try{
            st=(Statement) conn.createStatement();
            String sql;
            sql="insert into productentry values(null,'"+productid+"','"+name+"','"+stock+"','"+price+"','"+category+"')";
             st.executeUpdate(sql);
        }
        catch(Exception ex){
        }
        finally{
            try{
                if(st!=null){
                    st.close();
                }
            }
            catch(SQLException sq){
            }
        }
    }
}
