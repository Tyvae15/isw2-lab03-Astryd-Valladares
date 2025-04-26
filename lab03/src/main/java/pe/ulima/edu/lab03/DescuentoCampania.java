/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.ulima.edu.lab03;

/**
 *
 * @author L34211
 */
public class DescuentoCampania implements Descuento {
    
        private static final double PORCENTAJE_DESCUENTO = 0.20;

    @Override
    public double aplicarDescuento(double monto) {
        
        return monto * (1- PORCENTAJE_DESCUENTO);
       
    }
   
    
}
