package dao;

import conexion.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import pojo.usuario;

public class usuarioDao {

  static connection conn = new connection();
  List<usuario> usuarios;

  public List<usuario> getUsuarios() throws SQLException {
    usuarios = new ArrayList<usuario>();
    try {
      conn.getConn();
      Statement stmt = conn.getConn().createStatement();
      ResultSet rs = stmt.executeQuery("select * from usuario");
      while (rs.next()) {
        usuario usuario = new usuario(
          rs.getInt(1),
          rs.getString(2),
          rs.getString(3)
        );
        usuarios.add(usuario);
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
    return usuarios;
  }

  public static usuario getUsuario(int id) throws SQLException {
    usuario usuario = null;
    try {
      conn.getConn();
      PreparedStatement ps = conn
        .getConn()
        .prepareStatement("Select * from usuario where usu_id = ?");
      ps.setInt(1, id);
      ResultSet rs = ps.executeQuery();
      while (rs.next()) {
        usuario = new usuario(id, rs.getString(2), rs.getString(3));
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
    return usuario;
  }

  public static void crearUsuario(String nombre, String password)
    throws SQLException {
    try {
      conn.getConn();
      PreparedStatement ps = conn
        .getConn()
        .prepareStatement("insert into usuario values(null, ?, ?)");
      ps.setString(1, nombre);
      ps.setString(2, password);
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

  public static void actualizarUsuario(int id, String nombre, String password)
    throws SQLException {
    try {
      conn.getConn();
      PreparedStatement ps = conn
        .getConn()
        .prepareStatement(
          "UPDATE usuario SET usu_nombre = ?, usu_pass = ? WHERE usu_id = ?"
        );
      ps.setString(1, nombre);
      ps.setString(2, password);
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

  public static void eliminarUsuario(int id) throws SQLException {
    try {
      conn.getConn();
      PreparedStatement ps = conn
        .getConn()
        .prepareStatement("DELETE FROM usuario WHERE usu_id=?");
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

  public static boolean validarUsuario(String nombre, String password) {
    try {
      conn.getConn();
      PreparedStatement ps = conn.getConn().prepareStatement("select * from usuario where usu_nombre=? and usu_pass=?");
      ps.setString(1, nombre);
      ps.setString(2, password);
      ResultSet rs = ps.executeQuery();
      if(rs.next()){
        return true;
      }else{
        return false;
      }
    } catch (Exception e) {
      e.printStackTrace();
      return false;
    }
    
    
  }

}

