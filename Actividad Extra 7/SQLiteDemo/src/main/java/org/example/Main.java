package org.example;

import org.example.modelo.Libro;
import org.example.persistencia.DemoLibroDB;
import org.example.persistencia.LibroDAO;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        LibroDAO ldao = new LibroDAO();


    /*    Libro libro = new Libro(1,"El perfume","Patrick Suskind");
        try{
            if(ldao.update(libro)){
                System.out.println("Se modifico correctamente");
            }else {
                System.out.println("No se pudo insertar");
            }
        }catch (SQLException sqle){
            System.out.println("Error al insertar");
        }*/
       /*try {
           if (ldao.delete("11")){
               System.out.println("Se elimino correctamente");
           } else {
               System.out.println("No se pudo eliminar");
           }
       }catch (SQLException sqle){
           System.out.println("Error al eliminar");
           System.out.println(sqle.getMessage());
       }*/
       try {
           Libro res =(Libro) ldao.buscarPorId("1");
           System.out.println(res);
           System.out.println("--------------");
           for (Object lib: ldao.obtenerTodo()) {
               System.out.println((Libro)lib);
           }
         }catch (SQLException sqle){
        System.out.println("Error al eliminar");
        System.out.println(sqle.getMessage());

    }
    }
}