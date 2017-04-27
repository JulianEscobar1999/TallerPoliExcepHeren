
package dao;

import com.sun.istack.internal.logging.Logger;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;
import modelo.Administrador;
import modelo.Consultor;
import modelo.Empresa;
import modelo.LiderProyecto;
import modelo.Programador;
import modelo.Trabajador;


public class ArchivoBD {
    
    
    public void guardarInformacion(Empresa e) throws FileNotFoundException{
        File archivo = new File("empresa.txt");
        PrintStream salida = new PrintStream(archivo);
        
        for(Trabajador t : e.getTrabajadores() ){
            if(t instanceof Consultor){
                Consultor c = (Consultor) t;
                salida.print("C,"+c.getId()+","+c.getLabor()+",");               
            }else if(t instanceof Administrador){
                Administrador a = (Administrador) t ;
                salida.print("A,"+a.getId()+","+a.getNombre()+","+a.getSalario()+",");
            }else if(t instanceof LiderProyecto){
                LiderProyecto l = (LiderProyecto)t;
                salida.print("L,"+l.getId()+","+l.getNombre()+","+l.getSalario());
                salida.print(l.getProgramadores().size()+",");
                for(Programador p : l.getProgramadores()){
                    salida.print(p.getId()+",");
                }
            }else if(t instanceof Programador){
                Programador p = (Programador) t;
                salida.print("P"+p.getId()+","+p.getNombre()+","+p.getSalario()+",");
            }
            
        }
        
        salida.close();
    }
    
    public Empresa cargarInformacion(){
        File archivo = new File("empresa.txt");
        String tipo = "";
        try{
            Scanner lectura = new Scanner(archivo);
            lectura.useDelimiter(",");
            while(lectura.hasNext()){
                while(lectura.hasNext())
                    tipo = lectura.next();
                if(tipo.equals("C")){
                    System.out.println("ID"+lectura.nextInt());
                    System.out.println("Labor"+lectura.next());
                }else if(tipo.equals("A")){
                    System.out.println("ID"+lectura.nextInt());
                    System.out.println("Nombre"+lectura.next());
                    System.out.println("Salario"+lectura.nextDouble());
                }
                System.out.println(lectura.next());
            }
            lectura.close();
                    
        }catch(FileNotFoundException ex){
            Logger.getLogger(ArchivoBD.class.getName()) ;
                    
        }
    }
    
    
}
