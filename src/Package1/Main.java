package Package1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import Package2.Persona;

public class Main {

    public static void main(String... args){

        List<Persona> personaList = new LinkedList<>();
        List<Double> doublesList = new ArrayList<>();
        /*doublesList.add(2.4); //agregar -> 0
        doublesList.add(2.6); //agregar -> 1
        doublesList.remove(0); //eliminar -> 0
        System.out.println(doublesList.get(3)); //lectura*/
        /*doublesList.add(2.1);
        doublesList.add(2.1);
        System.out.println(doublesList);

        Set<Persona> personaSet = new LinkedHashSet<>();
        Set<Integer> integerSet = new TreeSet<>();
        integerSet.add(5);
        integerSet.add(2);
        integerSet.add(0);
        integerSet.add(10);
        System.out.println(integerSet);*/

        Map<String, Float> map = new HashMap<>();
        Map<String, Float> map2 = new TreeMap<>();
        Map<String, Float> map3 = new LinkedHashMap<>();

        Map<String, List<Persona>> grupos = new TreeMap();
        grupos.get("SeminarioIngCivil");


        map.put("Wilson", 4.0f); //agregarlo
        map.put("Wilson", 4.0f);
        map.put("Wendy", 4.0f);
        map.remove("Wilson"); // eliminar
        map.get("Wendy"); // lectura
        //map.put("Wilson", 5.0f); //actualizar

        System.out.println(map);
    }
}
