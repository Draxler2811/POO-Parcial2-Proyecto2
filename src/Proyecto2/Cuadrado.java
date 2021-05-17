/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto2;

/**
 *
 * @author ol196
 */
public class Cuadrado extends Cuadrilatero{
    private double xCuadrado;
    private double yCuadrado;

    public Cuadrado(double xCuadrado) {
        this.xCuadrado = this.yCuadrado = xCuadrado;
    }
    
    @Override
    public double getArea() {
        double area = (xCuadrado * yCuadrado);
        return area;
    }

    @Override
    public double getAreaRectangulo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getAreaTrapecio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
    
}
  