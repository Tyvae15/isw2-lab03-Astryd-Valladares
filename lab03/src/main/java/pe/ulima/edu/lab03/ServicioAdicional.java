/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.ulima.edu.lab03;

/**
 *
 * @author L34211
 */
public abstract class ServicioAdicional extends ServicioLimpieza {
    
    protected ServicioLimpieza servicioBase;

   public ServicioAdicional(ServicioLimpieza servicioBase) {
        super(servicioBase.getDireccionCliente(), servicioBase.getDuracionHoras(), servicioBase.getTarifaHora(), servicioBase.isIncluyeMateriales(), servicioBase.getNombreCliente());
        this.servicioBase = servicioBase;
    }
    
    
    @Override
    public abstract double CalcularPrecioFinal();
    
    
    
    
    
    
}
