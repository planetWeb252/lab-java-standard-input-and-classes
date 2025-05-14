package Lab;

import javax.sound.midi.Soundbank;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Luis Pérez", "luis@example.com", 30, 35000));
        employees.add(new Employee("Ana Gómez", "ana@example.com", 28, 40000));
        employees.add(new Intern("Carlos Ruiz", "carlos@example.com", 21, 18000));
        employees.add(new Employee("Sofía López", "sofia@example.com", 35, 50000));
        employees.add(new Intern("Lucía Díaz", "lucia@example.com", 22, 20000));
        employees.add(new Employee("Miguel Torres", "miguel@example.com", 40, 45000));
        employees.add(new Employee("Paula Moreno", "paula@example.com", 33, 38000));
        employees.add(new Intern("Jorge Ramírez", "jorge@example.com", 23, 19500));
        employees.add(new Employee("Elena Sánchez", "elena@example.com", 29, 41000));
        employees.add(new Intern("David Castro", "david@example.com", 24, 19000));

        try(BufferedWriter writer=new BufferedWriter(new FileWriter("employee.txt"))) {
            for(Employee e:employees){
                writer.write(e.toString());
                writer.newLine();
            }
            System.out.println("archivo Employee creado Correctamente");
        }catch (Exception e){
            System.err.println("Error al escribir el archivo "+e.getMessage());
        }



    }
}
