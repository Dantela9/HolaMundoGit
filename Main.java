import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, introduce tu fecha de nacimiento (formato: dd/mm/aaaa):");
        String fechaNacimiento = scanner.nextLine();

        LocalDate fechaNacimientoParsed = FechaUtil.parseFecha(fechaNacimiento);
        LocalDate fechaActual = LocalDate.now();

        long diasPasados = CalculadoraDias.calcularDiasTranscurridos(fechaNacimientoParsed, fechaActual);
        System.out.println("Han pasado " + diasPasados + " días desde tu fecha de nacimiento.");
    }
}
