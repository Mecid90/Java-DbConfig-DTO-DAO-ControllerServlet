package dbconfig;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class DbConfig {

    public static Connection open() throws NamingException, SQLException {

        Context context = new InitialContext();
        DataSource dataSource = (DataSource) context.lookup("java:/comp/env/testora");

        return dataSource.getConnection();
    }
}
