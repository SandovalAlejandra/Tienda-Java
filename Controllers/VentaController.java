
package Controllers;

import DAO.VentaDAO;
import Views.VentaView;

public class VentaController {
    private VentaView ventaView;
    private VentaDAO ventaDAO;

    public VentaController(VentaView ventaView, VentaDAO ventaDAO) {
        this.ventaView = ventaView;
        this.ventaDAO = ventaDAO;
        
        this.ventaView.setVisible(true);
    }
    
    
}
