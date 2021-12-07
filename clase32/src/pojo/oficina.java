package pojo;

public class oficina {

  private int id;
  private String direccion;

  public oficina(int id, String direccion) {
    this.id = id;
    this.direccion = direccion;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getDireccion() {
    return direccion;
  }

  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }
}
