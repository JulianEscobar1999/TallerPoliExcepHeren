
package modelo;

import Excepciones.ExcepcionNombre;


public abstract class Empleado extends Trabajador{
     protected String nombre;
     protected double salario;

    public Empleado(String nombre, double salario, int id) throws ExcepcionNombre, ExcepcionSalario {
        super(id);
        
        if(nombre.length()<10)
            throw new ExcepcionNombre();
        
        if(salario < 73700)
            throw new ExcepcionSalario();
        
        this.nombre = nombre;
        this.salario = salario;
    }
   
}
