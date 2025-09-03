package com.mycompany.clasesprog;

public class Televisor {
    private final String marca;
    private final double tamanio;
    private boolean encendido;
    private boolean isMute;
    
    private int canal = INIT_CANAL;
    private final static int MAX_CANAL = 100;
    private final static int MIN_CANAL = 1;
    private final static int INIT_CANAL = 1; // centralizar cambios
    
    private final static int INIT_VOLUMEN = 5;
    private int volumen = INIT_VOLUMEN;
    private final static int MAX_VOLUMEN = 5;
    private final static int MIN_VOLUMEN = 0;
    
    private final int nroSerie;
    private final static int INIT_SERIE = 100000;
    private static int nextSerie = INIT_SERIE;
    
    public Televisor(String marca, double tamanio){
        validarTamanio(tamanio);
        validarMarca(marca);
        this.marca = marca;
        this.tamanio = tamanio;
        nroSerie = Televisor.getSerieAndIncrement();
    }
    
    private static int getSerieAndIncrement(){
        return nextSerie++;
    }
    private void validarMarca(String marca){
        if(marca == null || marca.isBlank() || marca.isEmpty() || marca.length() < 2){
            throw new IllegalArgumentException("Marca inválida");
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
    
    
    // ----------------------------------------------------------------------
    public int getNroSerie(){
        return nroSerie;
    }
    // ----------------------------------------------------------------------
    
    private void validarTamanio(double tamanio){
        if(tamanio <= 0){
            throw new IllegalArgumentException("Tamaño inválido");
        }
    }
    
    // ----------------------------------------------------------------------
    // CANAL
    public void subirCanal(){
        validarEncendido();
        if(canal < MAX_CANAL){
            canal++;
        }else{
            canal = MIN_CANAL;
        }
        mostrarCanal();
    }
    public void bajarCanal(){
        validarEncendido();
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
    
    public void setCanal(int canal){
        validarEncendido();
        validarCanal(canal);
        this.canal = canal;
    }
    private void validarCanal(int canal){
        if((canal > MAX_CANAL) || (canal < MIN_CANAL)){
            throw new IllegalArgumentException("Canal inválido");
        }
    }

    // ----------------------------------------------------------------------
    // POWER
    public void power(){
        encendido = !encendido;
        System.out.println((encendido) ? "On" : "Off");
    }
    
    private void validarEncendido(){
        if(!encendido){
            throw new IllegalStateException("Apagado");
        }
       }
    
    // ----------------------------------------------------------------------
    // VOLUMEN
    public void subirVolumen(){
        validarEncendido();
        if(volumen < MAX_VOLUMEN){
            isMute = false;
            volumen++;
        }
        mostrarVolumen();
    }
    
    public void bajarVolumen(){
        validarEncendido();
        isMute = false;
        if(volumen > MIN_VOLUMEN){
            volumen--;
        }else{
            mute();
        }
        
        mostrarVolumen();
    }
    
    public void mostrarVolumen(){
        validarEncendido();
        System.out.println("Volumen: " + volumen);
    }
    
    public void mute(){
        validarEncendido();
        isMute = !isMute;
        System.out.println((isMute) ? "MUTE" : "NO MUTE");
    }
    
}