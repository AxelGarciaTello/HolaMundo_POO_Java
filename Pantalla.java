public class Pantalla {
    private Saludo mensaje;
    
    public void imprimir(){
        mensaje = new Saludo();
        mensaje.crearMensaje();
        String texto=mensaje.darMensaje();
        System.out.println(texto);
    }
}
