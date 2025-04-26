/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.ulima.edu.lab03;

/**
 *
 * @author L34211
 */
public class ServicioOficina extends ServicioLimpieza{
    
    private int cantidadEmpleados;

    public ServicioOficina(String direccionCliente, double duracionHoras, double tarifaHora, boolean incluyeMateriales, String nombreCliente, int cantidadEmpleados) {
        super(direccionCliente, duracionHoras, tarifaHora, incluyeMateriales, nombreCliente);
        this.cantidadEmpleados = cantidadEmpleados;
    }

    @Override
    public double CalcularPrecioFinal() {
        
        double duracionTotal = duracionHoras + (cantidadEmpleados *0.1);
        double base = duracionTotal * tarifaHora;
        return base * 1.18;
    }
   
    
    
}
