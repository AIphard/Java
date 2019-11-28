/*------------------------------------------------
Crea un proyecto llamado EjercicioOperaciones en el que se muestre en pantalla todas las posibles operaciones aritméticas que se 
pueden hacer con dos números enteros, dos números reales y con un número entero y uno real.
El programa pide al usuario por teclado los dos valores para hacer los calculos.
--------------------------------------------------*/
package proyecto1ejerciciooperaciones;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Daniela Torres López
 */
public class Proyecto1EjercicioOperaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        int opc = 1;
        do{ /*----Bucle para hacer otra operación----*/
            
            System.out.println(" Introduzca dos números ");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            Scanner reader = new Scanner(System.in);
            /* La entrada es en formato cadena */
            String a = br.readLine();
            String b = br.readLine();
            /*--- Conversión de String a Double para realizar la suma entera por si algún número contiene punto. ---*/
            double A = Double.parseDouble(a);
            double B = Double.parseDouble(b);
            
            /*---------Muestra de operaciones aritméticas con números enteros---------*/
            
            System.out.println("Suma entera: " + ((int)A+(int)B));
            System.out.println("Resta entera: " + ((int)A-(int)B));
            System.out.println("Multiplicación entera: " + ((int)A*(int)B));
            System.out.println("División entera: " + ((int)A/(int)B));
            System.out.println("Modulo entero: " + ((int)A%(int)B));
            System.out.println("------------------------------------------------");
            
            /*---------Muestra de operaciones aritméticas con números reales ---------*/
            System.out.println("Suma real: " + (A+B));
            System.out.println("Resta real: " + (A-B));
            System.out.println("Multiplicación real: " + (A*B));
            System.out.println("División real: " + (A/B));
            System.out.println("Modulo real: " + (A%B));
            System.out.println("------------------------------------------------");
            
            /*---------Muestra de operaciones aritméticas mixtas------------*/
            System.out.println("Suma mixta: " + ((int)A+B));
            System.out.println("Resta mixta: " + ((int)A-B));
            System.out.println("Multiplicación mixta: " + ((int)A*B));
            System.out.println("División mixta: " + ((int)A/B));
            System.out.println("Modulo mixta: " + ((int)A%B));
            System.out.println("------------------------------------------------");
            
            /*----Salida de bucle----*/
            System.out.println("¿De nuevo? (1 - SÍ)(0 - NO)");
            opc = reader.nextInt();
            
        }while(opc==1);
    }  
}
