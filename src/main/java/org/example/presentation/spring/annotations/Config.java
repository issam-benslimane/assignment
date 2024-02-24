package org.example.presentation.spring.annotations;

import org.example.dao.DaoImpl;
import org.example.dao.IDao;
import org.example.metier.IMetier;
import org.example.metier.MetierImpl;
import org.springframework.context.annotation.Bean;

public class Config {
    @Bean
    public IDao dao(){
        return new DaoImpl();
    }
    @Bean
    public IMetier metier(){
        MetierImpl m = new MetierImpl();
        m.setDao(dao());
        return m;
    }
}
