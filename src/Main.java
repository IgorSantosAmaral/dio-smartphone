import dispositivo.Iphone;

public class Main{
    public static void main(String[] args) {

        Iphone dispositivo = new Iphone();

        // Testando ReprodutorMusical
        dispositivo.selecionarMusica("Só Fé");
        dispositivo.tocar();
        dispositivo.pausar();

        System.out.println("-----------------");

        // Testando AparelhoTelefonico
        dispositivo.ligar("123456789");
        dispositivo.atender();
        dispositivo.iniciarCorreioVoz();

        System.out.println("-----------------");

        // Testando NavegadorInternet
        dispositivo.exibirPagina("https://github.com/IgorSantosAmaral");
        dispositivo.adicionarNovaAba();
        dispositivo.atualizarPagina();
    }
}