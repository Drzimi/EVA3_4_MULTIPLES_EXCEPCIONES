/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_4_multiples_excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA3_4_MULTIPLES_EXCEPCIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x , y;
        do{
        try{
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce el valor de x(Que sea entero)");
        x = input.nextInt();
        System.out.println("Introduce el valor de y(Que sea entero)");
        y = input.nextInt();
        int resu = x / y;
        System.out.println("El resultado de " + x + "/" + y + ":" + resu);
        }catch(ArithmeticException a){
            System.out.println("No se puede dividir entre 0");
        }
        catch(InputMismatchException a){
            System.out.println("No se puede transformar variable a entero");    
        }
        break;
        }while(true);
           System.out.println("Programa terminado exitosamente");  
    
    }    
     
}
