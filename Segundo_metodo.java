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

public class Segundo_metodo {
    public static void main(String[] args) {
        // Solicitar la edad al usuario
        try ( // Crear objeto Scanner para leer input del usuario
        java.util.Scanner f = new Scanner(System.in)) {
            // Solicitar la edad al usuario
            System.out.print("Ingrese su edad: ");
            int edadEstudiante = f.nextInt();
            // Verificación de la edad
            if (edadEstudiante >= 21) {
                System.out.println("Mayor de edad");
            } else {
                System.out.println("Menor de edad");
            }
            // Cerrar el scanner
        }
       }
}
