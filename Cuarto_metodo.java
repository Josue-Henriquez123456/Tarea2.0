/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursos_2;

/**
 *
 * 
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cuarto_metodo {
     public static List<Integer> generarLista(int limite) {
        List<Integer> lista = new ArrayList<>();
        for (int i = 1; i <= limite; i++) {
            lista.add(i);
        }
        return lista;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el numero limite: ");
        int x = scanner.nextInt();
        
        List<Integer> resultado = generarLista(x);
        
        System.out.println("Lista de numeros del 1 al " + x + ":");
        for (int numero : resultado) {
            System.out.print(numero + " ");
        }
        
        scanner.close();
    }
}

