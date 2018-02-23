package boletin19;

import boletin19.libreria.Aplicacion;

/**Realiza un programa para levar o mantemento dunha librería. 
 * Para iso :
 * Realiza un diagrama de clases que reflicta as relación entre as clases  
 * e logo implementa o programa tendo en conta :
 * Cada libro de levar : título , autor , ISBN (String ) , prezo , e numero de unidades.
 * O programa debe :
 * engadir libros
 * vender ( borrar ) libros
 * amosar  os libros que temos  ( Os libros deben estar ordenados polo campo titulo )
 * dar de baixa os libros con numero de unidades =0
 * consultar un libro determinado
 * Nos métodos vender, amosar, baixas e consultar debes comprobar que o array 
 * recibido non é null. No caso contrario lanza una excepción.
 * Para a clase aplicación utiliza un paquete e para as demais outro paquete.
 * Na aplicación do programa utiliza un menú con todas as opción .**/

public class Boletin19 {

    public static void main(String[] args) {
        Aplicacion obx1 = new Aplicacion();
        
        obx1.menu();
    }
    
}
