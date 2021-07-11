package Main;

import Controllers.LoginController;
import DAO.UsuarioDAO;
import DTO.UsuarioDTO;
import Views.Login;

public class App {

    public static void main(String[] args) {
        Login viewLogin = new Login();
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        LoginController loginController = new LoginController(viewLogin, usuarioDAO);
    }

}
