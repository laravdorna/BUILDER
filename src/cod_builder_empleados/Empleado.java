/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cod_builder_empleados;

/**
 *
 * @author lvazquezdorna
 */
public class Empleado {

    private String nombre;
    private String apellido1;
    private String apellido2;
    private String dni;
    private String cargo;
    private int dia;
    private int mes;
    private int ano;
    private int altura;
    private int pie;
    private int diametro;
    private int sueldo;
    private int formacion;

    //constructores final
    public Empleado(final String nombre, final String apellido1,
            final String apellido2, final String dni, final String cargo,
            final int dia, final int mes, final int ano, final int altura,
            final int pie, final int diametro, final int sueldo,
            final int formacion)
    {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.dni = dni;
        this.cargo = cargo;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.altura = altura;
        this.pie = pie;
        this.diametro = diametro;
        this.sueldo = sueldo;
        this.formacion = formacion;
    }

    public Empleado(final String nombre, final String apellido1, final String dni) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.dni = dni;
    }

}
