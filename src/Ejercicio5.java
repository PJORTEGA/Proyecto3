
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author javie
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
        int num;
        int valpos;
        int suma=0;
           
        System.out.println("Ingrese un valor limite");
        valpos = leer.nextInt();
        
       do {
           System.out.println("Ingrese un numero");
           num = leer.nextInt();
           suma += num;
       }while (suma<=valpos);
    }
    
}

        
     
   
    
