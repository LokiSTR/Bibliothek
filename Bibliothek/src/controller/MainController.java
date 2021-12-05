package controller;

import model.*;
import view.*;

import java.util.ArrayList;

public class MainController {
    
    ArrayList<Buecher> buecher = new ArrayList<Buecher>();
    Output _o = new Output();    

    public MainController(){
        buecher.add(new Fantasie(634, 76834, 2, "Demonen und Feen"));
        buecher.add(new Fantasie(689, 78457, 4, "Demonen, Vexe, Hydren, Drachen"));
        buecher.add(new Fantasie(857, 12564, 1, "Drachen"));
        buecher.add(new Kinder(24, 62747, 0 , true));
        buecher.add(new Kinder(68, 78348, 12, false));
        
        //Dienstleistungsmethode 1
        for(Buecher buch : buecher){
            _o.printData("Dieses Buch hat " + buch.getSeitenanzahl() + ". Es hat die Nummer " + buch.getBuchnummer() + ", das Besondere ist: " + buch.genreInfo());
        }

        System.out.println(" ");

        //Dienstleistungsmethode 2
        int maxSeiten = 0;
        for(Buecher b : buecher){
            if(b.getSeitenanzahl() > maxSeiten){
                maxSeiten = b.getSeitenanzahl();
            }
        }
        _o.printData("Das längste Buch hat " + maxSeiten + " Seiten!");

        System.out.println(" ");

        //Dienstleistungsmethode 3
        int maxMonster = 0;
        for(Buecher b : buecher){
            if(b.getMonsteranzahl() > maxMonster){
                maxMonster = b.getSeitenanzahl();
            }
        }
        _o.printData("Das Buch mit den meisten Monstern hat " + maxMonster + " Monsterarten!");

    }
}
