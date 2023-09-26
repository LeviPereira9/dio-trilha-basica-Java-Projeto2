public class Navegador {
    Aplicativo navegador = new Aplicativo("Chrome");

    public boolean ligado() {
        return navegador.getExecutando();
    }

    public void gerenciarAplicativo(boolean ligar) {
        navegador.setExecutando(ligar);
        System.out.println("Página aberta.");
    }

    public void abrirNovaAba() {
        if (navegador.getExecutando()) {
            System.out.println("Nova aba aberta");
        }
    }

    public void atualizarPagina() {
        if (navegador.getExecutando()) {
            System.out.println("Página atualizada");
        }
    }
}
