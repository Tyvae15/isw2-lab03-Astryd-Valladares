/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.ulima.edu.lab03;

/**
 *
 * @author Astryd
 */
public class Test {
    
    public static void main(String[] args) {
        // Crear un servicio de hogar
        ServicioLimpieza servicioHogar = ServicioFactory.crearServicio(
            "hogar",
            "Calle Los Pinos 789",
            2.5,
            40.0,
            true,
            "María",
            true  // esApartamento
        );

        System.out.println("Servicio creado: Hogar");
        System.out.println("Precio final: S/ " + servicioHogar.CalcularPrecioFinal());

        // Crear un servicio de oficina
        ServicioLimpieza servicioOficina = ServicioFactory.crearServicio(
            "oficina",
            "Av. Central 123",
            4.0,
            60.0,
            false,
            "OficinasPeru S.A.",
            15  // cantidadEmpleados
        );

        System.out.println("\nServicio creado: Oficina");
        System.out.println("Precio final: S/ " + servicioOficina.CalcularPrecioFinal());

        // Crear un servicio industrial
        ServicioLimpieza servicioIndustrial = ServicioFactory.crearServicio(
            "industrial",
            "Zona Industrial Sur",
            6.0,
            70.0,
            false,
            "Industrias Unidas",
            1.5 // multiplicadorRiesgo
        );

        System.out.println("\nServicio creado: Industrial");
        System.out.println("Precio final: S/ " + servicioIndustrial.CalcularPrecioFinal());
    }
    
}
