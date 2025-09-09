
package com.mycompany.impresoramain;

public class ImpresoraMain {

    public static void main(String[] args) {
        Documento docx = new Documento("Titulo del doc","Linea1");
        
        Impresora imp = new Impresora();
        imp.conectarWifi();
        imp.imprimir(docx);
        
        Documento scaneado = imp.escanear();
        
        imp.imprimir(scaneado);
        
        
    }
}
