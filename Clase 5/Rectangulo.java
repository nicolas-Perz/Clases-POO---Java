
package com.mycompany.ejerciciosguia1;



public class Rectangulo {
    private final double ancho;
    private final double alto;
    
    public Rectangulo(double ancho, double alto){
        validarPositivo(ancho);
        validarPositivo(alto);
        this.ancho = ancho;
        this.alto = alto;
    }
    
    private void validarPositivo(double valor){
        if(valor <= 0){
            throw new IllegalArgumentException("Parametro inválido");
        }
    }
    
    public double calcularArea(){
        return this.ancho*this.alto;
    }
    
    public double calcularPerimetro(){
        return 2*(this.ancho + this.alto);
    }
    
    public boolean esCuadrado(){
        return this.ancho == this.alto;
    }
    
    public double getAncho(){
        return ancho;
    }
    
    public double getAlto(){
        return alto;
    }
    
    public Rectangulo sumar(Rectangulo rect){
        Rectangulo r = new Rectangulo(this.ancho + rect.ancho , this.alto + rect.alto);
        return r;
    }
    
    public Rectangulo sumar(Rectangulo rect, Rectangulo rect2){
        return rect.sumar(rect2);
    }
    
    @Override
    public String toString(){
        return "Ancho: " + ancho + " Alto: " + alto;
    }
    
    
}
