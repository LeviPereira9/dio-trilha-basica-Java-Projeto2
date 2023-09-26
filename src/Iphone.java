import java.util.Scanner;

public class Iphone {
    private ReprodutorMusical reprodutorMusical = new ReprodutorMusical();
    private Telefone telefone = new Telefone();
    private Navegador navegador = new Navegador();

    public void abrirAplicativoTelefone() {
        telefone.gerenciarAplicativo(true);
    }

    public void abrirAplicativoMusical() {
        reprodutorMusical.gerenciarAplicativo(true);
    }

    public void ligarParaContatos() {
        if (telefone.ligado()) {
            if (reprodutorMusical.musicaTocando()) {
                reprodutorMusical.gerenciarPlay(true);
            }
            telefone.ligarParaContato();
            reprodutorMusical.gerenciarPlay(false);
        } else {
            System.out.println("Abra o aplicativo de ligações!");
        }
    }

    public void responderChamada() {
        if (reprodutorMusical.musicaTocando()) {
            reprodutorMusical.gerenciarPlay(true);
        }
        telefone.atenderTelefone(true);
        reprodutorMusical.gerenciarPlay(false);
    }

    public void escolherMusica() {
        if (reprodutorMusical.ligado()) {
            for (String musica : reprodutorMusical.musicasDisponiveis()) {
                System.out.println("Musicas disponivel: " + musica);
            }

            try (Scanner scanner = new Scanner(System.in)) {
                System.out.print("Nome da música para tocar: ");
                String musicaEscolhida = scanner.nextLine();
                reprodutorMusical.selecionarMusica(musicaEscolhida);
            }
        } else {
            System.out.println("Abra o aplicativo de músicas!");
        }
    }

    public void pausarMusica() {
        reprodutorMusical.gerenciarPlay(true);
    }

    public void abrirNavegador() {
        navegador.gerenciarAplicativo(true);
    }

    public void novaAba() {

        if (navegador.ligado()) {
            navegador.abrirNovaAba();
        } else {
            System.out.println("Abra o navegador!");
        }
    }

    public void atualizarPagina() {

        if (navegador.ligado()) {
            navegador.atualizarPagina();
        } else {
            System.out.println("Abra o navegador!");
        }
    }

}