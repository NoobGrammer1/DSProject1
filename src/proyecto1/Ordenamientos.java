/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

/**
 * id de la película, nombre, 
año, calificación, género, estado
 * @author AdminBeta
 */
public class Ordenamientos {
     
    public static void insertionSortingFromInitialArray(String[] arr, ListaPelicula lp ) {
        /*int length = list.length;
        for (int i = 1; i < length; i++) {
            int j = i;
       //     while (j > 0 && list[j] < list[j - 1]) {
                interchange(list, j, j - 1);
                j--;
            }
            printList(list);
        }*/
    }

    public static void interchange(int list[], int i, int j) {
        int temp = list[i];
        list[i] = list[j];
        list[j] = temp;

    }

    public static void printList(int[] list) {
        for (int integer : list) {
            System.out.print(integer + " ");
        }
        System.out.println();
    }
}

