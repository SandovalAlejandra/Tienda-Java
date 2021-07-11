
package Controllers;

import DAO.UsuarioDAO;
import DTO.UsuarioDTO;
import Views.Login;
import Views.Menu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class LoginController implements ActionListener{
    private Login viewLogin;
    private UsuarioDAO usuarioDAO; 

    public LoginController(Login viewLogin, UsuarioDAO usuarioDAO) {
        this.viewLogin = viewLogin;
        this.usuarioDAO = usuarioDAO;
        
        this.viewLogin.setVisible(true);
        
        this.viewLogin.btnLogin.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(this.viewLogin.btnLogin)) {
            if(this.viewLogin.txtUsername.getText().length() > 0 && this.viewLogin.txtPassword.getText().length() > 0) {
                String user = this.viewLogin.txtUsername.getText();
                String password = this.viewLogin.txtPassword.getText();
                checkLogin(user, password);
            } else {
                JOptionPane.showMessageDialog(null, "Completa ambos campos");
            }
        }
    }

    private void checkLogin(String user, String password) {
        //UsuarioDTO usuarioDTO = this.usuarioDAO.getUser(user, password);
        //usuarioDTO != null
        if(true) {
            this.viewLogin.dispose();
            Menu menuView = new Menu();
            MenuController menu = new MenuController(menuView);
        } else {
            JOptionPane.showMessageDialog(null, "Usuario o clave incorrecta");
        }
    }

    
    
    
}
