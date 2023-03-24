/*
package controller;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Random;

import model.Buecher;
import model.Fantasie;
import model.Kinder;
import model.Wissen;
import view.Output;

public class MainController {
    
    ArrayList<Buecher> buecher = new ArrayList<Buecher>();
    Output _o = new Output();    

    public MainController(){
        buecher.add(new Fantasie(634, 76834, 2, "Demonen und Feen"));
        buecher.add(new Fantasie(689, 78457, 4, "Demonen, Vexe, Hydren, Drachen"));
        buecher.add(new Fantasie(857, 12564, 1, "Drachen"));
        buecher.add(new Kinder(24, 62747, 0 , true));
        buecher.add(new Kinder(68, 78348, 12, false));
        buecher.add(new Wissen(783, 2378, "Universum", 1982));
        
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

        System.out.println(" ");

        someSort();
    }

    public static void someSort(){
        int[] numbers = new int[100000];
        Random rand = new Random();
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = rand.nextInt((10000 - 0) + 1) + 0;
        }



        Timestamp timestampStart = new Timestamp(System.currentTimeMillis());
        for (int i=0;i<numbers.length-1;i++){
            System.out.println("Durchlauf " + i + " von " + (numbers.length-1));
            for (int k=0;k<numbers.length-i-1;k++){
                if(numbers[k+1]<numbers[k]){
                    int temp = numbers[k];
                    numbers[k] = numbers[k+1];
                    numbers[k+1] = temp;
                }
            }
        }
        Timestamp timestampStop = new Timestamp(System.currentTimeMillis());


        long tEnde = timestampStop.getTime();
        long tStart = timestampStart.getTime();

        long tFinal = (tEnde - tStart)/1000;

        System.out.println("--------------------------------");

        System.out.println(tFinal);
        

    }

    private static void printArr(int[] arr){
        System.out.println("--------------------------------");
        for(int i = 0; i < arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}

*/