public class Euro extends Moeda {
    private final double taxaConversao = 6.10;

    public Euro(double valor) {
        super(valor);
    }

    @Override
    public double converterParaReal() {
        return valor * taxaConversao;
    }

    @Override
    public String getNome() {
        return "Euro";
    }

    @Override
    public String toString() {
        return String.format("%.2f %s", valor, getNome());
    }
}
