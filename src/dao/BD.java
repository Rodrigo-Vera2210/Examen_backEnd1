package dao;

import org.apache.log4j.Logger;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;

public class BD {
    private static final Logger logger = Logger.getLogger(BD.class);
    private static final String SQL_DROP_CREATE_ODONTOLOGO = "DROP TABLE IF EXISTS ODONTOLOGOS; CREATE TABLE ODONTOLOGOS (ID INT AUTO_INCREMENT PRIMARY KEY, NUMERO_MATRICULA VARCHAR(100) NOT NULL, NOMBRE VARCHAR(100) NOT NULL, APELLIDO VARCHAR(100) NOT NULL)";

    public static void crearTabla(){
        Connection connection = null;
        try{
            connection = getConnection();
            Statement statement = connection.createStatement();
            statement.execute(SQL_DROP_CREATE_ODONTOLOGO);
            logger.info("tabla creada con exito");
        }catch(Exception ex){
            logger.warn(ex.getMessage());
        }
    }

    public static Connection getConnection() throws Exception{
        Class.forName("org.h2.Driver");
        return DriverManager.getConnection("jdbc:h2:~/ClinicaOdontologica","sa","sa");
    }
}
