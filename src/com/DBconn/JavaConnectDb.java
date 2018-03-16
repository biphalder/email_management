package DBconn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class JavaConnectDb {
   public static Connection ConnecrDb(){
     try{
	 Class.forName("oracle.jdbc.OracleDriver");
	Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","biphalder","ob1kenob1");
return con;
}
catch(ClassNotFoundException | SQLException e){
	JOptionPane.showMessageDialog(null, e);
	}
	return null;
}
}