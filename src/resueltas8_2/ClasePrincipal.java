package resueltas8_2;

public class ClasePrincipal {

    public static void main(String[] args) {
        Hora hora1 = new Hora(11, 11);
        HoraExacta hora2 = new HoraExacta(12, 12, 59);
        
        System.out.println(hora1);

        System.out.println("Se ha podido establecer la hora: " + hora1.setHora(2));
        System.out.println(hora1);

        System.out.println("Se ha podido establecer la hora: " + hora1.setHora(25));

        hora1.incrementar();
        System.out.println(hora1);

        System.out.println("Se ha podido establecer la hora: " + hora1.setMinuto(2));
        System.out.println(hora1);
        System.out.println("Se ha podido establecer la hora: " + hora1.setMinuto(90));
        
        
        
        System.out.println("\n\n"+hora2);

        System.out.println("Se ha podido establecer la hora: " + hora2.setHora(2));
        System.out.println(hora2);

        System.out.println("Se ha podido establecer la hora: " + hora2.setHora(23));

        hora2.incrementar();
        System.out.println(hora2);

        System.out.println("Se ha podido establecer la hora: " + hora2.setMinuto(2));
        System.out.println(hora2);
        System.out.println("Se ha podido establecer la hora: " + hora2.setMinuto(90));
    }
}
