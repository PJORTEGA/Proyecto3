
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author javie
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         Scanner leer = new Scanner(System.in);
        String frase; 
        String palabra = "eureka";
       
        System.out.println("Ingrese una palabra");
        frase = leer.nextLine();
         if(frase.equals(palabra)){
             System.out.println("Correcto");
         }else {
             System.out.println("Incorrecto");
         }
    }
    
}
   
    
