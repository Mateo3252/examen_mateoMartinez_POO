
package ec.edu.intsuperior.modulo;

public class Cliente extends Persona{
    private String Telefonocontacto;
    
    public Cliente (){
    }

    public Cliente(String Telefonocontacto, String nombre1, String nombre2, String apellido1, String apellido2, String telefono, String correo, int edad, String direccion) {
      super(nombre1, nombre2, apellido1, apellido2, correo, telefono, correo, direccion, Telefonocontacto, telefono);
        this.Telefonocontacto = Telefonocontacto;
    }

    public void setTelefonocontacto(String Telefonocontacto) {
        this.Telefonocontacto = Telefonocontacto;
    }

    public String getTelefonocontacto() {
        return Telefonocontacto;
    }


  
}
