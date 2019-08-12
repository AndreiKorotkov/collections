package com.epam.Andrei_Korotkov.java.lesson4.task2;

/**
 * created by Andrei_Korotkov 8/9/2019
 */

import java.util.*;

public class million {

    public List<Integer> list;

    public void setList(List<Integer> list) {
        this.list = list;
    }

    public void addMillion() {
        List<Integer> tmp = new ArrayList<Integer>();
        for (int i = 0; i < 1000000; i++) {  // если оставить миллион, будет выполняться полторачаса+, лучше уменьшить
            tmp.add(i);
            Collections.shuffle(tmp);
        }
        setList(tmp);
    }

    public void assertRandom() {
        for (int i = 0; i < 10; i++) {
            System.out.print(list.get(i) + ", ");
        }
    }

    public void assertUnique() {
        boolean Unique;
        HashSet<Integer> tmp = new HashSet<>();
        tmp.addAll(list);
        if (tmp.size() == list.size()) {
            Unique = true;
        } else {
            Unique = false;
        }
        System.out.println();
        System.out.println(Unique);
    }

    public void minElement() {
        System.out.println("Минимальный элемент в коллекции " + Collections.min(list));
    }

    public void removeOdd() {
        list.removeIf(i -> i % 2 != 0);
    }

    public void nextToMaxElement() {
        Collections.sort(list);
        System.out.println("Предпоследний по величине элемент " + list.get(list.size() - 2));
    }

    public static void main(String[] args) {

        million myMillion = new million();

        myMillion.addMillion();

        System.out.println(myMillion.list.size());

        myMillion.assertRandom();

        myMillion.assertUnique();

        myMillion.minElement();

        myMillion.removeOdd();

        System.out.println(myMillion.list.size() + " размер коллекции после удаления нечетных элементов");

        myMillion.nextToMaxElement();


    }
}
