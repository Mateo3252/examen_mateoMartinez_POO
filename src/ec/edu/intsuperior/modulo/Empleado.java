
package ec.edu.intsuperior.modelo;

import ec.edu.intsuperior.modulo.Persona;


public class Empleado extends Persona{
    double sueldoBruto;

    public Empleado() {
    } 

    public Empleado(double sueldoBruto, String nombre1, String nombre2, String apellido1, String apellido2, String telefono, String correo, int edad, String direccion,String sueldomes) {
        super(nombre1, nombre2, apellido1, apellido2, correo, telefono, correo, direccion, direccion,sueldomes);
        this.sueldoBruto = sueldoBruto;
    }

    public void setSueldoBruto(double sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }

    public double getSueldoBruto() {
        return sueldoBruto;
    }
    
    @Override
    public String toString() {
        return "sueldobruto: "
                + "el sueldo del empleado es: \n" +getSueldobruto();
    }

  

  

   
    }
