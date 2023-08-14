package listdemo;

import java.util.*;

public class SetDemo {

    public static void main(String[] args) {

        Set<Integer> integers=new HashSet<>();

       // inserting values in set
        // set does not allow/print duplicate values and does not follow order.
        integers.add(80);
        integers.add(100);
        integers.add(50);
        integers.add(30);
        integers.add(100);

        //delet or remove item
        integers.remove(50);

        System.out.println("The set is: ");
        for(Integer x: integers){
            System.out.println(x);
        }

        Set<Integer> integers1=new HashSet<>();
        integers1.add(20);
        integers1.add(10);
        integers1.add(20);
        integers1.add(40);

        integers.addAll(integers1);

        System.out.println("New set: ");
        for(Integer y: integers){
            System.out.println(y);
        }

        System.out.println("Total Number of items is: "+integers.size());


        List<Object> objects=new ArrayList<>();
        objects.addAll(Arrays.asList(3,4,5,6));
        objects.addAll(Arrays.asList("Fish","Cat","Dog"));
        objects.addAll(integers);

        for(Object x: objects){
            System.out.println(x);
        }

        objects.removeAll(integers);

        System.out.println("========= final========");
        for(Object x: objects){
            System.out.println(x);
        }




    }
}
