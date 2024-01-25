package sieteymedia;

public class Baraja implements BarajaInterface {

    private Carta[] cartas;
    private int cartasQueQuedan;

    
    public Baraja() {
        this.cartas = new Carta[40];
        this.cartasQueQuedan = 0;
        nuevaBaraja();
    }


    private void barajar() {
        for (int i = cartasQueQuedan - 1; i > 0; i--) {
            int j = (int) (Math.random() * (i + 1));
            Carta a = cartas[i];
            cartas[i] = cartas[j];
            cartas[j] = a;
        }
    }

    @Override
    public void nuevaBaraja() {
        cartasQueQuedan = 0;
        for (int i = 0; i < 40;i++){
            cartas[cartasQueQuedan++] = new Carta(i);
        }
        barajar();
    }

    @Override
    public Carta extraerCarta() {
        if (cartasQueQuedan == 0) {
            System.out.println("Baraja vacia, no hay mas cartas");
            return null;
        }
        return cartas[--cartasQueQuedan];
    }

    @Override
    public String toString() {
        if (cartasQueQuedan == 0) {
            return "";
        }
    
        String resultado = cartas[0].toString();
        for (int i = 1; i < cartasQueQuedan; i++) {
            resultado += ", " + cartas[i].toString();
        }
        return resultado;
    }
    
}


