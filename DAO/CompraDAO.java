
package DAO;

import DTO.DetalleCompraDTO;
import Services.BD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class CompraDAO {
    private Connection dbConnection = null;

    public CompraDAO() {
        this.dbConnection = new BD().getConnection();
    }
    
}
