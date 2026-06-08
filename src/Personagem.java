public class Personagem {

    private double vida;
    private double buff;
    private double debuff;

    public Personagem(double vida, double buff, double debuff) {
        this.vida = vida;
        this.buff = buff;
        this.debuff = debuff;
    }

    public double calcularVidaFinal() {
        return BuffSistema.calcular(vida, buff, debuff);
    }
}