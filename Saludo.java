
import java.util.Scanner;

public class Saludo {
    
    private Scanner teclado = new Scanner(System.in);
    private String nombre;
    
    public void preguntarNombre(){
        System.out.println("¿Cúal es tu nombre?");
        nombre=teclado.nextLine();
    }
    
    public void saludar(){
        System.out.println("Hola "+nombre+".\nHola mundo.");
    }
    
}
