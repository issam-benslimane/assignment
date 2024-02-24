package org.example.presentation.statique;

import org.example.dao.DaoImpl;
import org.example.metier.MetierImpl;

public class Main {
    public static void main(String[] args) {
        DaoImpl dao=new DaoImpl();
        MetierImpl metier=new MetierImpl();
        metier.setDao(dao);
        System.out.println(metier.calcul());
    }
}