/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_2_herencia_2;

/**
 *
 * @author IvanTron
 */
public class EVA2_2_HERENCIA_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Direccion dire = new Direccion("5ta", 100, "X", "0011", "Chihuahua", "Chihuahua", "00112233");
        Estudiante estu1 = new Estudiante("9018233", "Ruben", 40, dire);
        estu1.imprimirDatos();
    }

}

class Direccion {
    private String calle;
    private int numero;
    private String colonia;
    private String codigoPostal;
    private String ciudad;
    private String estado;
    private String telefono;

    public Direccion() {
        this.calle = "";
        this.numero = 0;
        this.colonia = "";
        this.codigoPostal = "";
        this.ciudad = "";
        this.estado = "";
        this.telefono = "";
    }

    public Direccion(String calle, int numero, String colonia, String codigoPostal, String ciudad, String estado, String telefono) {
        this.calle = calle;
        this.numero = numero;
        this.colonia = colonia;
        this.codigoPostal = codigoPostal;
        this.ciudad = ciudad;
        this.estado = estado;
        this.telefono = telefono;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public void imprimirDireccion() {
        System.out.println("Calle: " + calle + ", #" + numero + ", Col. " +  colonia +  "\nCodigo postal: " +  codigoPostal + 
                ", Ciudad: " + ciudad + ", Estado: " + estado + ", Telefono: " + telefono);
    }
}

class Estudiante extends Persona {
    private String numeroControl;
    private Direccion direccion;
    
    public Estudiante() {
        super();
        this.numeroControl = "";
        direccion = new Direccion();
    }

    public Estudiante(String numeroControl, String nombre, int Edad, Direccion direccion) {
        super(nombre, Edad);
        this.numeroControl = numeroControl;
        this.direccion = direccion;
    }

    public String getNumeroControl() {
        return numeroControl;
    }

    public void setNumeroControl(String numeroControl) {
        this.numeroControl = numeroControl;
    }

    @Override
    public void imprimirDatos() {
        super.imprimirDatos();
        System.out.println("Numero de control: " + numeroControl);
        direccion.imprimirDireccion();
}
    
    
}

class Persona {

    private String nombre;
    private int edad;

    public Persona() {
        this.nombre = "";
        this.edad = 0;
    }


    public Persona(String nombre, int Edad) {
        this.nombre = nombre;
        this.edad = Edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int Edad) {
        this.edad = Edad;
    }

    public void imprimirDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
                
    }
}
