package dao;

import conexion.connection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import pojo.oficina;

public class oficinaDao {

  static connection conn = new connection();
  List<oficina> oficinas;

  public List<oficina> getOficinas() throws SQLException {
    oficinas = new ArrayList<oficina>();
    try {
      conn.getConn();
      Statement stmt = conn.getConn().createStatement();
      ResultSet rs = stmt.executeQuery("select * from oficina");
      while (rs.next()) {
        oficina oficina = new oficina(rs.getInt(1), rs.getString(2));
        oficinas.add(oficina);
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
    return oficinas;
  }

  public static oficina getOficina(int id) throws SQLException {
    oficina oficina = null;
    try {
      conn.getConn();
      PreparedStatement ps = conn
        .getConn()
        .prepareStatement("Select * from oficina where ofi_id = ?");
      ps.setInt(1, id);
      ResultSet rs = ps.executeQuery();
      while (rs.next()) {
        oficina = new oficina(id, rs.getString(2));
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
    return oficina;
  }

  public static void crearOficina(String direccion) throws SQLException {
    try {
      conn.getConn();
      PreparedStatement ps = conn
        .getConn()
        .prepareStatement("insert into oficina values(null, ?)");
      ps.setString(1, direccion);
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

  public static void actualizarOficina(int id, String direccion)
    throws SQLException {
    try {
      conn.getConn();
      PreparedStatement ps = conn
        .getConn()
        .prepareStatement(
          "UPDATE oficina SET ofi_direccion = ? WHERE ofi_id = ?"
        );
      ps.setString(1, direccion);
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

  public static void eliminarOficina(int id) throws SQLException {
    try {
      conn.getConn();
      PreparedStatement ps = conn
        .getConn()
        .prepareStatement("DELETE FROM oficina WHERE ofi_id=?");
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
