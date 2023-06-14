
package electricitybillingsystem;
import java.sql.*;

class Conn {
    Connection c;
    Statement s;
  
    Conn(){
        try {
      c= DriverManager.getConnection("jdbc:mysql://localhost:3306/ebs","root","Venu@1606");
      s= c.createStatement();
        }
        catch(Exception e){
            e.printStackTrace();
            
        }
     
    }
}
