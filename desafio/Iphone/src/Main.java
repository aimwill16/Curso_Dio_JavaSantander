import funcoes.AparelhoTelefonico;
import funcoes.Navegador;
import funcoes.ReprodutorMusical;
import funcoes.iphone;

public class Main {
    public static void main(String[] args) {
        AparelhoTelefonico call = new iphone();
        Navegador safari = new iphone();
        ReprodutorMusical ipod = new iphone();

        safari.atualizarPagina();
        ipod.selecionaMusica();
        call.atender();
    }
}
