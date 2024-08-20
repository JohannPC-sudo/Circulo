/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package circulo;
/**
 *
 * @Johann Lopez
 */
class Circulo {
    
    private final double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double obtenerArea() {
        return Math.PI * Math.pow(radio, 2);
    }
    
}
