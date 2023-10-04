import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.ResultSet; 
import java.sql.SQLException; 
import java.sql.Statement;

public class cus {
    
    

    
    
    
    
    public static void main(String[] args) throws SQLException {
    String url = "jdbc:sqlserver://DESKTOP-P7FJT9V\\SQLEXPRESS:1433;databaseName=rms"; 
    String user = "sa"; 
    String password = "123"; 
    try { 
        Connection connection = DriverManager.getConnection(url, user, password); 
        String sql = "INSERT INTO CUSTOMER_INFP (CUS_FIRSTNAME, CUS_LASTNAME, CUS_EMAIL,  CUS_PASSWORD,CUS_PHONENUMBER,CUS_ADDRESS ,ACCOUNT_STATUS)" +"VALUES ('Ruhul', 'Amin', 'abc@gmail.com', 'abc',12,'gulshan','a')"; 

        Statement statement = connection.createStatement(); int rows =statement.executeUpdate(sql); 
  
        if (rows>0) { System.out.println("Row has been  inserted"); } 
        connection.close(); 
    } 
    catch(SQLException e){ 
    System.out.println("oops you are having a bad day"); e.printStackTrace(); 
    } 
    } 

}
