package estructuradedatos2026;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author eduardopadilla
 */
public class MiFila {

    public static void main(String[] args) {
        //cola Oxxo instanciada e inicializada
      Queue<String> colaOXXO = new LinkedList<>();
      
      //offer: Agregar un elemento a la cola
      colaOXXO.offer("Maria");
      colaOXXO.offer("Pepe");
      colaOXXO.offer("Juan");
      colaOXXO.offer("Ana");
      colaOXXO.offer("Carlos");
      
      
      //peek: Muestra el siguiente en la cola
      System.out.println("Siguient:");
      System.out.println(colaOXXO.peek());
      
      //poll: Saca a el siguiente en la cola 
      System.out.println("Atendido:");
      System.out.println(colaOXXO.poll());     
      
      //size: Cantidad de elementos en la cola 
      System.out.println("\n Quedan: " + colaOXXO.size());      
      System.out.println(colaOXXO);            
      
      //isEmpty: Verifica si la cola esta vacia
      System.out.println("\n Esta vacia?: " + colaOXXO.isEmpty());      
      System.out.println(colaOXXO);                  
      
      
    }
    
}
