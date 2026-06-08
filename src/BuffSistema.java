public class BuffSistema {

    public static String formula = "vida + buff - debuff * 2";

    public static double calcular(double vida, double buff, double debuff) {

        String expressao = formula
                .replace("vida", Double.toString(vida))
                .replace("buff", Double.toString(buff))
                .replace("debuff", Double.toString(debuff));

        IInterpretadorExpressao interpretador =
                new InterpretadorExpressoes(expressao);

        return interpretador.interpretar();
    }
}