
package DAO;

import DTO.ClienteDTO;
import Services.BD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ClienteDAO {
    private Connection dbConnection = null;

    public ClienteDAO() {
        this.dbConnection = new BD().getConnection();
    }
    
}
