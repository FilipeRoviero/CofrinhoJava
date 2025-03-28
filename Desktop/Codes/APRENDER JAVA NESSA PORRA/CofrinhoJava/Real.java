public class Real {
    String nome = "Real";
    Double valor;
    Double valorEntrada;

    public Real() {
        this.valor = 0.0;
    }

    public Real(Double valor){
        this.valor = valor;
    }

    public Double getValor() {
        return valor;
    }

    public Double setValor(Double valorEntrada) {
        return this.valor += valorEntrada;
    }

    public void info() {
        System.out.println("Moeda: " + nome);
        System.out.println("Valor: R$ " + valor);
    }
}
