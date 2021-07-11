
package Controllers;

import DAO.ClienteDAO;
import DAO.CompraDAO;
import DAO.ProductoDAO;
import DAO.VentaDAO;
import Views.ClienteView;
import Views.CompraView;
import Views.Menu;
import Views.ProductoView;
import Views.VentaView;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class MenuController implements MouseListener{
    private Menu menuView;

    public MenuController(Menu menuView) {
        this.menuView = menuView;
        
        this.menuView.setVisible(true);
        
        this.menuView.btnCliente.addMouseListener(this);
        this.menuView.btnDetalleCompra.addMouseListener(this);
        this.menuView.btnProducto.addMouseListener(this);
        this.menuView.btnVenta.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource().equals(this.menuView.btnCliente)) {
            ClienteView clienteView = new ClienteView();
            ClienteDAO clienteDAO = new ClienteDAO();
            ClienteController clienteController = new ClienteController(clienteView, clienteDAO);
        }
        if(e.getSource().equals(this.menuView.btnDetalleCompra)) {
            CompraView compraView = new CompraView();
            CompraDAO compraDAO = new CompraDAO();
            CompraController compraController = new CompraController(compraView, compraDAO);
        }
        if(e.getSource().equals(this.menuView.btnProducto)) {
            ProductoView productoView = new ProductoView();
            ProductoDAO productoDAO = new ProductoDAO();
            ProductoController productoController = new ProductoController(productoView, productoDAO);
        }
        if(e.getSource().equals(this.menuView.btnVenta)) {
            VentaView ventaView = new VentaView();
            VentaDAO ventaDAO = new VentaDAO();
            VentaController ventaController = new VentaController(ventaView, ventaDAO);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
    
    
}
