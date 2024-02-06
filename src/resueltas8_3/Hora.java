package resueltas8_3;

import resueltas8_2.*;

public class Hora {

    int hora;
    int minuto;

    public Hora(int hora, int minuto) {
        if (hora >= 0 && hora <= 23 && minuto >= 0 && minuto <= 59) {
            this.hora = hora;
            this.minuto = minuto;
        }
    }

    public void incrementar() {
        minuto++;
        if (minuto == 60) {
            minuto = 0;
            hora++;
            if (hora == 24) {
                hora = 0;
            }
        }
    }

    public boolean setMinuto(int valor) {
        boolean posible = false;
        if (valor >= 0 && valor <= 59) {
            this.minuto = valor;
            posible = true;
        } else {
            posible = false;
        }
        return posible;
    }

    public boolean setHora(int valor) {
        boolean posible = false;
        if (valor >= 0 && valor <= 23) {
            this.hora = valor;
            posible = true;
        } else {
            posible = false;
        }
        return posible;
    }

    public boolean equals(Object o){
        HoraExacta otraHora = (HoraExacta) o;
        boolean iguales;
        if(this.hora==otraHora.hora
                && this.minuto == otraHora.minuto){
            iguales = true;
        }else{
            iguales=false;
        }
        return iguales;
    }
    
    @Override
    public String toString() {
        return "Hora{" + "hora=" + hora + ":" + minuto + '}';
    }
}
