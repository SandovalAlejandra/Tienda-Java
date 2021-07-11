
package DTO;


public class ProductosDTO {
    private int Id;
    private String nombreProducto;
    private String categoria;
    private Double precio;
    private String descripcion;

    public ProductosDTO() {
    }

    public ProductosDTO(int Id, String nombreProducto, String categoria, Double precio, String descripcion) {
        this.Id = Id;
        this.nombreProducto = nombreProducto;
        this.categoria = categoria;
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public int getId() {
        return Id;
    }

    public void setId(int codigo) {
        this.Id = Id;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
}
