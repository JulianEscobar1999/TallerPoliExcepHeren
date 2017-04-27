/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import Excepciones.ExcepcionNombre;

/**
 *
 * @author Estudiante
 */
public class Administrador extends Empleado{

    public Administrador(String nombre, int id)
        throws ExcepcionNombre, ExcepcionSalario {
        super(nombre, 100000, id);
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }
    
    
    
    @Override
    public double calcularSalario() {
        return this.salario;
    }

    @Override
    public String listarInformacion() {
        return "Administrador "  + this.id + " " + this.nombre;
    }
}
