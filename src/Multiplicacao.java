public class Multiplicacao implements IInterpretadorExpressao {

    private double x;
    private double y;

    public Multiplicacao(Numero a, Numero b) {
        x = a.getValor();
        y = b.getValor();
    }

    public double interpretar() {
        return x * y;
    }
}