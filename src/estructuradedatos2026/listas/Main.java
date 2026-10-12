package estructuradedatos2026.listas;

/**
 *
 * @author eduardopadilla
 */
public class Main {

    public static void main(String[] args) {
        
        ListaEnlazada listaAlumnos = new ListaEnlazada();
        
            System.out.println("tamaño: "+listaAlumnos.cantidadNodos());

            listaAlumnos.agregarInicio("Juanito");
            listaAlumnos.agregarInicio("Maria");
            listaAlumnos.agregarFinal("Lupita");
            listaAlumnos.agregarFinal("Carlos");
            
            System.out.println("tamaño: "+listaAlumnos.cantidadNodos());
            listaAlumnos.mostrarLista();
            
    }
    
}
