package dao;

import conexion.connection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import pojo.producto;

public class productoDao {

  static connection conn = new connection();
  List<producto> productos;

  public List<producto> getProductos() throws SQLException {
    productos = new ArrayList<producto>();
    try {
      conn.getConn();
      Statement stmt = conn.getConn().createStatement();
      ResultSet rs = stmt.executeQuery("select * from producto");
      while (rs.next()) {
        producto producto = new producto(
          rs.getInt(1),
          rs.getString(2),
          rs.getInt(3)
        );
        productos.add(producto);
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
    return productos;
  }

  public static producto getProducto(int id) throws SQLException {
    producto producto = null;
    try {
      conn.getConn();
      PreparedStatement ps = conn
        .getConn()
        .prepareStatement("Select * from producto where prod_id = ?");
      ps.setInt(1, id);
      ResultSet rs = ps.executeQuery();
      while (rs.next()) {
        producto = new producto(id, rs.getString(2), rs.getInt(3));
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
    return producto;
  }

  public static void crearProducto(String descripcion, int precio)
    throws SQLException {
    try {
      conn.getConn();
      PreparedStatement ps = conn
        .getConn()
        .prepareStatement("insert into producto values(null, ?, ?)");
      ps.setString(1, descripcion);
      ps.setInt(2, precio);
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

  public static void actualizarProducto(int id, String descripcion, int precio)
    throws SQLException {
    try {
      conn.getConn();
      PreparedStatement ps = conn
        .getConn()
        .prepareStatement(
          "UPDATE producto SET prod_descripcion = ?, prod_precio = ? WHERE prod_id = ?"
        );
      ps.setString(1, descripcion);
      ps.setInt(2, precio);
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

  public static void eliminarProducto(int id) throws SQLException {
    try {
      conn.getConn();
      PreparedStatement ps = conn
        .getConn()
        .prepareStatement("DELETE FROM producto WHERE prod_id=?");
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
