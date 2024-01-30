package resueltas.resueltas8_1;

public class ClasePrincipal {

    public static void main(String[] args) {
        Hora hora1 = new Hora(1, 1);
        System.out.println(hora1);

        System.out.println("Se ha podido establecer la hora: " + hora1.setHora(2));
        System.out.println(hora1);

        System.out.println("Se ha podido establecer la hora: " + hora1.setHora(25));

        hora1.incrementarMinuto();
        System.out.println(hora1);

        System.out.println("Se ha podido establecer la hora: " + hora1.setMinuto(2));
        System.out.println(hora1);
        System.out.println("Se ha podido establecer la hora: " + hora1.setMinuto(90));
        
    }

}
