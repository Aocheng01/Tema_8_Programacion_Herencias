package resueltas8_2;

public class HoraExacta extends Hora {

    public int segundos;

    public HoraExacta(int hora, int minuto, int segundos) {
        super(hora, minuto);
        this.segundos = segundos;
    }

    public void setSegundos(int valor) {
        
        if (valor < 0 || valor >= 60) {
          System.out.println("Los segundos deben estar entre 0 y 59");
        }
        this.segundos = valor;
    }

    @Override
    public void incrementar() {
        segundos++;
        if (segundos >= 60) {
            segundos = 0;
            super.incrementar();
//            minuto++;
//            if(minuto>=60){
//                minuto=0;
//                hora++;
//                if(hora>=24){
//                    hora=0;
//                }
//            }
        }
    }

    @Override
    public String toString() {
        return "HoraExacta{" + "hora=" + hora + ":" + minuto + ":" + segundos + '}';
    }

}
