/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package circulo;

import java.util.Scanner;

/**
 *
 * @Johann Lopez
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el radio pequeno r:");
        double radioPequeno = scanner.nextDouble();

        System.out.println("Ingrese el radio grande R:");
        double radioGrande = scanner.nextDouble();

        CoronaCircular corona = new CoronaCircular(radioPequeno, radioGrande);

        System.out.println("El area de la corona circular es: " + corona.obtenerArea());
        
        scanner.close();
    }
    
}
