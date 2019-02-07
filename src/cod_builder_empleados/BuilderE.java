/*
 * BUILDER hecho por el IDE desde la clase Empleado,en el constructor de 
Empleado boton derecho refactor y replace Constructor con bluilder
 */
package cod_builder_empleados;

public class BuilderE {

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
    private int formacion;

    public BuilderE(final String nombre, final String apellido1, final String dni) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.dni = dni;
    }

    public BuilderE setApellido2(String apellido2) {
        this.apellido2 = apellido2;
        return this;
    }

    public BuilderE setCargo(String cargo) {
        this.cargo = cargo;
        return this;
    }

    public BuilderE setDia(int dia) {
        this.dia = dia;
        return this;
    }

    public BuilderE setMes(int mes) {
        this.mes = mes;
        return this;
    }

    public BuilderE setAno(int ano) {
        this.ano = ano;
        return this;
    }

    public BuilderE setAltura(int altura) {
        this.altura = altura;
        return this;
    }

    public BuilderE setPie(int pie) {
        this.pie = pie;
        return this;
    }

    public BuilderE setDiametro(int diametro) {
        this.diametro = diametro;
        return this;
    }

    public BuilderE setSueldo(int sueldo) {
        this.sueldo = sueldo;
        return this;
    }

    public BuilderE setFormacion(int formacion) {
        this.formacion = formacion;
        return this;
    }

    public Empleado createEmpleado() {
        return new Empleado(nombre, apellido1, apellido2, dni, cargo, dia, mes, ano, altura, pie, diametro, sueldo, formacion);
    }

}
