package Sistema_Iphone;

public class iPhone {
    private Reprodutor reprodutorMusical;
    private Telefone aparelhoTelefonico;
    private Navegador navegadorInternet;

    public iPhone() {
        this.reprodutorMusical = new Reprodutor();
        this.aparelhoTelefonico = new Telefone();
        this.navegadorInternet = new Navegador();
    }

    public void tocarMusica() {
        reprodutorMusical.tocarMusica();
    }

    public void pausarMusica() {
        reprodutorMusical.pausarMusica();
    }

    public void selecionarMusica() {
        reprodutorMusical.selecionarMusica();
    }

    public void ligar() {
        aparelhoTelefonico.ligar();
    }

    public void atender() {
        aparelhoTelefonico.atender();
    }

    public void iniciarCorreioVoz() {
        aparelhoTelefonico.iniciarCorreioVoz();
    }

    public void exibirPagina() {
        navegadorInternet.exibirPagina();
    }

    public void adicionarNovaAba() {
        navegadorInternet.adicionarNovaAba();
    }

    public void atualizarPagina() {
        navegadorInternet.atualizarPagina();
    }
}