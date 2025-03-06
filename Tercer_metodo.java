/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursos_2;

/**
 *
 * 
 */
import java.util.Scanner;
public class Tercer_metodo {
    public static void main(String[] args) {
        // Crear objeto Scanner para entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar primer número
        System.out.print("Ingrese el primer numero entero: ");
        int numero1 = scanner.nextInt();
        
        // Solicitar segundo número
        System.out.print("Ingrese el segundo numero entero: ");
        int numero2 = scanner.nextInt();
        
        // Realizar multiplicación
        int resultado = numero1 * numero2;
        
        // Mostrar resultado
        System.out.println("Resultado: " + numero1 + " x " + numero2 + " = " + resultado);
        
        // Cerrar scanner
        scanner.close();
    }
    
}
