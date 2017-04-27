/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Empresa {
    private ArrayList<Trabajador> trabajadores;

    public Empresa() {
        this.trabajadores = new ArrayList<>();
    }
    public void agregarTrabajador(Trabajador t){
      this.trabajadores.add(t);
    }
    
    public double calcularSalarioTotal(){
       double salarioTotal = 0;
        for (Trabajador trabajador : trabajadores) {
            salarioTotal+=trabajador.calcularSalario();
        }
        return salarioTotal;
    }
    
    public String listarInformacion(){
      String informacion = "";
        for (Trabajador trabajador : trabajadores) {
            informacion+=" " + trabajador.listarInformacion();
        }
        return informacion;
    }
    
}
