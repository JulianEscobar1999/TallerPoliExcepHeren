
package Excepciones;


public class ExcepcionNombre extends Exception {
    public ExcepcionNombre(){
        super("El nombre debe tener maximo 10 caracteres");
    }
}
