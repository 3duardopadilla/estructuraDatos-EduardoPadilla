package estructuradedatos2026;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 *
 * @author eduardopadilla
 */
public class Pila {

    public static void main(String[] args) {
        
        Deque pilaO = new ArrayDeque<>();  //Pila de objetos Object
        Deque<String> pila = new ArrayDeque<>();  //Pila de String
        
        //Push: Apilar elemento (↑)
        pila.push("Frutas");
        pila.push("Mango");
        pila.push("Manzana");
        pila.push("Mango");
        pila.push("Ciruela");
        pila.push("Tamarindo");
        //Peek: Ver la cima sin retirarlo
        System.out.println("Cima: " + pila.peek());
        //Pop: Desapilar
        System.out.println("Retirado: " + pila.pop());
        System.out.println("Nueva cima: " + pila.peek());
        
        System.out.println("----- Hay " + pila.size()+" frutas en la pila ---");        
        while(!pila.isEmpty()){ //pila.isEmpty()!= true
            System.out.println("Procesado: " + pila.pop());            
        }
        
        System.out.println("Ya no hay nada en esta pila!!!!!!!");
    }
    
}
