/*
 * BUILDER :
Se va a encargar de los valores por defecto de los atributos, por lo que
se asignan valores por defecto a los mismos
 */
package cod_builder_empleados;

/**
 *
 * @author lvazquezdorna
 */
public class EmpleadoBuilder {

    //atributos
    private String nombre;
    private String apellido1;
    private String apellido2 = "";
    private String dni;
    private String cargo = "";
    private int dia = 0;
    private int mes = 0;
    private int ano = 0;
    private int altura = 0;
    private int pie = 0;
    private int diametro = 0;
    private int sueldo = 0;
    private int formacion = 0;

    //creamos el constructor por defecto con los tres atributos obligatorios
    public EmpleadoBuilder(final String nombre, final String apellido1, final String dni) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.dni = dni;
    }

}
