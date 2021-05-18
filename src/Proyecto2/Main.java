/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto2;

import java.util.Scanner;

/**
 *
 * @author ol196
 */
public class Main {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     Cuadrado c1;
     Rectangulo c2;
     Trapecio c3;
     double xCuadrado,yCuadrado;
     double xRectangulo,yRectangulo;
     double BaseMTrapecio,BasemTrapecio;
     double altura;
     
     
     
        System.out.println("------Cuadrado-----");
        
        System.out.print("Ingresa el valor de x:");
        xCuadrado=sc.nextDouble();
        
        System.out.print("Ingresa el valor de y:");
        yCuadrado=sc.nextDouble();
        
        c1=new Cuadrado(xCuadrado);
      
        System.out.println("La area del cuadrado  es: " + c1.getArea());
        
        System.out.println("----------Rectangulo------");
        
         System.out.print("Ingresa el valor de x:");
        xRectangulo=sc.nextDouble();
        
        System.out.print("Ingresa el valor de y:");
        yRectangulo=sc.nextDouble();
        
        c2 = new Rectangulo(xRectangulo,yRectangulo);
        
 
        System.out.println("La area del rectangulo es: " + c2.getAreaRectangulo());
        
        System.out.println("---------Trapecio----------");
         
  
       
        
        System.out.println("Base M Mayor");
        BaseMTrapecio=sc.nextDouble();
        
        System.out.println("Base m Menor");
        BasemTrapecio=sc.nextDouble();
        
         
         System.out.println("Altura");
        altura=sc.nextDouble();
        
       
        
        c3 = new Trapecio(BasemTrapecio,BaseMTrapecio,altura);
        System.out.println("area del trapecio: " + c3.getAreaTrapecio());
        
       
        
    }

  
}
