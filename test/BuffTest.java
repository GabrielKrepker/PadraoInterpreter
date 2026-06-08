import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BuffTest {

    @Test
    void deveCalcularComBuffEDebuff() {

        Personagem p = new Personagem(100, 20, 10);

        double resultado = p.calcularVidaFinal();

        assertEquals(120, resultado);
    }

    @Test
    void deveAlterarFormula() {

        BuffSistema.formula = "vida + buff";

        Personagem p = new Personagem(100, 20, 10);

        double resultado = p.calcularVidaFinal();

        assertEquals(120, resultado);
    }
}