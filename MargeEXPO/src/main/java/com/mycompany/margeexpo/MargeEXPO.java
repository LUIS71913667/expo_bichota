/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.margeexpo;

/**
 *
 * @author Alumno
 */
public class MargeEXPO {
    static int array[]= {10,6,2,3,11,8,7,10,4,1};
    public static void main(String[] args) {   
        //ingresamos los metodos a usar
        printlnArray("Orginal array = ");
        mergeSort(0, array.length-1);//longuitud de datos -1
        printlnArray("Actualizacion array = ");
    }
    private static void mergeSort(int low, int high) {
        if(low<high){//baja<alta
            int middle = (low+high)/2;
            mergeSort(low, middle);
            mergeSort(middle+1, high);
            merge(low, middle, high);
        }// if i==j, la sublista tiene 1 elemento, entonces se considera ordenada
    }
    private static void merge(int low, int middle, int high) {      
        int tempArray[] = new int[high-low+1];
        //Compara miembros en cada sublista en la extrema izquierda;
        //el elemento más pequeño se "elimina" y almacena en una lista temporal que será una lista ordenada después del ciclo
        for(int i=low, j=middle+1, k=0; (i <= middle) || (j <= high); k++){
            if(i > middle){//media
                tempArray[k] = array[j++];
            }
            else if (j > high){ 
                tempArray[k] = array[i++];
            }
            else if(array[i] <= array[j]){
                tempArray[k] = array[i++];
            }else{
                tempArray[k] = array[j++];
            }
        }
        //aplicar cambios
        int index=low;
        //repetir datos
        for (Integer value : tempArray) {
            array[index++] = value;
        }
    }
    //Método auxiliar para imprimir la matriz.
    private static void printlnArray(String message) {
        //almacenar cadenas de caracteres
        StringBuffer arrayStr =  new StringBuffer(message+"[");
        for (int i = 0; i < array.length; i++) {
            arrayStr.append(array[i]);
            if(i < array.length-1){ arrayStr.append(", "); }
        }
        arrayStr.append("]");//añadir o insertar contenido al final del elemento
        System.out.println(arrayStr);
    }
}
