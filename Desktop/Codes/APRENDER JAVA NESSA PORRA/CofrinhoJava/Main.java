import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        
        Dolar dolar = new Dolar();
        Euro euro = new Euro();
        Real real = new Real();

        dolar.setValor(15.0);

        dolar.info();

    }
}