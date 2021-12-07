package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import conexion.connection;
import pojo.perfile;

public class perfileDao {
	static connection conn = new connection();
  List<perfile> perfiles;

  public List<perfile> getPerfiles() throws SQLException {
    perfiles = new ArrayList<perfile>();
    try {
      conn.getConn();
      Statement stmt = conn.getConn().createStatement();
      ResultSet rs = stmt.executeQuery("select * from perfile");
      while (rs.next()) {
        perfile perfile = new perfile(rs.getInt(1), rs.getString(2));
        perfiles.add(perfile);
      }
      rs.close();
      stmt.close();
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      if (conn.getConn() != null) {
        try {
          conn.getConn().close();
        } catch (SQLException e) {
          e.printStackTrace();
        }
      }
    }
    return perfiles;
  }

  public static perfile getPerfile(int id) throws SQLException {
    perfile perfile = null;
    try {
      conn.getConn();
      PreparedStatement ps = conn
        .getConn()
        .prepareStatement("Select * from perfile where per_id = ?");
      ps.setInt(1, id);
      ResultSet rs = ps.executeQuery();
      while (rs.next()) {
        perfile = new perfile(id, rs.getString(2));
      }
      rs.close();
      ps.close();
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      if (conn.getConn() != null) {
        try {
          conn.getConn().close();
        } catch (SQLException e) {
          e.printStackTrace();
        }
      }
    }
    return perfile;
  }

  public static void crearPerfile(String nombre) throws SQLException {
    try {
      conn.getConn();
      PreparedStatement ps = conn
        .getConn()
        .prepareStatement("insert into perfile values(null, ?)");
      ps.setString(1, nombre);
      ps.executeUpdate();
      ps.close();
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      if (conn.getConn() != null) {
        try {
          conn.getConn().close();
        } catch (SQLException e) {
          e.printStackTrace();
        }
      }
    }
  }

  public static void actualizarPerfile(int id, String nombre)
    throws SQLException {
    try {
      conn.getConn();
      PreparedStatement ps = conn
        .getConn()
        .prepareStatement(
          "UPDATE perfile SET per_nombre = ? WHERE per_id = ?"
        );
      ps.setString(1, nombre);
      ps.setInt(2, id);
      ps.executeUpdate();
      ps.close();
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      if (conn.getConn() != null) {
        try {
          conn.getConn().close();
        } catch (SQLException e) {
          e.printStackTrace();
        }
      }
    }
  }

  public static void eliminarPerfile(int id) throws SQLException {
    try {
      conn.getConn();
      PreparedStatement ps = conn
        .getConn()
        .prepareStatement("DELETE FROM perfile WHERE per_id=?");
      ps.setInt(1, id);
      ps.executeUpdate();
      ps.close();
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      if (conn.getConn() != null) {
        try {
          conn.getConn().close();
        } catch (SQLException e) {
          e.printStackTrace();
        }
      }
    }
  }
  
  
	
}
