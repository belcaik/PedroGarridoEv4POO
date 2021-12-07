package pojo;

public class producto {

  private int id;
  private String descripcion;
  private int precio;

  public producto(int id, String descripcion, int precio) {
    this.id = id;
    this.descripcion = descripcion;
    this.precio = precio;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getId() {
    return id;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public void setPrecio(int precio) {
    this.precio = precio;
  }

  public int getPrecio() {
    return precio;
  }
}
