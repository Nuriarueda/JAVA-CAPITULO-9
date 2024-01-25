package sieteymedia;

public class Carta implements CartaInterface {

    private String palo;
    private String numero;
    private int codigo;

    public Carta(int codigo) {
        this.codigo = codigo;
        this.palo = BarajaInterface.getPalo(codigo);
        this.numero = BarajaInterface.getNumero(codigo);
    }


    @Override
    public String getPalo() {
        return palo;
    }

    @Override
    public String getNumero() {
        return numero;
    }

    @Override
    public int getCodigo() {
        return codigo;
    }

    @Override
    public String toString() {
        return getNumero() + " de " + getPalo();
    }
}
