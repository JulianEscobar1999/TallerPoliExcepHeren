
package ejerciciotaler;

import Excepciones.ExcepcionLenguaje;
import Excepciones.ExcepcionNombre;
import dao.ArchivoBD;
import java.io.FileNotFoundException;
import modelo.Administrador;
import modelo.Consultor;
import modelo.Empresa;
import modelo.ExcepcionSalario;
import modelo.LiderProyecto;
import modelo.Programador;


public class EjercicioTaler {

    
    public static void main(String[] args) throws ExcepcionSalario, ExcepcionLenguaje {
        
        Empresa em = new Empresa();
        Consultor c = new Consultor("Ing",1);
        
        Administrador a = null;
        try{
            a = new Administrador("Juan Camilo",2000);
            em.agregarTrabajador(a);
        }catch(ExcepcionNombre e){
            e.printStackTrace();
        }catch(ExcepcionSalario e){
            e.printStackTrace();
        }          
        
        try{
        Programador p = new Programador("java","Diana Vanessa",90000,4);           
            em.agregarTrabajador(p);
        LiderProyecto lider = new LiderProyecto("java","Sebastian Perez",300000,7);
            lider.agregarProgramador(lider); 
            em.agregarTrabajador(lider);
        }catch(ExcepcionNombre e){
            e.printStackTrace();
        }catch(ExcepcionSalario e){
            e.printStackTrace();
        }   
        
        ArchivoBD arc = new ArchivoBD();
        try{
            arc.guardarInformacion(em);
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        
    }
    
}
