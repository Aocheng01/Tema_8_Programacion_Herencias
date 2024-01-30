package resueltas8_2;

public class Hora {

    int hora;
    int minuto;

    public Hora(int hora, int minuto) {
        if (hora >= 0 && hora <= 23 && minuto >= 0 && minuto <= 59) {
            this.hora = hora;
            this.minuto = minuto;
        } else {
            System.out.println("Hora o minuto invalido.");
        }

    }
    
    public void incrementarMinuto(){
        minuto++;
        if(minuto == 60){
            minuto=1;
            hora++;
        }
    }
    
    public boolean setMinuto(int valor) {
        this.minuto = valor;
        boolean posible;
        if(minuto >= 0 && minuto <= 59){
            posible = true;
        }else{
            posible = false;
        }
        return posible;
    }
    
    public boolean setHora(int valor){
        this.hora = valor;
        boolean posible;
        if(hora >= 0 && hora <= 23){
            posible = true;
        }else{
            posible = false;
        }
        return posible;
    }

    @Override
    public String toString() {
        return "Hora{" + "hora=" + hora + ", minuto=" + minuto + '}';
    }

       
}
