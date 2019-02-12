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

        //Empleado em1 = new BuilderE().setNombre("Pepe").setApellido1("Perez").setDni("531a").setAltura(4).setFormacion(9).createEmpleado();
        //Empleado em2 = new BuilderE().setNombre("Juan").setApellido1("Ramirez").setDni("9874e").setDiametro(5).setFormacion(0).createEmpleado();
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
       // Empleado jefeTaller= new EmpleadoBuilder("Jose","Ramirez", "5647e").
        //                            setApellido2("Rodriguez").crearEmpleado();
    }

}
