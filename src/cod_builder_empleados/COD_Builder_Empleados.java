/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cod_builder_empleados;

/**
 *
 * @author Lara Vazquez Dorna
 */
public class COD_Builder_Empleados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //instanciar  dos empleados con el constructor largo pero que falten parametros

        Empleado em1 = new Empleado("Pepe", "Perez", "", "531a", "", 0, 0, 0, 4, 0, 0, 0, 9);
        Empleado em2 = new Empleado("Juan", "Ramirez", "", "9874e", "", 0, 0, 0, 0, 0, 5, 0, 0);
        /*
        Instancio un builder con los parametros obligatorios, y luego le añado 
        los parametros que quiera con los set y una vez añadidos los atributos
        deseados llamo a crearEmpleado para crear un empleado
         */
        /*
        Defino un objeto empleado pero lo construyo con el contructor y los set de 
        builder y luego llamo al metodo crear empleado que me devuelve un 
        objeto del tipo empleado
        */
        Empleado jefeTaller= new EmpleadoBuilder("Jose","Ramirez", "5647e").
                                    setApellido2("Rodriguez").crearEmpleado();
    }

}
