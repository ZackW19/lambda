package javaex2;

import java.util.LinkedList;
import java.util.List;


public class MyArray {

    public static List<Integer> map(List<Integer> list, SimpleOperation lambda ) {
        List<Integer> result = new LinkedList<>();

        //ta metoda ma zwrocic liste z wartosciami
        //obliczonymi na podstawie listy przekazanej
        //jako argument oraz pewnego wzoru (wyrazenia lambda)
        //czyli dla kazdego elementu x przekazanej listy
        //trzeba do wynikowej listy dodac wartosc wyrazenia
        //lambda od x
        for(Integer el : list) {
            result.add( lambda.h(el) );
        }

        return result;
    }
}