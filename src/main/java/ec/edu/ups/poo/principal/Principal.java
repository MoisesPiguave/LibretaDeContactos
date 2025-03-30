package ec.edu.ups.poo.principal;
import ec.edu.ups.poo.clases.Familiar;// importamos la clase principal
import ec.edu.ups.poo.clases.Persona;// importamos la clase persona
import java.util.GregorianCalendar; // importar Gregorian calendar
import java.util.Scanner;// importar el scanner para poder recibir la informacion

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // creamos el scanner

        // mostramos el mensaje  para el ingreso de personas
        System.out.println("Ingrese cuántas personas desea registrar: ");
        // guardamos el numero de personas la variable Numero de personas
        int NumerodePersonas = scanner.nextInt();
        // Usamos un salto de linea
        scanner.nextLine();
        // creamos un arreglo personas" que tiene como parametro numero de personas
        Persona[] personas = new Persona[NumerodePersonas];
        // creamos el i con un valor inicial de 1, ya que la no podemos contar persona 0
        // un for que funcione mientras i sea menor
        // al numero de personas , y avanza el valor de i en cada pasada por uno
        for (int i=0; i < NumerodePersonas; i++) {

            // instanciamos la variable persona
            Persona persona = new Persona();

            // mostramos los mensaje de ingreso
            System.out.print("Ingrese la informacion de las personas" + (i+1 ));
            System.out.print("Nombre: ");
            persona.setNombre(scanner.nextLine());

            System.out.print("Apellido: ");
            persona.setApellido(scanner.nextLine());

            System.out.print("Cédula: ");
            persona.setCedula(scanner.nextLine());

            System.out.print("Dirección: ");
            persona.setDireccion(scanner.nextLine());

            // guardamos la posiciones del arreglo i en personas
            personas[i] = persona;
        }

        // Registro de familiares
        System.out.println("¿Cuántos familiares desea ingresar ?");

        // creamos numero de familia para saber cuantos miembros de la familia desea ingresar
        int NumeroFamiliares = scanner.nextInt();

        // salto de linea
        scanner.nextLine();

        // arreglo para guardar familiares
        Familiar[] familiares = new Familiar[NumeroFamiliares];

        for (int i = 0; i < NumeroFamiliares; i++) {
            Familiar familiar = new Familiar();

            System.out.println("\n--- Ingrese los datos del familiar " + (i + 1) + " ---");
            System.out.print("Nombre: ");
            familiar.setNombre(scanner.nextLine());

            System.out.print("Apellido: ");
            familiar.setApellido(scanner.nextLine());

            System.out.print("Cédula: ");
            familiar.setCedula(scanner.nextLine());

            System.out.print("Dirección: ");
            familiar.setDireccion(scanner.nextLine());

            System.out.print("Parentesco: ");
            familiar.setParentesco(scanner.nextLine());

            System.out.print("Tipo de sangre: ");
            familiar.setTipoDeSangre(scanner.nextLine());

            System.out.print("Año de nacimiento: ");
            int Nacimiento = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Mes de nacimiento (1-12): ");
            int mesNacimiento = scanner.nextInt() - 1;
            scanner.nextLine();

            System.out.print("Día de nacimiento: ");
            int diaNacimiento = scanner.nextInt();
            scanner.nextLine();

            GregorianCalendar fechaNacimiento = new GregorianCalendar(Nacimiento, mesNacimiento, diaNacimiento);
            familiar.setFechaDeNacimiento(fechaNacimiento);

            familiares[i] = familiar;
        }

        // Mostrar información de personas
        //System.out.println("\n--- Lista de Personas ---");
        //for (Persona persona : personas) {
            //System.out.println(persona);
            //System.out.println();
        //}

        // Mostrar información de familiares
        System.out.println("\n--- Lista de Familiares ---");
        for (Familiar familiar : familiares) {
            System.out.println(familiar);
            System.out.println();

        }
    }
}