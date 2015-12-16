import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class javaDb {
  public static void main(String[] args) throws Exception {
   try{
   Class.forName(com.jdbc.sqlserver.SQLServerDriver);
   }
   catch ClassNotFoundException e)  
 		{ 
     		throw new IllegalStateException("Driver not found.", e); 
 		} 
   try{
   Connection mine = DriverManager.getConnection("jdbc.mysql://localhost/itemDb", "Epis", "1024");

   Statement my_Statement = m_Connection.createStatement();
   String query = "SELECT * FROM itemDb";
   ResultSet item_Results = my_Statement.executeQuery(query);

    while (item_Results.next()) {
	System.out.println(item_Results.getString(1));
	}
	
	catch  (SQLException ex){
		throw new IllegalStateException("Database not found.", ex);
	}
	

    }
  }
}
