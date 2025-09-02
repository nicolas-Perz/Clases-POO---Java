package com.mycompany.clasesprog;

public class Televisor {
    private final String marca;
    private final double tamanio;
    private int canal = INIT_CANAL;
    private int volumen;
    private boolean encendido;
    private final static int MAX_CANAL = 100;
    private final static int MIN_CANAL = 1;
    private final static int INIT_CANAL = 1; // centralizar cambios
    
    public Televisor(String marca, double tamanio){
        validarTamanio(tamanio);
        this.marca = marca;
        this.tamanio = tamanio;
    }
    
    private void validarTamanio(double tamanio){
        if(tamanio <= 0){
            throw new IllegalArgumentException("Tamaño inválido");
        }
    }
    
    public void showInfo(){
        System.out.println("----------------------------");
        validarEncendido();
        System.out.println("Marca: " + marca);
        System.out.println("Tamaño: " + tamanio);
        System.out.println("Canal: " + canal);
        System.out.println("Volumen: " + volumen);
        System.out.println("Encendido " + encendido);
    }
    
    public void subirCanal(){
        if(canal < MAX_CANAL){
            canal++;
        }else{
            canal = MIN_CANAL;
        }
        mostrarCanal();
    }
    public void bajarCanal(){
        if(canal > MIN_CANAL){
            canal --;
        }else{
            canal = MAX_CANAL;
        }
        mostrarCanal();
    }
    
    private void mostrarCanal(){
        System.out.println("Canal: " + canal);
    }
    
    public void power(){
        encendido = !encendido;
        System.out.println((encendido) ? "On" : "Off");
    }
    
    public void validarEncendido(){
        if(!encendido){
            throw new IllegalStateException("Apagado");
        }
    }
}
