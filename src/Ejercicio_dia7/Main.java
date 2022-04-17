package Ejercicio_dia7;
import java.util.ArrayList;
import java.util.List;

public class Main{

    public static void main(String[] args) {

        //creamos las diferentes listas, las 1 y 2 numericas, y las 3 y 4 empleados
        List<Integer> lista1, lista2;
        List<Empleado> lista3, lista4;

        lista1=new ArrayList<Integer>();
        lista2=new ArrayList<Integer>();

        lista3=new ArrayList<Empleado>();
        lista4=new ArrayList<Empleado>();

        //Llenamos la lista1 con numeros impares
        lista1.add(1);
        lista1.add(3);
        lista1.add(9);
        lista1.add(7);

        // Llenamos la lista2 con numeros pares
        lista2.add(2);
        lista2.add(10);
        lista2.add(6);
        lista2.add(8);

        //llenamos la lista3 con diferentes empleados
        lista3.add(new Empleado("Manuel", "Martín", 54) );
        lista3.add(new Empleado("Carla", "Castilla", 37) );
        lista3.add(new Empleado("Lola", "Núñez", 25) );
        lista3.add(new Empleado("Paula", "Castillo", 42) );

        //llenamos la lista4 con diferentes empleados
        lista4.add(new Empleado("Juan", "Pérez", 20) );
        lista4.add(new Empleado("Fulgencio", "Rey", 60) );
        lista4.add(new Empleado("Marilú", "López", 39) );
        lista4.add(new Empleado("Iker", "Santos", 45) );


        //lista1
        System.out.println("La lista 1 es: ");
        lista1.sort(null); //ordenamos la lista1
        for(int i=0; i<lista1.size(); i++) {
            System.out.print(lista1.get(i)+" ");
        }
        System.out.println();

        //lista2
        System.out.println("La lista 2 es: ");
        lista2.sort(null); //ordenamos la lista2
        for(int i=0; i<lista2.size(); i++) {
            System.out.print(lista2.get(i)+" ");
        }
        System.out.println();
        System.out.println();

        //lista3
        System.out.println("La lista 3 es: ");
        lista3.sort(null); //ordenamos la lista3
        lista3.forEach(System.out::println); //imprimimos la lista3 usando un forEach, dado que cada ArrayList tiene
                                            // un método forEach() que procesa cada elemento individual de la lista.

        //lista4
        System.out.println("La lista 4 es: ");
        lista4.sort(null); //ordenamos la lista4
        lista4.forEach(System.out::println); //imprimimos la lista4 usando un forEach, dado que cada ArrayList tiene
                                            // un método forEach() que procesa cada elemento individual de la lista.

        //imprimimos las listas 1 y 2 unidas
        System.out.println("El resultado de la union de las listas 1 y 2 es: ");
        System.out.println(fusion(lista1,lista2));

        //imprimimos las listas 3 y 4 unidas
        System.out.println("El resultado de la union de las listas 3 y 4 es: ");
        System.out.println(fusionEmpleados(lista3, lista4));

    }

    /**
     * Metodo que usamos para unir las listas 1 y 2 en una sola.
     * Precondición: Las listas deben estar ya creadas.
     * Postcondición: En la nueva lista deben aparecer todos los elementos de las otras listas
     * @param lista1
     * @param lista2
     * @return listas 1 y 2 unidas
     */
    public static List<Integer> fusion(List<Integer> lista1, List<Integer> lista2) {

        //creamos la nueva lista
       List<Integer> fusion = new ArrayList<>();

       int indice1=0, indice2=0;

        //Mientras el indice de cada lista dea menor que el tamaño de las mismas:
            //Si el indice de la lista 1 es menor que el de la lista 2 se añadira a la nueva lista el indice de la lista 1.
            //En el caso contrario se añadirá el indice de la lista 2 a la nueva lista. Así ordenaremos la nueva lista de
            //menor a mayor.
       while(indice1< lista1.size() && indice2< lista2.size()){

           if (lista1.get(indice1)<lista2.get(indice2)){
               fusion.add(lista1.get(indice1));
               indice1++;
           }else{
               fusion.add(lista2.get(indice2));
               indice2++;
           }
       }

       if (indice1< lista1.size()){
           while (indice1<lista1.size()){
               fusion.add(lista1.get(indice1));
               indice1++;
           }
       }
       if (indice2<lista2.size()){
           while (indice2< lista2.size()){
               fusion.add(lista2.get(indice2));
               indice2++;
           }
       }

        return fusion;
    }

    //Mientras el indice de cada lista dea menor que el tamaño de las mismas:
        //Si el indice de la lista 3 es menor que el de la lista 4 se añadira a la nueva lista el indice de la lista 3.
        //En el caso contrario se añadirá el indice de la lista 4 a la nueva lista. Así ordenaremos la nueva lista de
        //menor a mayor.
    public static List<Empleado> fusionEmpleados(List<Empleado> lista3, List<Empleado> lista4) {

        List<Empleado> fusionEmpleados = new ArrayList<>();
        int indice3=0, indice4=0;

        while(indice3< lista3.size() && indice4< lista4.size()){

            if (lista3.get(indice3).compareTo(lista4.get(indice4))<0){
                fusionEmpleados.add(lista3.get(indice3));
                indice3++;
            }else{
                fusionEmpleados.add(lista4.get(indice4));
                indice4++;
            }
        }

        if (indice3< lista3.size()){
            while (indice3<lista3.size()){
                fusionEmpleados.add(lista3.get(indice3));
                indice3++;
            }
        }
        if (indice4<lista4.size()){
            while (indice4< lista4.size()){
                fusionEmpleados.add(lista4.get(indice4));
                indice4++;
            }
        }

        return fusionEmpleados;
    }
}
