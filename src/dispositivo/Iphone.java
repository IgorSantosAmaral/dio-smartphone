package dispositivo;

import dispositivo.funcionalidades.AparelhoTelefonico;
import dispositivo.funcionalidades.NavegadorInternet;
import dispositivo.funcionalidades.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {


    // ReprodutorMusical
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero + "...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio de Voz...");
    }

    // NavegadorInternet
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página do navegador atualizada.");
    }

    // AparelhoTelefonico
    @Override
    public void tocar() {
        System.out.println("Reprodutor musical tocando...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando reprodutor musical...");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada: " + musica);
    }
}
