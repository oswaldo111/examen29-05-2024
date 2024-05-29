import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class App extends Empleado {
    public static void main(String[] args) throws Exception {

        ArrayList<Empleado> empleados = new ArrayList<>();
        Empleado emp = new Empleado();

        Scanner teclado = new Scanner(System.in);

        String decicString;

        //   empleados.add(new Empleado(1, "juan", "martinez", "la liberta", 1));

        //   empleados.add(new Empleado(3, "chepe", "martinez", "la liberta", 1));
        //   empleados.add(new Empleado(2, "german", "martinez", "la liberta", 1));

         while (true) {

            System.out.println("ingrese el Id: ");
            emp.setId(teclado.nextInt());

            System.out.println("ingrese el nombre: ");
            emp.setNombre(teclado.next());

            System.out.println("ingrese el apellido: ");
            emp.setApellido(teclado.next());

            System.out.println("ingrese el departamento: ");
            emp.setDepartamento(teclado.next());

            System.out.println("ingrese el salario: ");
            emp.setSalario( Double.parseDouble( teclado.next()));

            System.out.println("");

            System.out.println("desea detener la carga de empledos (s) , (n): ");
            decicString = teclado.next();

            empleados.add(emp);

            if (decicString.equals("n")) break;
        }

       
            Collections.sort(empleados, Comparator.comparingInt(Empleado :: getId));
        Iterator<Empleado> iterator = empleados.iterator();            
        while (iterator.hasNext()) {

            Empleado empo = iterator.next();
            System.out.println(empo.getId());
            
        }
        
        teclado.close();
        
    }
}
