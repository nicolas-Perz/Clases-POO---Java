
package com.mycompany.impresoramain;

public class Impresora {
    private boolean online;
    
    public Impresora(){
        
    }
    
    public boolean conectarWifi(){
        if(!online){
            online = true;
        }
        return online;
    }
    
    public void imprimir(Documento doc){
        if(online){
        System.out.println(doc.getTitulo());
        System.out.println(doc.getCuerpo());
        }
    }
    
    public Documento escanear(){
        Documento scan = null;
        if(online){
            scan = new Documento("Titulo escaneado","Cuerpo del escaneo");
        }
        return scan;
    }
}
