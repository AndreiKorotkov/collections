import java.util.*;

/**
 * created by Andrei_Korotkov 8/9/2019
 */
public class million {
    public static void main(String[] args) {
        List <Integer> myArray = new ArrayList<>();
        for (int i = 1000; i < 1001000; i++) {
            myArray.add (i);
        }
        System.out.println(myArray.get(99));

        Collections.shuffle(myArray);

        System.out.println(myArray.get(99));

        TreeSet <Integer> mySet = new TreeSet<Integer>();

        for (int i = 0; i < myArray.size(); i++) {
            mySet.add(myArray.get(i));
        }
        System.out.println(mySet.size());

        Collections.sort(myArray, new Comparator<Integer>() {
            public int compare(Integer i1, Integer i2) {
                return i1.toString().compareTo(i2.toString());
            }
        });

        System.out.println(myArray.get(0));
        System.out.println(myArray.get(myArray.size()-2));


          }
          }


