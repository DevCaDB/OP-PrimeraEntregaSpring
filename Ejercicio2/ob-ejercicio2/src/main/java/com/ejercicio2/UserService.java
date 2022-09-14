package com.ejercicio2;

import org.springframework.stereotype.Component;

@Component
public class UserService {

    //atributos
    NotificationService notificationService;


//constructor

    public UserService(NotificationService objetoNotification) {
        System.out.println("Ejectuando constructor de UserService");
        notificationService = objetoNotification;
    }

    //getters y setters
    public NotificationService getNotificationService() {
        return notificationService;
    }

    public void setNotificationService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }
}
