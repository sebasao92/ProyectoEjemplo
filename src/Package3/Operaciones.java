package Package3;

import Package2.Persona;

public class Operaciones <T extends Integer>{

    private static Integer contador = 0;

    private static Double anyDouble;

    private static String anyString;

    public static <E extends Persona> void imprimitArreglo(E[] array){

        for(E element : array) {
            System.out.println(element);
        }
    }

    public static void count(){
        contador++;
    }

    public static Integer getContador(){
        return contador;
    }
}
