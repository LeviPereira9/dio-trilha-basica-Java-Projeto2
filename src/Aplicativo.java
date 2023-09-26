public class Aplicativo {
    private String nome;
    private boolean executando = false;

    public Aplicativo(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public boolean getExecutando() {
        return executando;
    }

    public void setExecutando(boolean executando) {
        this.executando = executando;
    }

}
