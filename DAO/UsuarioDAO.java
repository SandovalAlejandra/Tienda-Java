/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.UsuarioDTO;
import Services.BD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gamer5
 */
public class UsuarioDAO {
    private Connection dbConnection = null;

    public UsuarioDAO() {
        this.dbConnection = new BD().getConnection();
    }
    
    public UsuarioDTO getUser(String username, String password) {
        UsuarioDTO user = null;
        try {
            String sql = "SELECT * FROM Usuarios WHERE username = ? AND password = ?";
            PreparedStatement ps = this.dbConnection.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            if(rs.next()) {
                user = new UsuarioDTO(rs.getString("username"), rs.getString("password"));
                return user;
            } else {
                return user;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return user;
    }
}
