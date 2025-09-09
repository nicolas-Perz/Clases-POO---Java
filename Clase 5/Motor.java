
package com.mycompany.automain;

public class Motor {
    private int nroSerie;
    private String tipoCombustible;
    private double cilindrada;
    private int rpm; // siempre arranca en cero
    
    public Motor(int nroSerie, String tipoCombustible, double cilindrada){
        this.nroSerie = nroSerie;
        this.tipoCombustible = tipoCombustible;
        this.cilindrada = cilindrada;
    }
    
    public void setRPM(int revoluciones){
        this.rpm = revoluciones;
    }
    
    @Override
    public String toString(){
        return "nroSerie: " + nroSerie + " tipoCombustible: " + tipoCombustible + " Cilindrada: " + cilindrada + " RPM: " + rpm;
    }
}
