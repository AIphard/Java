/*------------------------------------------------
Crea un proyecto llamado EjercicioOperaciones en el que se muestre en pantalla todas las posibles operaciones aritméticas que se 
pueden hacer con dos números enteros, dos números reales y con un número entero y uno real.
El programa pide al usuario por teclado los dos valores para hacer los calculos.
--------------------------------------------------*/
package proyecto1ejerciciooperaciones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Daniela Torres López.
 */

public class Proyecto1EjercicioOperaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        //int a;
        //int b;
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String b = br.readLine();
      
        
        //System.out.println((int)b+(int)a);
        System.out.println("Suma entera: " + (Integer.parseInt(a)+Integer.parseInt(b)));
        System.out.println("Resta entera: " + (Integer.parseInt(a)-Integer.parseInt(b)));
        System.out.println("Multiplicación entera: " + (Integer.parseInt(a)*Integer.parseInt(b)));
        System.out.println("División entera: " + (Integer.parseInt(a)/Integer.parseInt(b)));
        System.out.println("Modulo entero: " + (Integer.parseInt(a)%Integer.parseInt(b)));
        
        System.out.println("Suma real: " + (Double.parseDouble(a)+Double.parseDouble(b)));
        System.out.println("Resta real: " + (Double.parseDouble(a)-Double.parseDouble(b)));
        System.out.println("Multiplicación real: " + (Double.parseDouble(a)+Double.parseDouble(b)));
        System.out.println("División real: " + (Double.parseDouble(a)+Double.parseDouble(b)));
        System.out.println("Modulo real: " + (Double.parseDouble(a)+Double.parseDouble(b)));
        
        //c = (int)a+(int)b;
         
    }
    
}
