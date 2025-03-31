import java.util.ArrayList;
import java.util.List;

public class Cofrinho {
    private List<Moeda> moedas;

    public Cofrinho() {
        moedas = new ArrayList<>();
    }

    // Adiciona uma moeda ao cofrinho
    public void adicionarMoeda(Moeda m) {
        moedas.add(m);
        System.out.println(m.getNome() + " adicionada com sucesso!");
    }

    // Remove a moeda inteira (caso haja correspondência exata)
    public boolean removerMoeda(Moeda m) {
        if (moedas.remove(m)) {
            System.out.println(m.getNome() + " removida com sucesso!");
            return true;
        }
        System.out.println("Moeda não encontrada.");
        return false;
    }
    
    // Remove uma quantia de uma moeda do tipo especificado, se possível.
    public boolean removerValorMoeda(String tipo, double valorASerRemovido) {
        for (int i = 0; i < moedas.size(); i++) {
            Moeda m = moedas.get(i);
            if(m.getNome().equalsIgnoreCase(tipo)) {
                if(m.getValor() >= valorASerRemovido) {
                    if(m.getValor() == valorASerRemovido) {
                        moedas.remove(i);
                    } else {
                        m.valor -= valorASerRemovido;  // Atualiza o valor restante
                    }
                    System.out.println("Removido " + valorASerRemovido + " de " + tipo + " com sucesso!");
                    return true;
                }
            }
        }
        System.out.println("Não foi possível remover o valor. Moeda não encontrada ou valor insuficiente.");
        return false;
    }

    // Lista todas as moedas no cofrinho
    public void listarMoedas() {
        if (moedas.isEmpty()) {
            System.out.println("O cofrinho está vazio.");
        } else {
            System.out.println("Moedas no cofrinho:");
            for (Moeda m : moedas) {
                System.out.println(m);
            }
        }
    }

    // Retorna o total das moedas convertido para real
    public double totalConvertidoParaReal() {
        double total = 0;
        for (Moeda m : moedas) {
            total += m.converterParaReal();
        }
        return total;
    }
}
