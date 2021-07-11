
package DTO;


public class VentasDTO {
      private int codigo;
      private int codigoDetalle;
      private String metodoPago;
      private Double totalPagar;
      private String fecha;

    public VentasDTO() {
    }
      

    public VentasDTO(int codigo, int codigoDetalle, String metodoPago, Double totalPagar, String fecha) {
        this.codigo = codigo;
        this.codigoDetalle = codigoDetalle;
        this.metodoPago = metodoPago;
        this.totalPagar = totalPagar;
        this.fecha = fecha;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigoDetalle() {
        return codigoDetalle;
    }

    public void setCodigoDetalle(int codigoDetalle) {
        this.codigoDetalle = codigoDetalle;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public Double getTotalPagar() {
        return totalPagar;
    }

    public void setTotalPagar(Double totalPagar) {
        this.totalPagar = totalPagar;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
      
      
}
