package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {
    //1. Crear la instancia de la clase Connection del JAR JDBC
    Connection connection;
    //4. Buscamos la clase dentro del JAR que coincide con este nombre com.mysql.cj.jdbc.Driver
    String driver = "com.mysql.cj.jdbc.Driver";
    String cadenaConexion = "jdbc:mysql://localhost:3306/";
    String nombreBaseDatos = "reto1_g56_db";
    String usuario = "root";
    String contrasena = "";
    
    //2. Añadimos el constructor de la clase sin argumentos
    public Conexion() {
        //3. Intentar hacer conexión con la base de datos desde el constructor de la clase
        try {
            Class.forName(driver);
            //5. Llamamos la instancia connection a la cual le enviamos los parametros 
            //de conexión con la base de datos (cadena de conexión, usuario, contraseña)
            connection = DriverManager.getConnection(cadenaConexion + nombreBaseDatos, usuario, contrasena);
            if(connection != null){
                System.out.println("Conexión exitosa");
            }
        } catch (ClassNotFoundException | SQLException e){
            System.out.println("Conexión fallida");
        }
    }

  //6. Creamos una función que retorne la Connection de la clase
    public Connection getConnection(){
        return connection;
    }
}
