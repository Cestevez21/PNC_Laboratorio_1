public class Artista {

  private int id;
  private String nombre;
  private String discoMasVendido;
  private int ventasTotales;

  public Artista(int id, String nombre, String disco, int ventasTotales) {
    id = id;
    nombre = nombre;
    discoMasVendido = disco;
    ventasTotales = ventasTotales;
  }


  public int getid() {
    return id;
  }
  public String getNombre() {
    return nombre;
  }
    public String getdiscoMasVendido() {
    return discoMasVendido;
  }
    public String getventasTotales() {
    return ventasTotales;
  }

  public void setdiscoMasVendido(String disco) {
    this.discoMasVendido = disco;
  }

  public void setventasTotales(String ventasTotales) {
    this.ventasTotales = ventasTotales;
  }

}



