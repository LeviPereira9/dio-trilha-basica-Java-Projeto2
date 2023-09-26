
public class ReprodutorMusical {
    private Aplicativo reprodutorMusical = new Aplicativo("Spotify");
    private String[] listaMusicas = { "Mamonas Assasinas", "Aquarela", "Trem bala", "Forte Forte de Lacoste" };
    private String musicaSelecionada;
    private boolean musicaPlay;

    public boolean ligado() {
        return reprodutorMusical.getExecutando();
    }

    public boolean musicaTocando() {
        return musicaPlay;
    }

    public String[] musicasDisponiveis() {
        return listaMusicas;
    }

    public void gerenciarAplicativo(boolean ligar) {
        reprodutorMusical.setExecutando(ligar);
    }

    public void selecionarMusica(String nome) {

        if (reprodutorMusical.getExecutando()) {
            for (String musica : listaMusicas) {
                if (musica.equalsIgnoreCase(nome)) {
                    this.musicaSelecionada = nome;
                    break;
                }
            }

            if (musicaSelecionada.isEmpty()) {
                System.out.println("Música não encontrada");
            } else {
                gerenciarPlay(true);
            }
        }

    }

    public void gerenciarPlay(boolean play) {
        this.musicaPlay = play;
        if (reprodutorMusical.getExecutando()) {
            if (!this.musicaPlay) {
                System.out.printf("Música %s foi pausada\n", this.musicaSelecionada);
            } else {
                System.out.printf("Música %s está sendo reproduzida\n", this.musicaSelecionada);
            }
        }
    }

}
