package com.epam.Andrei_Korotkov.java.lesson4.task2;

/**
 * created by Andrei_Korotkov 8/9/2019
 */

import java.util.*;

public class million {

    public List<Integer> million;

    public void setMillion(List<Integer> million) {
        this.million = million;
    }

    public void addMillion() {
        List<Integer> tmp = new ArrayList<Integer>();
        for (int i = 0; i < 1000000; i++) {  // если оставить миллион, будет выполняться полторачаса+, лучше уменьшить
            tmp.add(i);
            Collections.shuffle(tmp);
        }
        setMillion(tmp);
    }

    public void assertRandom() {
        for (int i = 0; i < 10; i++) {
            System.out.print(million.get(i) + ", ");
        }
    }

    public void assertUnique() {
        boolean unique;
        TreeSet<Integer> tmp = new TreeSet<>();
        tmp.addAll(million);
        if (tmp.size() == million.size()) {
            unique = true;
        } else {
            unique = false;
        }
        System.out.println();
        System.out.println(unique);
    }

    public void minElement() {
        System.out.println(Collections.min(million));
    }

    public void removeOdd() {
        million.removeIf(i -> i % 2 != 0);
    }

    public void nextToMaxElement() {
        Collections.sort(million, new Comparator<Integer>() {
            public int compare(Integer i1, Integer i2) {
                return i1.toString().compareTo(i2.toString());
            }
        });
        System.out.println(million.get(million.size() - 2));
    }

    public static void main(String[] args) {

        million myMillion = new million();

        myMillion.addMillion();

        System.out.println(myMillion.million.size());

        myMillion.assertRandom();

        myMillion.assertUnique();

        myMillion.minElement();

        myMillion.removeOdd();

        System.out.println(myMillion.million.size());

        myMillion.nextToMaxElement();
    }
}
