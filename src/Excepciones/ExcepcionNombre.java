
package Excepciones;


public class ExcepcionNombre extends Exception {
    public ExcepcionNombre(){
        super("El nombre debe tener minimo 10 caracteres");
    }
}
