package org.example;

import java.math.BigDecimal;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        String cadena = "es una cadena";

        int cadenaLen = cadena.length();

        System.out.println("la longitud de mi cadena es: "+cadenaLen);

        // propidades

        String cadenaMayus = cadena.toUpperCase();
        System.out.println("la cadena es: " + cadenaMayus);
        String cadenasMinus = cadena.toLowerCase();
        System.out.println("la cadena es: " + cadenasMinus);

        // determinar si la cadena inicia o termina con cierta palabra

        boolean resultado = cadena.startsWith("es") && cadena.endsWith("cadena");
        if(resultado){
            System.out.println("empieza y termina por lo que estoy buscando");
        }else{
            System.out.println("no empieza ni termina por lo que estoy buscando");
        }

        // caracter en la posicion

        char letra = cadena.charAt(1);
        System.out.println("caracter 1 es: "+letra);

        for (int i = 0; i < cadena.length(); i++) {

            System.out.println(cadena.charAt(i));
            
        }

        ////////////////////////////////

        // Arrays
        int array[]={1, 2, 3, 4, 5};
        System.out.println("array: "+array);

        for (int i = 0; i < array.length ; i++) {
            System.out.println(array[i]);
        }

        for (int j : array) {
            System.out.println(j);
        }

        // Arrays String
        String nombres [] = {"abel","Angelica","Edgar","Marta"};

        for (String n : nombres) {
            System.out.println(n);
        }

        for (int i = 0; i < nombres.length ; i++) {
            System.out.println(nombres[i]);
        }
        
        // array bidimensional

        int arrayBidi [][] = new int [2][4];

        arrayBidi [0][0] = 1;
        arrayBidi [0][1] = 2;
        arrayBidi [0][2] = 3;
        arrayBidi [0][3] = 4;

        arrayBidi [1][0] = 10;
        arrayBidi [1][1] = 20;
        arrayBidi [1][2] = 30;
        arrayBidi [1][3] = 40;


        for (int i = 0; i < arrayBidi.length; i++) {
            System.out.println(" superior valor de: " + i);
            for (int j = 0; j < arrayBidi[i].length ; j++) {
                System.out.println("valor de: " + j);
            }
        }

        ////////////////////////////////////////////////////////////////

        // vectores son muy costosos en capacidad computacional
        Vector<Integer> vectores = new Vector<Integer>();
        vectores.add(1);
        vectores.add(2);
        vectores.add(3);
        vectores.add(4);
        vectores.add(5);
        vectores.add(6);
        vectores.add(7);
        vectores.add(8);
        vectores.add(9);
        vectores.add(10);
        vectores.add(11);
        vectores.add(12);
        System.out.println("datos del vector: " + vectores);

        vectores.remove(2);
        System.out.println("datos del vector: " + vectores);

        System.out.println("vector tamaño: "+vectores.size()+ " y capacidad: " + vectores.capacity());

        for (int i:vectores) {
            System.out.println("valor actual:" + i);
        }

        for (int i = 0; i < vectores.size() ; i++) {
            if(i % 2 == 0) {
                vectores.remove(i);
                continue;
                // cuando se elimine un valor del array no se debe acceder a
                // esa pocision en memoria
            }
            System.out.println("valor es: " + vectores.get(i));

        }

        ////////////////////////////////////////////////////////////////////////
        //arrayList
        // utiliza un array es mas rapida para almecenar y buscar datos
        // deriva de la clase List por lo tanto hereda los metodos de la
        //clase List

        ArrayList<String> lista = new ArrayList<String>();
        lista.add("hola");
        lista.add("como");
        lista.add("estas");
        lista.add("mundo?");
        lista.remove("como");
        System.out.println("contenido: " + lista);

        String array2[] = new String[lista.size()];


        ////////////////////////////////
        //Linkelist
        // utiliza lista doblemente enlazada
        // es mas rapida para modificar
        // implementa la interface List y la interface deque que se usa para
        // utilizar pilas y colas a la vez

        LinkedList <String> lista2 = new LinkedList<String>();

        ////////////////////////////////////////////////////////////////////////
        //Bigdecimal
        BigDecimal valorA = new BigDecimal(0.1f);
        BigDecimal valorB = new BigDecimal(4);
        valorA.multiply(valorB);
        valorA.add(valorB);
        System.out.println(valorA.toString());

        ////////////////////////////////
        // mapa:es una especie de diccionerio
        // no se puede tener una clave duplicada
        // implementa una tabla hash que es muy rapida en busqueda e inserciones
        // treemap
        HashMap<String,Integer> mapa = new HashMap<String,Integer>();
        mapa.put("clave1",10);
        mapa.put("clave2",20);
        mapa.put("clave3",30);
        mapa.put("clave4",40);

        System.out.println(mapa);
        System.out.println(mapa.get("clave1"));
        mapa.replace("clave2",90);
        System.out.println(mapa);

        for (Map.Entry e:mapa.entrySet()){
            System.out.println("elemento clave es: " + e.getKey() + " y el valor es: " + e.getValue());
        }


    }
}