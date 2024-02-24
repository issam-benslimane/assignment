package org.example.presentation.spring.annotations;

import org.example.dao.DaoImpl;
import org.example.dao.IDao;
import org.example.metier.IMetier;
import org.example.metier.MetierImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Config.class);
        IMetier metier = context.getBean(IMetier.class);
        System.out.println("Résultat => " + metier.calcul());
    }
}