package resueltas8_3;

import resueltas8_2.*;
import java.util.*;

public class ClasePrincipal {

    public static void main(String[] args) {
        HoraExacta horaExacta1 = new HoraExacta(11, 11, 11);
        HoraExacta horaExacta2 = new HoraExacta(11, 11, 11);
        HoraExacta horaExacta3 = new HoraExacta(21, 21, 21);

        Hora[] vectorHoras1 = {new Hora(1, 1), new HoraExacta(1, 1, 1), new Hora(2, 2)};
        System.out.println(Arrays.toString(vectorHoras1));
        Hora[] vectorHoras2 = {new Hora(1, 1), new HoraExacta(1, 1, 1), new Hora(2, 2)};
        System.out.println(Arrays.toString(vectorHoras2));
        Hora[] vectorHoras3 = {new Hora(3, 3), new Hora(3, 3), new Hora(3, 3)};
        System.out.println(Arrays.toString(vectorHoras3));

        System.out.println("El vector horas1 es igual a vector horas2: " + Arrays.equals(vectorHoras1, vectorHoras2));
        System.out.println("El vector horas2 es igual a vector horas3: " + Arrays.equals(vectorHoras2, vectorHoras3));

        System.out.println(horaExacta1);
        System.out.println(horaExacta2);
        System.out.println(horaExacta3);

        System.out.println("\nLa hora 1 es igual a la hora 2: " + horaExacta1.equals(horaExacta2));
        System.out.println("La hora 2 es igual a la hora 3: " + horaExacta2.equals(horaExacta3));
    }
}
