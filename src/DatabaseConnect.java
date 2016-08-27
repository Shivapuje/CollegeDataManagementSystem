import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DatabaseConnect{
    @SuppressWarnings("PackageVisibleField")
    String database;
    
    DatabaseConnect(String db)
    {
        database=db;
    }
  private Connection conn = null;
  private Statement stmt = null;
  private PreparedStatement ps;
  private ResultSet rs;

  public ResultSet exeQuerry(String querry) throws Exception {
    try {
      Class.forName("com.mysql.jdbc.Driver").newInstance();
      
      conn = DriverManager.getConnection("jdbc:mysql://localhost/"+database+"","root","vinguru");

      ps = conn.prepareStatement(querry);
      stmt=conn.createStatement();
      rs = ps.executeQuery();
      return(rs);
      } catch (SQLException e) {
      throw e;
    } finally {
      
    }

  }


    public Integer exe(String querry) throws Exception
  {
      
 int b;
      try {
      Class.forName("com.mysql.jdbc.Driver").newInstance();
      
      conn = DriverManager.getConnection("jdbc:mysql://localhost/"+database+"","root","vinguru");

      ps = conn.prepareStatement(querry);
      b=ps.executeUpdate();
      return(b);
        }
      catch (SQLException e) {
      throw e;
    }   
  }

 public void close() {
    try {
      if (rs != null) {
        rs.close();
      }

      if (stmt != null) {
        stmt.close();
      }

      if (conn != null) {
        conn.close();
      }
    } catch (SQLException e) {

    }
  }

} 