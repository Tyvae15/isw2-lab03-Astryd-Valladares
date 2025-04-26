/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.ulima.edu.lab03;


public class ServicioFactory {
    public static ServicioLimpieza crearServicio(
            String tipo,
            String direccionCliente,
            double duracionHoras,
            double tarifaHora,
            boolean incluyeMateriales,
            String nombreCliente,
            Object... atributosAdicionales
    ) {
        switch (tipo.toLowerCase()) {
            case "hogar" -> {
                // atributosAdicionales[0]: boolean esApartamento
                return new ServicioHogar(
                        direccionCliente,
                        duracionHoras,
                        tarifaHora,
                        incluyeMateriales,
                        nombreCliente,
                        (boolean) atributosAdicionales[0]
                );
            }
            case "oficina" -> {
                // atributosAdicionales[0]: int cantidadEmpleados
                return new ServicioOficina(
                        direccionCliente,
                        duracionHoras,
                        tarifaHora,
                        incluyeMateriales,
                        nombreCliente,
                        (int) atributosAdicionales[0]
                );
            }
            case "industrial" -> {
                // atributosAdicionales[0]: double multiplicadorRiesgo
                return new ServicioIndustrial(
                        direccionCliente,
                        duracionHoras,
                        tarifaHora,
                        incluyeMateriales,
                        nombreCliente,
                        (double) atributosAdicionales[0]
                );
            }
            default -> throw new IllegalArgumentException("Tipo de servicio no reconocido: " + tipo);
        }
    }
}
    
