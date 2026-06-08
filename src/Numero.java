public class Numero implements IInterpretadorExpressao {

    private double valor;

    public Numero(double valor) {
        this.valor = valor;
    }

    public double interpretar() {
        return valor;
    }

    public double getValor() {
        return valor;
    }
}