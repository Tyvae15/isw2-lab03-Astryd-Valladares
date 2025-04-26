/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.ulima.edu.lab03;

/**
 *
 * @author L34211
 */
public class ServicioIndustrial extends ServicioLimpieza{
    
    private double multiplicadorRiesgo;

    public ServicioIndustrial(String direccionCliente, double duracionHoras, double tarifaHora, boolean incluyeMateriales, String nombreCliente, double multiplicadorRiesgo) {
        super(direccionCliente, duracionHoras, tarifaHora, incluyeMateriales, nombreCliente);
        this.multiplicadorRiesgo = multiplicadorRiesgo;
    }
    
   
    @Override
    public double CalcularPrecioFinal() {
        
        if(incluyeMateriales){
            throw new  IllegalArgumentException("Los servicios industriales requieren materiales");
        }
        
        return calcularPrecioBase() * multiplicadorRiesgo;
    }
    
    
    
}
