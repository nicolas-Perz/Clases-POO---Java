
package com.mycompany.automain;


public class AutoMain {

    public static void main(String[] args) {
        Motor motor = new Motor(12345,"Nafta",1.6);
        
        Auto a1 = new Auto("ABC123","Ford","Negro",1,motor);
        Auto a2 = new Auto("ABC126","Chevrolet","Azul",3,motor);
        
        System.out.println(a1);
        System.out.println(a2);
    }
}
