/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Vista.Cuaderno_De_Tiempo;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Juan Antonio Domínguez Juárez | juandguez21@gmail.com
 */

/***
 * Se declara la clase Profesores de forma pública
 * 
 */
public class Profesores
{
    //Declaración de variables 
    int id;
    String nombre;
    String apellidoPaterno;
    String apellidoMaterno;
    
    
    //Declaración del constuctor
    public Profesores()
    {
        
    }
    
    //Declaración del segundo constructor que recibe parámetros
     public Profesores(int id, String nom, String apaterno, String amaterno) 
     {
         this.id = id;
         this.nombre = nom;
         this. apellidoPaterno = apaterno;
         this. apellidoMaterno = amaterno;
    }

     //Declaración de un ArrayList llamado MostrarProfesores
     public Vector<Profesores> MostrarProfesores() throws SQLException
    {   
    
        Controlador.Db con = new Controlador.Db(); //Se crea un objeto donde se instacia la conexión de la Base de datos de la clase Controlador
        Connection cn = con.conexion(); //Se declara una variable llamada cn tipo Connection y esta es igual a con.conexion();
        Vector<Profesores> datos = new Vector<Profesores>(); //Se crea un objeto llamada datos instaciado del arrayLst Profesores
        Profesores dat = null; //Se crea una variable llamada dat de tipo Profesores y esta es inicializada en null
        try
        {
            /*Se crea una consulta hacia la base de datos de la tabla profesores*/
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT id, nombre, apellidoPaterno, apellidoMaterno FROM profesores");
            //se hace un bucle donde se llama a la consulta realizada
            while(rs.next())
            {
                dat = new Profesores(); //Se crea un objeto de Profesores
                dat.setId(rs.getInt("id")); //Se obtiene el id
                dat.setNombre(rs.getString("nombre")); //Se obtiene el nombre
                dat.setApellidoPaterno(rs.getString("apellidoPaterno"));//Se obtiene el apellido paterno
                dat.setApellidoMaterno(rs.getString("apellidoMaterno")); //Se obtiene el apellido materno
                datos.add(dat);
            }
            rs.close(); //Se finaliza la consulta hacia la base de datos
        }
        catch(SQLException e)
                {
                    //Es la excepción del sql por sino se llega a relizar la consulta de forma correcta
                    Logger.getLogger(Cuaderno_De_Tiempo.class.getName()).log(Level.SEVERE,null,e); 
                }
        return datos;  //Se retorna el ArrayList datos tipo profesores
    }
     
    //Metódo que obtiene el Id
    public int getId()
    {
        return id; //Retorna el id
    }

    //Método que pone el ID dentro de un parámetro llamado id
    public void setId(int id)
    {
        this.id = id;
    }
    
    //Metódo que obtiene el Nombre
    public String getNombre() 
    {
        return nombre; //Retorna el nombre
    }

    //Método que pone el nombre dentro de un parámetro llamado nombre
    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }
     //Metódo que obtiene el Apellido Paterno
    public String getApellidoPaterno()
    {
        return apellidoPaterno; //Retorna el apellidoPaterno
    }
    
    //Método que pone el apellido paterno dentro de un parámetro llamado apellidoPaterno
    public void setApellidoPaterno(String apellidoPaterno)
    {
        this.apellidoPaterno = apellidoPaterno;
    }
    
    //Metódo que obtiene el Apellido Materno
    public String getApellidoMaterno()
    {
        return apellidoMaterno; //Retorna el apellidoMaterno
    }

    //Método que pone el apellido materno dentro de un parámetro llamado apellidomaterno
    public void setApellidoMaterno(String apellidoMaterno)
    {
        this.apellidoMaterno = apellidoMaterno;
    }
     
   //Mérodo que Retorna un dato en String
    public String toString()
    {
        //Retorna el nombre, apellidoPaterno y apellidoMaterno
        return this.nombre + " "  + this.apellidoPaterno + " " + this.apellidoMaterno; 
    }
     
}
