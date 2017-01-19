package com.jordan.iterator;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        /*
        GenericList<ElementMusic> genericList = new GenericList<>();
        genericList.addToFront(new ElementMusic("titre 1", "Beethoven"));
        genericList.addToFront(new ElementMusic("titre 2", "Mozart"));
        genericList.addToFront(new ElementMusic("titre 3", "Mozart"));
        genericList.addToFront(new ElementMusic("titre 4", "Unknow"));

        GenericList.Iterator iterator = genericList.iterator();

        while(iterator.hasNext()){
            ElementMusic el = (ElementMusic) iterator.next();
            System.out.println(el.toString());
        }
        */




        GenericList2<ElementMusic> genericList2 = new GenericList2<>();
        genericList2.add(new ElementMusic("titre 1", "Beethoven"));
        genericList2.add(new ElementMusic("titre 2", "Mozart"));
        genericList2.add(new ElementMusic("titre 3", "Mozart"));
        genericList2.add(new ElementMusic("titre 4", "Unknow"));

        GenericList2.Iterator iterator2 = genericList2.getIterator();

        while(iterator2.hasNext()){
            ElementMusic el = (ElementMusic) iterator2.next();
            System.out.println(el.toString());
        }
    }
}


