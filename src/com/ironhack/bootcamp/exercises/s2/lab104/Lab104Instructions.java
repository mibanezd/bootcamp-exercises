package com.ironhack.bootcamp.exercises.s2.lab104;

/**
 *Instrucciones
 *
 * Crea un nuevo repositorio en GitHub llamado Enterprise-Java-Development-1.04
 * Añade a tu instructor y a los calificadores de la clase a tu repositorio y asegúrate de que tu repositorio es privado. Los repositorios públicos recibirán un cero en la tarea.
 * Si no está seguro de quiénes son los calificadores de su clase, pregúntele a su instructor o consulte la presentación del día 1.
 * Sube a tu repositorio el código de todas las indicaciones siguientes.
 * Envíe un enlace URL a su repositorio a continuación.
 *
 *
 *
 * Especificaciones
 *
 * Escribe un método en Java para obtener la diferencia entre el mayor y el menor valor de un array de enteros. La longitud del array debe ser igual o superior a 1.
 *
 * Escribir un método en Java que encuentre el menor y el segundo menor elemento de un array dado y lo imprima en la consola.
 *
 * Escribe un método en Java que resuelva esta expresión matemática donde x e y son dos variables preestablecidas en tu código.
 */
public class Lab104Instructions {

    public static void main(String[] args) {

    }

    /**
     * Gets an array as input argument.
     * Locates the biggest element
     * Locates the smallest element
     * returns the difference
     * @param array input array
     * @return Biggest element - Smallest element
     */
    public int getDifferenceBetweenBiggestAndLowestItems(int[] array)  {
        int i;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for ( i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }

        return max - min;
    }
    /**
     * Gets an array as input argument.
     * We need 2 candidates to the smallest items
     * iterate the array
     * if we find a candidate, compare with the current candidates and replace in case positive.
     * prints the final candidates.
     *
     * clues:
     * Integer.MAX_VALUE --> returns the biggest possible int value.
     */
    public void findSmallestAndNextSmallestItem(int[] array) {
        int i;
        int smallestItem = Integer.MAX_VALUE;
        int secondSmallestItem = Integer.MAX_VALUE;

        for (i = 0; i < array.length; i++) {
            if (array[i] < smallestItem) {
                smallestItem = array[i];
            }
        }

        for (i = 0; i < array.length; i++) {
            if (array[i] < secondSmallestItem && array[i] > smallestItem) {
                secondSmallestItem = array[i];
            }
        }

        System.out.println(smallestItem + " and " + secondSmallestItem);

    }


    /**
     * We need to solve the next ecuation:
     * x**2 + (4*y/5 -x)**2
     *
     * clues: Math has a lot of methods that can be used to do some calculations like n power 2
     */
    public void calculateEquation(int x, int y) {

        double solution = Math.pow(x, 2) + Math.pow((4d * y / 5d - x), 2);
        System.out.println(solution);

    }

}
