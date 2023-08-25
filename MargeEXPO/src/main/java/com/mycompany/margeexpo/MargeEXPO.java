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
        printlnArray("Original array = ");
        mergeSort(0, array.length-1);
        printlnArray("Sorted array   = ");
    }
    
}
