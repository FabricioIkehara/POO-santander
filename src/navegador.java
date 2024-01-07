import java.util.ArrayList;
import java.util.List;

class Aba {
    private String url;

    public Aba(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}

class Navegador {
    private List<Aba> abas;
    private Aba abaAtual;

    public Navegador() {
        this.abas = new ArrayList<>();
    }

    public void exibirPagina() {
        if (abaAtual != null) {
            System.out.println("Exibindo página: " + abaAtual.getUrl());
        } else {
            System.out.println("Nenhuma aba aberta.");
        }
    }

    public void adicionarNovaAba(String url) {
        Aba novaAba = new Aba(url);
        abas.add(novaAba);
        abaAtual = novaAba;
        System.out.println("Nova aba adicionada: " + url);
    }

    public void atualizarPagina() {
        if (abaAtual != null) {
            System.out.println("Atualizando página: " + abaAtual.getUrl());
        } else {
            System.out.println("Nenhuma aba aberta.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Navegador navegador = new Navegador();

        navegador.adicionarNovaAba("https://www.linkedin.com/in/fabricioikeharainamine/");
        navegador.exibirPagina();
        navegador.atualizarPagina();

        navegador.adicionarNovaAba("https://github.com/FabricioIkehara");
        navegador.exibirPagina();
    }
}