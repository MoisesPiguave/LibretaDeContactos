package ec.edu.ups.poo.clases;
import java.util.Calendar;
import java.util.GregorianCalendar;
//moi haz bien el programa
public class Familiar extends Persona {
    // atributos
    private String parentesco;
    private String tipoDeSangre;
    private GregorianCalendar fechaDeNacimiento;
    // constructor con sus argumentos que son los atributos , mas lo que heredo de la clase padre
    // que se llamo por medio del super()
    public Familiar(String cedula, String nombre, String apellido, String direccion, String parentesco, String tipoDeSangre, GregorianCalendar fechaDeNacimiento) {
        super(cedula, nombre, apellido, direccion);
    // instanciamos los atributos
        this.parentesco = parentesco;
        this.tipoDeSangre = tipoDeSangre;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
    // constructor para familia
    public Familiar() {
    // constructor para la edad


    }
    // getter y setter para asignar y recibir los valores de los atributos
    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public String getTipoDeSangre() {
        return tipoDeSangre;
    }

    public void setTipoDeSangre(String tipoDeSangre) {
        this.tipoDeSangre = tipoDeSangre;
    }

    public GregorianCalendar getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(GregorianCalendar fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    // metodo para calcular edad en base a su fecha de nacimiento
    public int edad(){
        // el get instance crea una instancia si no esta, caso contrario devuelve su valor
        Calendar calendar = Calendar.getInstance();
        // ingresamos el año en el que estamos
        int actualidad = calendar.get(Calendar.YEAR);
        int edadReal = actualidad - this.fechaDeNacimiento.get(Calendar.YEAR);
        return edadReal;

    }

    // Metodo toString
    @Override
    public String toString() {
        return super.toString() + "\nParentesco: " + parentesco + "\nTipo de sangre: " + tipoDeSangre + "\nFecha de nacimiento: " + fechaDeNacimiento;
}


}







