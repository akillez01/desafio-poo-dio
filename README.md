# Desafio de POO - Modelagem do iPhone

Este projeto é parte da trilha de Java Básico da [Digital Innovation One (DIO)](https://www.dio.me) e tem como objetivo aplicar conceitos de Programação Orientada a Objetos (POO) em Java. A proposta consiste na modelagem e implementação das funcionalidades de um iPhone, organizadas em três interfaces: `ReprodutorMusical`, `AparelhoTelefonico`, e `NavegadorInternet`. 

### Funcionalidades

1. **Reprodutor Musical**
   - `tocar()`: Inicia a reprodução de uma música.
   - `pausar()`: Pausa a música em execução.
   - `selecionarMusica(String musica)`: Seleciona uma música para tocar.
   - `aumentarVolume()`: Aumenta o volume da música.
   - `diminuirVolume()`: Diminui o volume da música.
   - `estaTocando()`: Verifica se uma música está em execução.

2. **Aparelho Telefônico**
   - `ligar(String numero)`: Faz uma ligação para o número especificado.
   - `atender()`: Atende uma chamada recebida.
   - `iniciarCorreioVoz()`: Inicia o correio de voz.
   - `encerrarChamada()`: Encerra uma chamada ativa.
   - `mostrarChamadasRecentes()`: Exibe uma lista das últimas chamadas.

3. **Navegador na Internet**
   - `exibirPagina(String url)`: Exibe uma página da web.
   - `adicionarNovaAba()`: Adiciona uma nova aba de navegação.
   - `atualizarPagina()`: Atualiza a página atual.
   - `fecharAba()`: Fecha a aba atual.
   - `exibirAbasAbertas()`: Mostra todas as abas abertas.

### Estrutura do Projeto

O projeto está organizado em diferentes classes e interfaces, cada uma responsável por uma funcionalidade específica do iPhone.

### Diagrama UML

O diagrama abaixo representa a estrutura das classes e interfaces deste projeto.

```mermaid
classDiagram
    class ReprodutorMusical {
        +tocar()
        +pausar()
        +selecionarMusica(String musica)
        +aumentarVolume()
        +diminuirVolume()
        +estaTocando() boolean
    }

    class AparelhoTelefonico {
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
        +encerrarChamada()
        +mostrarChamadasRecentes()
    }

    class NavegadorInternet {
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
        +fecharAba()
        +exibirAbasAbertas()
    }

    class iPhone {
    }

    iPhone ..|> ReprodutorMusical
    iPhone ..|> AparelhoTelefonico
    iPhone ..|> NavegadorInternet
