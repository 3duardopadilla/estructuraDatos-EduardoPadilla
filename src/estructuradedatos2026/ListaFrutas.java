package estructuradedatos2026;
import java.util.ArrayList;

public class ListaFrutas {

    public static void main(String[] args) {
        
        //ArrayList: Se utiliza para listas
        ArrayList<String> lista = new ArrayList<String>();
        
        //add(valor): Agregart un elemento
        lista.add("Manzana");      
        lista.add("Mango");
        lista.add("Durazno");
        //add(index, valor): Agregart un elemento en cualquier posicion    
        lista.add(3, "Pera");
        
        //get(): Obtener un elemento segun su indice
        System.out.println("fruta: " +lista.get(2));
        
        //set(): Cambia el valor de un elemento
        lista.set(1, "Mango Manila");
        
        //remove(). Quita elementos por indice o por objeto
        lista.remove(3);
        lista.remove("Pera");
        
        if(lista.contains("Manzana")) {System.out.println("Si hay la Manzanas");
        }else{
            System.out.println("No hay la Manzanas");
        }

        //Size(): Tamaño del arraylist
        System.out.println("Hay "+lista.size()+" frutas");
        //empty(): Verifica si el arraylist esta vacio
        System.out.println(lista.isEmpty());
        
        //foreach
        for(String fruta : lista){
            System.out.println(fruta);
        }
        
        //foreach moderno
        lista.forEach( (f)->{System.out.println(f);} );
        
        //for clasico 
        for(int i=0; i< lista.size(); i++){
            System.out.println(lista.get(i));
        }
        
        System.out.println(lista);
        
         //clear(): Limpia el arraylist
        //lista.clear();
               
        
    
    }
    
}
