
package Controllers;

import DAO.CompraDAO;
import Views.CompraView;

public class CompraController {
    private CompraView compraView;
    private CompraDAO compraDAO;

    public CompraController(CompraView compraView, CompraDAO compraDAO) {
        this.compraView = compraView;
        this.compraDAO = compraDAO;
        
        this.compraView.setVisible(true);
    }
    
    
}
