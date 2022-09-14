package com.ejercicio2;

import org.springframework.stereotype.Component;

@Component
public class NotificationService {

    public NotificationService() {
        System.out.println("Iniciando clase NotificationService");
    }

    public String imprimirSaludo(){
        return "Saludo ejercicio 2";
    }
}
