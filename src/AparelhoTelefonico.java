class AparelhoTelefonico {
    private boolean ligado;
    private boolean chamadaAtiva;
    private String correioDeVoz;

    public AparelhoTelefonico() {
        this.ligado = false;
        this.chamadaAtiva = false;
        this.correioDeVoz = "";
    }

    public void ligar() {
        if (!ligado) {
            System.out.println("Aparelho telefônico ligado");
            ligado = true;
        } else {
            System.out.println("Aparelho telefônico já está ligado");
        }
    }

    public void atender() {
        if (ligado && !chamadaAtiva) {
            System.out.println("Atendendo a chamada");
            chamadaAtiva = true;
        } else {
            System.out.println("Não é possível atender. Verifique se o aparelho está ligado ou se há uma chamada ativa.");
        }
    }

    public void deixarCorreioDeVoz(String mensagem) {
        if (chamadaAtiva) {
            correioDeVoz = mensagem;
            System.out.println("Mensagem de correio de voz deixada: " + mensagem);
            encerrarChamada();
        } else {
            System.out.println("Não é possível deixar correio de voz sem uma chamada ativa.");
        }
    }

    private void encerrarChamada() {
        chamadaAtiva = false;
        System.out.println("Chamada encerrada");
    }
}

public class Main {
    public static void main(String[] args) {
        AparelhoTelefonico telefone = new AparelhoTelefonico();

        telefone.ligar();
        telefone.atender();

        // Simular correio de voz
        telefone.ligar();
        telefone.atender();
        telefone.deixarCorreioDeVoz("Oi! mensagem do correio de voz");

        // Tentar atender uma nova chamada enquanto o correio de voz está ativo
        telefone.atender();
    }
}