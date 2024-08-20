/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package circulo;

/**
 *
 * @Johann Lopez
 */
public class circulo {
    
    private final double radio;

    public circulo(double radio) {
        this.radio = radio;
    }

    public double obtenerArea() {
        return Math.PI * Math.pow(radio, 2);
    }    
}
