package com.jordan.iterator;

import java.util.LinkedList;

/**
 * Created by Mariavelle Jordan on 19-01-17.
 */
public class GenericList2<E> {

    LinkedList<E> list = new LinkedList<>();

    public void add(E e){
        list.add(e);
    }

    public void delete(E e){

        for(int i = list.size() ; i>=0 ; i++){

            if(list.get(i).equals(e)){
                list.remove(i);
                return;
            }
        }
    }

    public void clear(){
        list.clear();
    }

    public Iterator getIterator(){
        return new Iterator();
    }


    public class Iterator implements java.util.Iterator{

        int current = 0;

        public Iterator() {
            this.current = list.size()-1;
        }

        @Override
        public boolean hasNext() {
            return current >= 0;
        }

        @Override
        public E next() {

            E ele = null;
            if(current >= 0) {
                ele = list.get(current);
                current--;
            }
            return ele;
        }
    }
}
