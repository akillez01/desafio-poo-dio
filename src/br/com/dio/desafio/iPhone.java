package br.com.dio.desafio;

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    // Métodos da interface ReprodutorMusical
    @Override
    public void tocar() {
        System.out.println("Reproduzindo música.");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando uma música: " + musica);
    }

    // Métodos da interface AparelhoTelefonico
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o número: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz.");
    }

    @Override
    public void encerrarChamada() {

    }

    @Override
    public void mostrarChamadasRecentes() {

    }

    // Métodos de interface NavegadorInternet
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
        System.out.println("Atualizando página.");
    }

    @Override
    public void fecharAba() {

    }

    @Override
    public void exibirAbasAbertas() {

    }

    @Override
    public void aumentarVolume() {
        System.out.println("Aumentando volume.");
    }

    @Override
    public void diminuirVolume() {
        System.out.println("Diminuindo volume.");
    }

    @Override
    public boolean estaTocando() {
        System.out.println("Verificando se está tocando.");
        return true;
    }

}
