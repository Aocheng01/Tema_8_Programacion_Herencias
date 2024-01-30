

package ejemplos;

import java.util.Arrays;


public class ClasePrincipal {
    public static void main(String[] args) { 
        Personas persona1 = new Personas("Ana", "Garcia");
        Personas persona2 = new Personas("Ana", "Garcia");
        Personas persona3 = new Personas("Carla", "Martinez");
    
        Personas[] vectorPersonas1= new Personas [2];
        vectorPersonas1[0]=persona1;
        vectorPersonas1[1]=persona2;
        
        Personas[] vectorPersonas2= new Personas [2];
        vectorPersonas2[0]=persona1;
        vectorPersonas2[1]=persona2;
        
        Personas[] vectorPersonas3= new Personas [2];
        vectorPersonas3[0]=persona2;
        vectorPersonas3[1]=persona3;

        
        boolean iguales = Arrays.equals(vectorPersonas1, vectorPersonas2);
        System.out.println("Son iguales el vector 1 y el vector 2? : "+iguales);
        
        
        System.out.println("Son iguales el vector 2 y el vector 3?: "+ Arrays.equals(vectorPersonas2, vectorPersonas3));
        
    }
        
        
    }
