package sieteymedia;

public class Mano implements ManoInterface{

    private Carta[] cartas;
    private int nCartas;

    public Mano() {
        this.cartas = new Carta[10];
        this.nCartas = 0;
    }

    @Override
    public void anadeCarta(Carta carta) {
        if (nCartas < cartas.length) {
            cartas[nCartas] = carta;
            nCartas++;
        } else {
            System.out.println("No se pueden aniadir mas cartas");
        }
    }

    @Override
    public Carta[] getCartas() {
        Carta[] cartas2 = new Carta[nCartas];
        for (int i=0; i<nCartas; i++) {
            cartas2[i] = cartas[i];
        }
        return cartas2;
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < nCartas; i++) {
            result += cartas[i].toString() + "\n";
        }
        return result;
    }

}
