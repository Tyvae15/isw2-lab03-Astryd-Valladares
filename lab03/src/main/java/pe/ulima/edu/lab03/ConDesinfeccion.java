/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.ulima.edu.lab03;

/**
 *
 * @author L34211
 */
public class ConDesinfeccion extends ServicioAdicional {
    
    private static final double COSTO_DESINFECCION = 15.0;  public ConDesinfeccion(ServicioLimpieza servicioBase) {
        super(servicioBase);
    }

    @Override
    public double CalcularPrecioFinal() {
        return servicioBase.CalcularPrecioFinal() + COSTO_DESINFECCION;
    }
    
    
    
}
