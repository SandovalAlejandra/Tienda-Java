
package DAO;


import DTO.ProductosDTO;
import Services.BD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ProductoDAO {
    private Connection dbConnection = null;
    
    public ProductoDAO() {
        this.dbConnection = new BD().getConnection();
    }
    
}
