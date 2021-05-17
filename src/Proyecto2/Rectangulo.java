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
public class Rectangulo extends Cuadrilatero {
    private double xRectangulo;
    private double yRectangulo;

    public Rectangulo(double xRectangulo, double yRectangulo) {
        this.xRectangulo = xRectangulo;
        this.yRectangulo = yRectangulo;
    }

    @Override
    public double getAreaRectangulo() {
       double arearectangulo=(xRectangulo*yRectangulo);
       return arearectangulo;
    }

    @Override
    public double getAreaTrapecio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getArea() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
  
    
}
