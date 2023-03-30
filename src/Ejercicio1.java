
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author javie
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1;
         Scanner leer = new Scanner(System.in);
       int num;
        System.out.println("Ingrese un numero");
        
        num = leer.nextInt();
        
        if (num % 2 == 0){
            System.out.println(" El numero es par");
        }else {
            System.out.println("El numero es impar");
        }
      }
    
    
}

        
  
