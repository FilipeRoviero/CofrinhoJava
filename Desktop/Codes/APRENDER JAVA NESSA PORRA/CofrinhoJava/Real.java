public class Real extends Moeda {

    public Real(double valor) {
        super(valor);
    }

    @Override
    public double converterParaReal() {
        return valor;
    }

    @Override
    public String getNome() {
        return "Real";
    }

    @Override
    public String toString() {
        return String.format("%.2f %s", valor, getNome());
    }
}