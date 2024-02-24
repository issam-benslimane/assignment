package org.example.presentation.spring.xml;

import org.example.metier.IMetier;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IMetier metier = context.getBean(IMetier.class);
        System.out.println("Résultat => " + metier.calcul());
    }
}