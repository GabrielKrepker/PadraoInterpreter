public class Adicao implements IInterpretadorExpressao {

    private double x;
    private double y;

    public Adicao(Numero a, Numero b) {
        x = a.getValor();
        y = b.getValor();
    }

    public double interpretar() {
        return x + y;
    }
}