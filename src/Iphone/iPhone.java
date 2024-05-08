package Main;

import Interface.AparelhoTelefonico;
import Interface.NavegadorInternet;
import Interface.ReprodutorMusical;

public class iPhone {
    private String modelo;
    private String cor;
    private int capacidadeArmazenamento;

    public iPhone(String modelo, String cor, int capacidadeArmazenamento) {
        this.modelo = modelo;
        this.cor = cor;
        this.capacidadeArmazenamento = capacidadeArmazenamento;
    }

    public void ligar() {
        System.out.println("iPhone ligado.");
    }

    public void desligar() {
        System.out.println("iPhone desligado.");
    }

    public class ReprodutorMusicalImpl implements ReprodutorMusical {
        @Override
        public void tocar() {

        }

        @Override
        public void pausar() {

        }

        @Override
        public void selecionarMusica(String musica) {

        }
        // Implementação da interface ReprodutorMusical
    }

    public class AparelhoTelefonicoImpl implements AparelhoTelefonico {
        @Override
        public void ligarPara(String numero) {
            System.out.println("Ligando para: " + numero);
        }

        @Override
        public void atenderChamada() {
            System.out.println("Chamada atendida.");
        }

        @Override
        public void iniciarGravacaoVoz() {
            System.out.println("Iniciando gravação de voz.");
        }
    }

    public class NavegadorInternetImpl implements NavegadorInternet {
        @Override
        public void exibirPagina(String url) {

        }

        @Override
        public void adicionarNovaAba(String url) {

        }

        @Override
        public void atualizarPagina() {

        }
        // Implementação da interface NavegadorInternet
    }
}