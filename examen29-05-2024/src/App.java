import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class App extends Empleado {
    public static void main(String[] args) throws Exception {

        ArrayList<Empleado> Empleados = new ArrayList<>();
        Empleado emp = new Empleado();

        Scanner teclado = new Scanner(System.in);

        String decicString;

         Empleados.add(new Empleado(1, "juan", "martinez", "la liberta", 1));

         Empleados.add(new Empleado(3, "chepe", "martinez", "la liberta", 1));
         Empleados.add(new Empleado(2, "german", "martinez", "la liberta", 1));

        // while (true) {

        //     System.out.println("ingrese el Id: ");
        //     emp.setId(teclado.nextInt());

        //     System.out.println("ingrese el nombre: ");
        //     emp.setNombre(teclado.next());

        //     System.out.println("ingrese el apellido: ");
        //     emp.setApellido(teclado.next());

        //     System.out.println("ingrese el departamento: ");
        //     emp.setDepartamento(teclado.next());

        //     System.out.println("ingrese el salario: ");
        //     emp.setSalario( Double.parseDouble( teclado.next()));

        //     System.out.println("");

        //     System.out.println("desea detener la carga de empledos (s) , (n): ");
        //     decicString = teclado.next();

        //     Empleados.add(emp);

        //     if (decicString.equals("n")) break;
        // }

            
        Iterator<Empleado> iterator = Empleados.iterator();            
        while (iterator.hasNext()) {

            Empleado empo = iterator.next();
            System.out.println(empo.getId());
            
        }
        
        teclado.close();
        
    }
}
