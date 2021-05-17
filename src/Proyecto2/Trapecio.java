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
public class Trapecio extends Cuadrilatero{
 private double BaseMTrapecio;
    private double BasemTrapecio;
    private double altura;
    
    public Trapecio(double BaseMTrapecio, double BasemTrapecio, double altura) {
        this.BaseMTrapecio = BaseMTrapecio;
        this.BasemTrapecio = BasemTrapecio;
        this.altura = altura;
    }

    @Override
    public double getAreaRectangulo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getAreaTrapecio() {
         double areatrapecio = (BaseMTrapecio+BasemTrapecio)*altura/2;
        return areatrapecio;
    }

    @Override
    public double getArea() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


  
}
