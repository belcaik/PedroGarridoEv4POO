package dao;

import conexion.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import pojo.alquiler;

public class alquilerDao {

  static connection conn = new connection();
  List<alquiler> alquileres;

  public List<alquiler> getAlquileres() throws SQLException {
    alquileres = new ArrayList<alquiler>();
    try {
      conn.getConn();
      Statement stmt = conn.getConn().createStatement();
      ResultSet rs = stmt.executeQuery("select * from alquiler");
      while (rs.next()) {
        alquiler alquiler = new alquiler(
          rs.getInt(1),
          rs.getInt(2),
          rs.getBoolean(3)
        );
        alquileres.add(alquiler);
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
    return alquileres;
  }

  public static alquiler getAlquiler(int id) throws SQLException {
    alquiler alquiler = null;
    try {
      conn.getConn();
      PreparedStatement ps = conn
        .getConn()
        .prepareStatement("Select * from alquiler where alq_id = ?");
      ps.setInt(1, id);
      ResultSet rs = ps.executeQuery();
      while (rs.next()) {
        alquiler = new alquiler(id, rs.getInt(2), rs.getBoolean(3));
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
    return alquiler;
  }

  public static void crearAlquiler(int monto, boolean ocupado)
    throws SQLException {
    try {
      conn.getConn();
      PreparedStatement ps = conn
        .getConn()
        .prepareStatement("insert into alquiler values(null, ?, ?)");
      ps.setInt(1, monto);
      ps.setBoolean(2, ocupado);
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

  public static void actualizarAlquiler(int id, int monto, boolean ocupado)
    throws SQLException {
    try {
      conn.getConn();
      PreparedStatement ps = conn
        .getConn()
        .prepareStatement(
          "UPDATE alquiler SET alq_monto = ?, alq_ocupado = ? WHERE alq_id = ?"
        );
      ps.setInt(1, monto);
      ps.setBoolean(2, ocupado);
      ps.setInt(3, id);
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

  public static void eliminarAlquiler(int id) throws SQLException {
    try {
      conn.getConn();
      PreparedStatement ps = conn
        .getConn()
        .prepareStatement("DELETE FROM alquiler WHERE alq_id=?");
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
