
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author javie
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner leer = new Scanner(System.in);
        String frase;
        
        System.out.println("Ingrese una palabra o frase");
        frase = leer.nextLine();
        
        if(frase.length()== 8){
            System.out.println("Correcto");
        }else {
            System.out.println("Incorrecto");
        }
        
    }
    
}

