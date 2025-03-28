public class Euro{
    String nome = "Euro";
    Double valor;
    Double valorEntrada;

    public Euro() {
        this.valor = 0.0;
    }

    public Euro(Double valor){
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