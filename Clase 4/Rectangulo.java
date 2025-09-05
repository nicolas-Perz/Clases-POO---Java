
package com.mycompany.ejerciciosguia1;



public class Rectangulo {
    private final double ancho;
    private final double alto;
    
    public Rectangulo(double ancho, double alto){
        this.ancho = ancho;
        this.alto = alto;
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
    public Rectangulo sumar(Rectangulo rect){
        Rectangulo r = new Rectangulo(this.ancho + rect.ancho , this.alto + rect.alto);
        return r;
    }
    public static Rectangulo sumar(Rectangulo r1, Rectangulo r2){
        return r1.sumar(r2);
    }
}
