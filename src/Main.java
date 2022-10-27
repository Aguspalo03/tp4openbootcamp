import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Agustin", 21, 200, "2245425238");

        System.out.println(cliente.getNombre() + " " + cliente.getEdad() + " " + cliente.getCredito() + " " + cliente.getTelefono());

        Trabajador trabajador = new Trabajador("Lean", 22, "2245521465", 250000);

        System.out.println(trabajador.getNombre() + " " + trabajador.getEdad() + " " + trabajador.getSalario() + " " + cliente.getTelefono());

    }
}
class Persona {
    private int edad;
    private String nombre;
    private String telefono;

     public Persona(String nombre, int edad, String telefono) {
        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
class Cliente extends Persona {
    private int credito;
    public Cliente(String nombre,int edad, int credito,String telefono){
        super(nombre, edad, telefono);
        this.credito = credito;
    }

        public int getCredito(){
            return this.credito;
        }
        public void setCredito(int credito){
            this.credito = credito;
        }
}
class Trabajador extends Persona{
    private int salario;

    public Trabajador(String nombre,int edad,String telefono, int salario){
    super(nombre, edad,telefono);
    this.salario = salario;
    }

        public int getSalario(){
            return this.salario;
        }
        public void setSalario(int salario){
            this.salario = salario;
        }



}









