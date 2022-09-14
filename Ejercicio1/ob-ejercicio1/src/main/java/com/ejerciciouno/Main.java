package com.ejerciciouno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Saludo saludo = (Saludo) context.getBean("Saludo");
        String textoDelSaludo = saludo.imprimirSaludo();
        System.out.println(textoDelSaludo);

        Saludo saludo2 = (Saludo) context.getBean("Saludo");
        String textoDelSaludoDos = saludo2.imprimirSaludo();
        System.out.println("Este es el saludo 2: "+textoDelSaludoDos);
    }
}
