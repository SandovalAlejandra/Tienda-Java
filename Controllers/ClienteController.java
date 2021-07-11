
package Controllers;

import DAO.ClienteDAO;
import Views.ClienteView;

public class ClienteController {
    private ClienteView clienteView;
    private ClienteDAO clienteDAO;

    public ClienteController(ClienteView clienteView, ClienteDAO clienteDAO) {
        this.clienteView = clienteView;
        this.clienteDAO = clienteDAO;
        
        this.clienteView.setVisible(true);
    }
    
    
}
