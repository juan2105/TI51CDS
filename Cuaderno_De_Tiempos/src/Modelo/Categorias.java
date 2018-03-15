/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Vista.Cuaderno_De_Tiempo;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Conta
 */
public class Categorias 
{
     int id;
    String nombre;
    
    public Categorias()
    {
    
    }
    
    public Categorias(int id, String nom)
    {
        this.id = id;
        this.nombre = nom;
    }

     public Vector<Categorias> MostrarCategorias() throws SQLException
    {
        Controlador.Db con = new Controlador.Db();
        Connection cn = con.conexion();
        Vector<Categorias> datos = new Vector<Categorias>();
        Categorias dat = null;
        try
        {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT id, nombre FROM categorias");
            while(rs.next())
            {
                dat = new Categorias();
                dat.setId(rs.getInt("id"));
                dat.setNombre(rs.getString("nombre"));
                datos.add(dat);
            }
            rs.close();
        }
        catch(SQLException e)
                {
                    Logger.getLogger(Cuaderno_De_Tiempo.class.getName()).log(Level.SEVERE,null,e);
                }
        return datos;
    }

    public int getId() 
    {
        return id;
    }

    public void setId(int id) 
    {
        this.id = id;
    }

    public String getNombre() 
    {
        return nombre;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }
    
     public String toString()
    {
        return this.nombre;
    }
     
}
