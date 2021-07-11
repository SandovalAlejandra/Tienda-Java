
package DTO;

public class DetalleCompraDTO {
    private int codigo;
    private int codigoProducto;
    private int codigoCliente;
    private int cantidad;

    public DetalleCompraDTO() {
    }

    public DetalleCompraDTO(int codigo, int codigoProducto, int codigoCliente, int cantidad) {
        this.codigo = codigo;
        this.codigoProducto = codigoProducto;
        this.codigoCliente = codigoCliente;
        this.cantidad = cantidad;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
    
    
}
