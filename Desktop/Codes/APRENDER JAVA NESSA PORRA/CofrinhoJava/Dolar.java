public class Dolar {
    String nome = "Dolar";
    Double valor;
    Double valorEntrada;

    public Dolar() {
        this.valor = 0.0;
    }

    public Dolar(Double valor) {
        this.valor = valor;
    }

    public Double getValor() {
        return valor;
    }

    public Double setValor(Double valorEntrada) {
        return this.valor += valorEntrada;
    }

    public Double dolarConvertido(){
        return getValor() * 5.76;
    }

    public void info() {
        System.out.println("Moeda: " + nome);
        System.out.println("Valor: R$ " + valor);
        System.out.println("Valor convertido para Real: R$ " + dolarConvertido());
    }
}
