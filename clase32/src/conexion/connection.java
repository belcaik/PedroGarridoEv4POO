package conexion;

import java.sql.*;

public class connection {
	public String driver = "com.mysql.cj.jdbc.Driver";
	public String url = "jdbc:mysql://localhost:3306/clase32";
	public String user = "root";
	public String password = "";

	Connection conn;
	ResultSet rs;
	PreparedStatement ps;
	private String resultado;

	public Connection getConn() throws SQLException{
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return conn;
	}
	//public Connection getConn(){
		
		//return conn;
//	}
	public void test(){

		try {
			ps = getConn().prepareStatement("select * from oficina where ofi_id=?");
			ps.setInt(1, 1);
			rs = ps.executeQuery();
			while(rs.next()){
			resultado = rs.getString(2);
			System.out.println(resultado);}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	
	}


}
