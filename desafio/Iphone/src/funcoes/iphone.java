package funcoes;

public class iphone implements AparelhoTelefonico, Navegador, ReprodutorMusical {

    @Override
    public void ligar() {
        System.out.println("Ligando");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Ligando para correio de voz");
    }

    @Override
    public void exbirPagina() {
        System.out.println("Exibindo pagina");
    }

    @Override
    public void adicionarAba() {
        System.out.println("Adicionando outra aba no navegador");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando musica");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando musica");
    }

    @Override
    public void selecionaMusica() {
        System.out.println("Selecionando musica");
    }
}

