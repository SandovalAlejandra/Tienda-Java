
package Controllers;

import DAO.ProductoDAO;
import Views.ProductoView;

public class ProductoController {
    private ProductoView productoView;
    private ProductoDAO productoDAO;

    public ProductoController(ProductoView productoView, ProductoDAO productoDAO) {
        this.productoView = productoView;
        this.productoDAO = productoDAO;
        
        this.productoView.setVisible(true);
    }
    
    
}
