package boletin19.libreria;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class Aplicacion {
    
    ArrayList <Libro> listaLibros = new ArrayList();
    
    public void menu(){
        System.out.println("******** LIBRERIA *********\n"
                            + "1)Añadir un libro\n"
                            + "2)Vender libro\n"
                            + "3)Amosar libros\n"
                            + "4)Dar de baixa un libro\n"
                            + "5)Consultar libro\n"
                            + "0)Salir\n");
        
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("Intruduce una opcion"));
        
        while(opcion!=0){
            switch(opcion){
                case 1: this.engadirLibro();
                        break;
                case 2: venderLibro();
                        break;
                case 3: this.mostrarLibros();
                        break;
                case 4: darBaixaLibro();
                        break;
                case 5: encontrarLibro();
                        break;
                case 0: break;
                default: System.out.println("Opcion no valida");
            }
            
            System.out.println("******** LIBRERIA *********\n"
                + "1)Añadir un libro\n"
                + "2)Vender libro\n"
                + "3)Amosar libros\n"
                + "4)Dar de baixa un libro\n"
                + "5)Consultar libro\n"
                + "0)Salir\n");
        
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Intruduce una opcion"));
        }
    }
    
    public void engadirLibro(){
        String libro = JOptionPane.showInputDialog("Introduce el nombre del libro");
        String autor = JOptionPane.showInputDialog("Introduce el nombre del autor");
        String ISBN = JOptionPane.showInputDialog("Introduce el ISBN del libro");
        float precio = Float.parseFloat(JOptionPane.showInputDialog("Introduce el precio del libro"));
        int numUnidades = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de ejemplares"));
        Libro exemplar = new Libro(libro,autor,ISBN,precio,numUnidades);
        listaLibros.add(exemplar);
    }
    
    public void mostrarLibros(){
        Collections.sort(listaLibros);
        Iterator it = listaLibros.iterator();
        while(it.hasNext()){
            System.out.print(it.next());
        }
    }
    
    public void venderLibro(){
        String isbn = JOptionPane.showInputDialog("Introduce el ISBN del libro que se ha vendido");
        boolean encontrado=false; //O libro non esta na lista
        
        for (int i=0;i<listaLibros.size();i++){
            if (listaLibros.get(i).getISBN().equalsIgnoreCase(isbn)){
                int numUnidades = listaLibros.get(i).getNumUnidades();
                if (numUnidades>0){
                    listaLibros.get(i).setNumUnidades(numUnidades-1);
                }
                else{
                    System.out.println("No quedan ejemplares de este libro");
                }
                encontrado=true;
            }
        }
        if (encontrado==false){
            System.out.println("O IBAN introducido non corresponde a ningun IBAN dos exemplares");
        }
    }
    
    public void darBaixaLibro(){
        boolean encontrado=false;
        for (int i=0;i<listaLibros.size();i++){
            if (listaLibros.get(i).getNumUnidades()==0){
                listaLibros.remove(i);
                encontrado=true;
            }
        }
        
        if (encontrado==false){
            System.out.println("No hay ejemplares sin unidades");
        }
    }
    
    public void encontrarLibro(){
        String titulo = JOptionPane.showInputDialog("Introduce el titulo del libro");
        boolean encontrado=false; //O libro non esta na lista
        
        for (int i=0;i<listaLibros.size();i++){
            if (listaLibros.get(i).getTitulo().equalsIgnoreCase(titulo)){
                System.out.println(listaLibros.get(i).toString());
            }
        }
        if (encontrado==false){
            System.out.println("Non hay ningun libro con ese titulo");
        }
    }
}





