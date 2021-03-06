package com.example.demo.factories;

import com.example.demo.entities.Koch;
import org.springframework.stereotype.Component;

@Component
public class KochFactory {

    public KochFactory(){}

    public Koch createMitarbeiter(String mitarbeiternamen, String mitarbeitervornamen){

        Koch m1 = new Koch(mitarbeiternamen, mitarbeitervornamen);

        return m1;
    }
}
