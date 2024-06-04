package Sistema_Iphone;

public class Main {
    public static void main(String[] args) {
        iPhone iphone = new iPhone();

        System.out.println("Testando o iPhone...");

        iphone.tocarMusica();
        iphone.pausarMusica();
        iphone.selecionarMusica();

        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioVoz();

        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}