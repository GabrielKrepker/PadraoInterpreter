public class Subtracao implements IInterpretadorExpressao {

    private double x;
    private double y;

    public Subtracao(Numero a, Numero b) {
        x = a.getValor();
        y = b.getValor();
    }

    public double interpretar() {
        return x - y;
    }
}