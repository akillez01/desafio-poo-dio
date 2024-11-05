package br.com.dio.desafio;

public interface ReprodutorMusical {
    void tocar();
    void pausar();
    void selecionarMusica(String musica);
    void aumentarVolume();
    void diminuirVolume();
    boolean estaTocando();

}
