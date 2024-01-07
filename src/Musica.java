class Musica {
    private String nome;

    public Musica(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

class PlayerDeMusica {
    private Musica musicaAtual;
    private int volume;

    public void play(Musica musica) {
        System.out.println("Tocando: " + musica.getNome());
        musicaAtual = musica;
        emReproducao = true;
    }
}

    public void pausar() {
        if (musicaAtual != null && emReproducao) {
            System.out.println("Pausando a música: " + musicaAtual.getNome());
            emReproducao = false;
        } else {
            System.out.println("Nenhuma música em reprodução. Use 'play' primeiro.");
        }
    }

    public void selecionarMusica(Musica musica) {
        System.out.println("Selecionando a música: " + musica.getNome());
        musicaAtual = musica;
        emReproducao = false;
    }
public class Main {
    public static void main(String[] args) {
        PlayerDeMusica player = new PlayerDeMusica();

        Musica musica1 = new Musica("Música 1");
        Musica musica2 = new Musica("Música 2");

        player.play(musica1);
        player.pausar();
        player.selecionarMusica(musica2);
        player.play(musica2);
    }
}