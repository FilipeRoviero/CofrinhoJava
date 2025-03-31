public class Dolar extends Moeda {
    private final double taxaConversao = 5.20;

    // Constructor utilizando o método super para chamar o construtor da classe pai (Moeda)
    public Dolar(double valor) {
        super(valor);
    }

    @Override
    public double converterParaReal() {
        return valor * taxaConversao;
    }

    @Override
    public String getNome() {
        return "Dólar";
    }

    @Override
    public String toString() {
        return String.format("%.2f %s", valor, getNome());
    }
}
