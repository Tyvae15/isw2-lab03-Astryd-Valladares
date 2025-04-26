/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.ulima.edu.lab03;

/**
 *
 * @author L34211
 */
public class ServicioHogar extends ServicioLimpieza{
    
    private boolean esApartamento;

    public ServicioHogar(String direccionCliente, double duracionHoras, double tarifaHora, boolean incluyeMateriales, String nombreCliente, boolean esApartamento) {
        super(direccionCliente, duracionHoras, tarifaHora, incluyeMateriales, nombreCliente);
        this.esApartamento = esApartamento;
        
    }
    

    @Override
    public double CalcularPrecioFinal() {
        
        double precioBase = calcularPrecioBase();
        
       if(esApartamento){
           precioBase = 0.90 *precioBase;
       }
       return precioBase;
    }
    
}
