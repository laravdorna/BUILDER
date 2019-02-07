/*
 * BUILDER :
Se va a encargar de los valores por defecto de los atributos, por lo que
se asignan valores por defecto a los mismos.
Esta clase se instancia por cada empleado que queremos crear
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

    /*por cada paramatetro generamos su set de los atributos no obligatorios
    devuelve un Objeto de la clase en el cual cambiamos solo el atributo que 
    deseemos
     */
    public EmpleadoBuilder setApellido2(String nuevoApellido2) {
        this.apellido2 = nuevoApellido2;
        return this;
    }

    /*
    se necesita un metodo crear que devuelva un objeto de la clase EMPLEADO
    para que una vez dados los parametros con el builder tengamos un empleado de 
    la clase empleado
     */
    public Empleado crearEmpleado() {
        return new BuilderE().setNombre(nombre).setApellido1(apellido1).setApellido2(apellido2).setDni(dni).setCargo(cargo).setDia(dia).setMes(mes).setAno(ano).setAltura(altura).setPie(pie).setDiametro(diametro).setSueldo(sueldo).setFormacion(formacion).createEmpleado();
    }

}
