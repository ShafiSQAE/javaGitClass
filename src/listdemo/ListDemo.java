package listdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {

        List<String> strings=new ArrayList<>();

        //adding elements or list items to the list
        strings.add("A"); //0
        strings.add("B");
        strings.add("C");
        strings.add("D");
        strings.add("P"); //4
        strings.add("F");

        System.out.println("List items are: ");

        for(String x: strings){         //for each loop: String is Datatype ,x is variable, strings is List name
            System.out.println(x);
        }
        //Changing an item by using the add method and index value
        //By doing this we can add new elements in particular indexes

        strings.add(0, "X");
        strings.add(4,"E");

        System.out.println("Updated list is: ");

        for(String y: strings){
            System.out.println(y);
        }

        //To get or search any item from list we use listname.get() method using index of that item
        System.out.println("The searched item is: "+strings.get(2));

        //to delete or remove any item from list

        strings.remove(0);
        strings.remove("P");
        strings.remove("F");
        System.out.println("======================");
        for(String x: strings){
            System.out.println(x);
        }


        List<String> vehicles= Arrays.asList("Bus","Car","Truck","Boat");
        strings.addAll(vehicles);

        System.out.println("===========================");

        for(String x: strings){
            System.out.println(x);
        }

        System.out.println("The numbers of items in the list is: "+strings.size());

        strings.removeAll(vehicles);

        System.out.println("===================== final ========");
        for(String x: strings){
            System.out.println(x);
        }

    }
}
