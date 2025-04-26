
package pe.ulima.edu.lab03;



public class ConAromatizante extends ServicioAdicional{
    
    private static final double COSTO_AROMATIZANTE = 5.0;

    public ConAromatizante(ServicioLimpieza servicioBase) {
        super(servicioBase);
    }


    @Override
    public double CalcularPrecioFinal() {
        return servicioBase.CalcularPrecioFinal() + COSTO_AROMATIZANTE;
    }
   
    
    
    
    
}
