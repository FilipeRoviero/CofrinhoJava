public abstract class Moeda {
    protected double valor;

    public Moeda(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    // Converte o valor da moeda para real
    public abstract double converterParaReal();

    // Retorna o nome da moeda
    public abstract String getNome();

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Moeda other = (Moeda) obj;
        return Double.compare(valor, other.valor) == 0;
    }

    @Override
    public int hashCode() {
        return Double.hashCode(valor);
    }
}
