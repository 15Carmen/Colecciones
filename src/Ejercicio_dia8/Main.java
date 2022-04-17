package Ejercicio_dia8;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        //Actividad 2

        //creamos un set interger. Como queremos que sea ordenado de mayor a menor tenemos que hacerlo con un comparador.
        Set<Integer> setDecreciente = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });

        //añadimos a la lista 20 números aleatorios comprendidos entre 0 y 100
        for (int i=0; i<21;i++){
            setDecreciente.add((int)(Math.random()*100));
        }

        //imprimimos la lista por pantalla
        System.out.println("La lista de numeros en orden decreciente es: "+setDecreciente);
        System.out.println();


        //Actividad 3

        //Como los set no admiten duplicados, creamos un arrayList que si los permite
        ArrayList<Integer> duplicadosDecreciente = new ArrayList<>();

        //añadimos a la lista 20 números aleatorios comprendidos entre 0 y 10
        for (int i=0; i<20; i++){
            duplicadosDecreciente.add((int)(Math.random()*10));
        }

        //ordenamos la lista con la clase sort
        duplicadosDecreciente.sort(Collections.reverseOrder());
        //imprimimos la lista por pantalla
        System.out.println("La segunda lista de numeros en orden decreciente es: "+duplicadosDecreciente);

        //Actividad 4

        //creamos una lista que sea LinkedHashSet para asegurarnos que la lista tenga siempre el mismo orden
        Set<String> listaNombres = new LinkedHashSet<>();
        pedirNombres(listaNombres);
        System.out.println(listaNombres);

        //Actividad 5

        //creamos una lista que sea TreeSet para asegurarnos que la lista esté ordenada alfabéticamente
        Set<String> listaNombresOrdenados = new TreeSet<>();
        pedirNombres2(listaNombresOrdenados);
        System.out.println(listaNombresOrdenados);

    }

    /**
     * Método por el cual vamos a pedir por pantalla los nombres que se desee hasta que se escriba la palabra fin. Cuando eso suceda, todos los nombres
     * se almacenarán en una lista LinkedHashSet que almacenará los datos por orden de entrada.
     * @param listaNombres
     */
    private static void pedirNombres(Set<String> listaNombres) {

        Scanner sc = new Scanner(System.in);
        String respuesta = null;

        System.out.println("Introduzca los nombres que desee. Cuando no quiera introducir mas, introduzca 'fin'. ");
        do {
            respuesta = sc.next();
            listaNombres.add(respuesta);
        } while(!respuesta.equals("fin"));
        //para que en la lista no nos aparezca el fin, lo quitamos de esta con el método remove()
        listaNombres.remove("fin");
    }

    /**
     * Método por el cual vamos a pedir por pantalla los nombres que se desee hasta que se escriba la palabra fin. Cuando eso suceda, todos los nombres
     * se almacenarán en una lista TreeSet que almacenará los datos por orden alfabético.
     * @param listaNombresOrdenados
     */
    private static void pedirNombres2(Set<String> listaNombresOrdenados) {

        Scanner sc = new Scanner(System.in);
        String respuesta = null;

        System.out.println("De nuevo, introduzca los nombres que desee. Cuando no quiera introducir mas, introduzca 'fin'. " +
                "Los nombres se ordenaran alfabeticamente. ");
        do {
            respuesta = sc.next();
            listaNombresOrdenados.add(respuesta);
        } while(!respuesta.equals("fin"));
        //para que en la lista no nos aparezca el fin, lo quitamos de esta con el método remove()
        listaNombresOrdenados.remove("fin");

    }

}
