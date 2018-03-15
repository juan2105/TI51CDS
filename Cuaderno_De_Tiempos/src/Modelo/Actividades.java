/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Conta
 */
public class Actividades 
{
    int id;
    String fecha;
    String fechaInicio;
    String fechaFin;
    String tiempoAcumulado;
    String tiempoPausado;
    String materia;
    char completado;
    
    public Actividades()
    {
    
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getTiempoAcumulado() {
        return tiempoAcumulado;
    }

    public void setTiempoAcumulado(String tiempoAcumulado) {
        this.tiempoAcumulado = tiempoAcumulado;
    }

    public String getTiempoPausado() {
        return tiempoPausado;
    }

    public void setTiempoPausado(String tiempoPausado) {
        this.tiempoPausado = tiempoPausado;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public char getCompletado() {
        return completado;
    }

    public void setCompletado(char completado) {
        this.completado = completado;
    }
    
    
}
