package br.com.dio.desafio;

public class Main {
    public static void main(String[] args) {
        iPhone meuIphone = new iPhone();

        // Testando funcionalidades do ReprodutorMusical
        meuIphone.tocar();
        meuIphone.selecionarMusica("Imagine - John Lennon");
        meuIphone.pausar();

        // Testando funcionalidades do AparelhoTelefonico
        meuIphone.ligar("123-456-7890");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        // Testando funcionalidades do NavegadorInternet
        meuIphone.exibirPagina("www.google.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();

        // Testando o aumento e diminuição de volume
        meuIphone.aumentarVolume();
        meuIphone.diminuirVolume();

        // Testando o encerramento da chamada e exibição das chamadas recentes
        meuIphone.encerrarChamada();
        meuIphone.mostrarChamadasRecentes();

    }
}