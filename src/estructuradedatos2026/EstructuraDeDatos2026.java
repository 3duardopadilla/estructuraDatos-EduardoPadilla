/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estructuradedatos2026;

/**
 *
 * @author eduardopadilla
 */
public class EstructuraDeDatos2026 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("☆⭐︎HOLA JAVA⭐︎☆");
        /*sout + tab */
        /*------------- ENTEROS --------------*/
        byte edad = 19;
        System.out.println("Edad: " + edad);
        short year = 2007;
        System.out.println("Año: " + year);
        int robux = 50000;
        System.out.println("Robux: " + robux);
        long estrellas = 200000000;
        System.out.println(robux + 1000);
        System.out.println(robux - 1000);
        System.out.println(robux * 2);
        System.out.println(robux/2);
        System.out.println(++robux); //robux = robux + 1
        System.out.println(--robux); //robux = robux - 1
        System.out.println(robux==2); //es igual a 2? false
        System.out.println(robux>2); //es mayor a 2? true
        System.out.println(robux<2); //es menor a 2? false
        System.out.println("Estrellas: " + estrellas);
        System.out.println(" ");
        /*********** DECIMALES O FLOTANTES ***********/
        double estatura = 1.85;
        System.out.println("Estatura: " + estatura);
        float deuda = 9999.99f;
        System.out.println("Deuda ITSON: " + deuda);
        // Mismas operaciones que los enteros //
        System.out.println(" ");
        /************ CARACTER ***********/
        char grupo = 'a';
        char grupo2 = 'Z';
        System.out.println("grupo: " + grupo);
        System.out.println(++grupo);
        System.out.println(++grupo);
        System.out.println(++grupo);
        System.out.println(grupo==grupo2);
        System.out.println(grupo<grupo2);
        System.out.println(grupo>grupo2);
        System.out.println("Grupo: " + grupo);
        System.out.println(" ");
        /*********** Boleanos *************/
        boolean pago = true; //false
        System.out.println("¿Pago? " + pago);
        System.out.println(pago == true);
        System.out.println(pago != true);
        System.out.println(pago == false);
        System.out.println(pago != false);
        System.out.println("-----");
        System.out.println(true && true && true);
        System.out.println(5>2 && 'a' == 'a' && 5.5 != 2.5);
        System.out.println(5>2 && 'a' == 'b' && 5.5 != 2.5);
        System.out.println(5>20 || 'a' == 'b' || 5.5 != 2.5);
        System.out.println(false || false | true);
        System.out.println(" ");
        /** cadena de texto **/
        String nombre = "Jose Eduardo";
        System.out.println(nombre);
        System.out.println(nombre.charAt(0));
        System.out.println(nombre.charAt(5));
        System.out.println(nombre.length());
        for(int i=0; i<nombre.length(); i++){
            System.out.println(nombre.charAt(i));
    }
        System.out.println(nombre.toLowerCase());
        System.out.println(nombre.toUpperCase());
        System.out.println(nombre.equals("Jose Eduardo"));
        System.out.println(nombre.equals("JoSE EduARdo"));
        System.out.println(nombre.equalsIgnoreCase("JoSE EduARdo"));
        System.out.println(nombre.indexOf("a"));
        System.out.println("Eduardo@gmail.com".indexOf("."));
        System.out.println("Fasdf.jpg".endsWith(".jpg") || "fasdfas.png".endsWith(".png"));  
        System.out.println("".isEmpty()); //Valida que el string esté vacio
        System.out.println("     ".isBlank()); //Valida que esté vacio y/o que posea espacios en blanco
        System.out.println("conejo bonito".replace("o", "e"));
        System.out.println("conejo bonito".replaceFirst("o", "e"));
        System.out.println("Juanito".substring(3));
        System.out.println("Juanito".substring(3,5));
       
        // Operaciones aritmeticas
        // - + * / ++ --
        
        // Operaciones relacionales
        // == > < >= <= != ===
        
        // Operaciones logicas
        // &&   and
        // || or
        
        ProductoOG producto1;
        producto1 = new ProductoOG(1,
                "Playera Maja Verde", 
                "PM-V-M-01", 
                'M',
                (byte)2,
                (short)2026,
                100,
                0.25f,
                1500.00,
                true);
        
        System.out.println("Producto: " + producto1.getNombre());
        System.out.println("Precio: " + producto1.getPrecioUnitario());
        
        /** CLASE BoletoAvion
        numeroTickets
        codigoReserva
        * asientoFila
        * asientoLetra
        * distanciakm
        * altitud
        * pesoEquipajeKg
        * precioBoleto
        * incluyeEquipajeMano
        * 
        * CLASE Paciente
        * 
        * numeroSeguroSocial
        * nombreCompleto
        * edad
        * SexoBiologico
        * Glucosa;
        * globulosRojos
        * TemperaturaCorporal
        * dosisMedicamentoMl
        * esAlergicoPenecilina
         */
    }
}
