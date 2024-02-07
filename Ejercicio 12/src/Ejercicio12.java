import java.util.HashMap;

public class Ejercicio12 {
    public static void main(String[] args) {
       HashMap <String,Integer> puntuajes = new HashMap<>();
       Carta[] baraja = new Carta[5];
       int puntos = 0;

       puntuajes.put("as", 11);
       puntuajes.put("dos", 0);
       puntuajes.put("tres", 10);
       puntuajes.put("cuatro", 0);
       puntuajes.put("cinco", 0);
       puntuajes.put("seis", 0);
       puntuajes.put("siete", 0);
       puntuajes.put("sota", 2);
       puntuajes.put("caballo", 3);
       puntuajes.put("rey", 4);

        for(int i = 0 ; i < 5 ; i++){
            baraja[i] = new Carta();
            puntos += puntuajes.get(baraja[i].getNumero());
            System.out.println(baraja[i]);
        }

        System.out.println("Tienes " + puntos + " puntos.");

    }    
}