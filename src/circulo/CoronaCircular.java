/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package circulo;

/**
 *
 * @Johann Lopez
 */
public class CoronaCircular {
    
    private final Circulo circuloInterior;
    private final Circulo circuloExterior;

    public CoronaCircular(double radioInterior, double radioExterior) {
        circuloInterior = new Circulo(radioInterior);
        circuloExterior = new Circulo(radioExterior);
    }

    public double obtenerArea() {
        return circuloExterior.obtenerArea() - circuloInterior.obtenerArea();
    }     
    
}
