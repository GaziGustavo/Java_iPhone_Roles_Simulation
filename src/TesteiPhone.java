import Iphone.iPhone;

public class TesteiPhone {
    public static void main(String[] args) {
        // Criando uma instância de iPhone
        iPhone meuiPhone = new iPhone("iPhone 12", "Preto", 256);

        // Ligando o iPhone
        meuiPhone.ligar();

        // Utilizando o Reprodutor Musical
        iPhone.ReprodutorMusicalImpl reprodutor = meuiPhone.new ReprodutorMusicalImpl();
        reprodutor.tocar();
        reprodutor.selecionarMusica("Nome da Música");
        reprodutor.pausar();

        // Utilizando o Aparelho Telefônico
        iPhone.AparelhoTelefonicoImpl telefone = meuiPhone.new AparelhoTelefonicoImpl();
        telefone.ligarPara("123456789");
        telefone.atenderChamada();
        telefone.iniciarGravacaoVoz();

        // Utilizando o Navegador na Internet
        iPhone.NavegadorInternetImpl navegador = meuiPhone.new NavegadorInternetImpl();
        navegador.exibirPagina("www.dio.me");
        navegador.adicionarNovaAba("www.google.com");
        navegador.atualizarPagina();

        // Desligando o iPhone
        meuiPhone.desligar();
    }
}