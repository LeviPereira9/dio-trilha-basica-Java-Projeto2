public class Telefone {
    private Aplicativo telefone = new Aplicativo("Telefone");

    public boolean ligado() {
        return telefone.getExecutando();
    }

    public void gerenciarAplicativo(boolean ligar) {
        telefone.setExecutando(ligar);
    }

    public void ligarParaContato() {
        System.out.println("Ligando");
    }

    public void atenderTelefone(boolean atender) {
        if (telefone.getExecutando()) {
            if (atender) {
                System.out.println("Atendeu.");
            } else {
                System.out.println("Não atendeu.");
            }
        }
    }

    public void iniciarCorreioDeVoz() {
        if (telefone.getExecutando()) {
            System.out.println("Correio de voz iniciado.");
        }
    }

}
