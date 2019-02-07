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

    }

}
