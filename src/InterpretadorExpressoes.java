import java.util.*;

public class InterpretadorExpressoes implements IInterpretadorExpressao {

    private IInterpretadorExpressao resultado;

    public InterpretadorExpressoes(String expressao) {

        Stack<IInterpretadorExpressao> pilha = new Stack<>();
        List<String> elementos = Arrays.asList(expressao.split(" "));
        Iterator<String> it = elementos.iterator();

        while (it.hasNext()) {
            String e = it.next();

            if (e.matches("\\d+(\\.\\d*)?")) {
                pilha.push(new Numero(Double.parseDouble(e)));

            } else if (e.equals("+")) {
                Numero a = (Numero) pilha.pop();
                Numero b = new Numero(Double.parseDouble(it.next()));
                pilha.push(new Numero(new Adicao(a, b).interpretar()));

            } else if (e.equals("-")) {
                Numero a = (Numero) pilha.pop();
                Numero b = new Numero(Double.parseDouble(it.next()));
                pilha.push(new Numero(new Subtracao(a, b).interpretar()));

            } else if (e.equals("*")) {
                Numero a = (Numero) pilha.pop();
                Numero b = new Numero(Double.parseDouble(it.next()));
                pilha.push(new Numero(new Multiplicacao(a, b).interpretar()));
            }
        }

        resultado = pilha.pop();
    }

    public double interpretar() {
        return resultado.interpretar();
    }
}