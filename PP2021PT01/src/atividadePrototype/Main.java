package atividadePrototype;

public class Main {

    public static void main(String[] args) {
        ViolaoClassico violaoClassico = new ViolaoClassico();
        ViolaoFolk violaoFolk = new ViolaoFolk();
        ViolaoFlet violaoFlet = new ViolaoFlet();
        ViolaoJumbo violaoJumbo = new ViolaoJumbo();
        Violao7Cordas violao7Cordas = new Violao7Cordas();
        Violao12Cordas violao12Cordas = new Violao12Cordas();
        ViolaoZero violaoZero = new ViolaoZero();
        ViolaoDuploZero violaoDuploZero = new ViolaoDuploZero();
        ViolaoTriploZero violaoTriploZero = new ViolaoTriploZero();

        ViolaoPrototype violaoClassicoNovo = violaoClassico.clonar();
        violaoClassicoNovo.setValorVenda(450.00);
        violaoClassicoNovo.exibirInfo();
        ViolaoPrototype violaoClassicoUsado = violaoClassico.clonar();
        violaoClassicoUsado.setValorVenda(200.00);
        violaoClassicoUsado.exibirInfo();
        
        ViolaoPrototype violaoFolkNovo = violaoFolk.clonar();
        violaoFolkNovo.setValorVenda(850.00);
        ViolaoPrototype violaoFolkUsado = violaoFolk.clonar();
        violaoFolkUsado.setValorVenda(500.00);
        violaoFolkNovo.exibirInfo();
        violaoFolkUsado.exibirInfo();

        ViolaoPrototype violaoFletNovo = violaoFlet.clonar();
        violaoFletNovo.setValorVenda(800.00);
        ViolaoPrototype violaoFletUsado = violaoFlet.clonar();
        violaoFletUsado.setValorVenda(400.00);
        violaoFletNovo.exibirInfo();
        violaoFletUsado.exibirInfo();

        ViolaoPrototype violaoJumboNovo = violaoJumbo.clonar();
        violaoJumboNovo.setValorVenda(1120.00);
        ViolaoPrototype violaoJumboUsado = violaoJumbo.clonar();
        violaoJumboUsado.setValorVenda(800.00);
        violaoJumboNovo.exibirInfo();
        violaoJumboUsado.exibirInfo();

        ViolaoPrototype violao7CordasNovo = violao7Cordas.clonar();
        violao7CordasNovo.setValorVenda(1200.00);
        ViolaoPrototype violao7CordasUsado = violao7Cordas.clonar();
        violao7CordasUsado.setValorVenda(800.00);
        violao7CordasNovo.exibirInfo();
        violao7CordasUsado.exibirInfo();

        ViolaoPrototype violao12CordasNovo = violao12Cordas.clonar();
        violao12CordasNovo.setValorVenda(1000.00);
        ViolaoPrototype violao12CordasUsado = violao12Cordas.clonar();
        violao12CordasUsado.setValorVenda(500.00);
        violao12CordasNovo.exibirInfo();
        violao12CordasUsado.exibirInfo();

        ViolaoPrototype violaoZeroNovo = violaoZero.clonar();
        violaoZeroNovo.setValorVenda(3000.00);
        ViolaoPrototype violaoZeroUsado = violaoZero.clonar();
        violaoZeroUsado.setValorVenda(1000.00);
        violaoZeroNovo.exibirInfo();
        violaoZeroUsado.exibirInfo();

        ViolaoPrototype violaoDuploZeroNovo = violaoDuploZero.clonar();
        violaoDuploZeroNovo.setValorVenda(4200.00);
        ViolaoPrototype violaoDuploZeroUsado = violaoDuploZero.clonar();
        violaoDuploZeroUsado.setValorVenda(2000.00);
        violaoDuploZeroNovo.exibirInfo();
        violaoDuploZeroUsado.exibirInfo();

        ViolaoPrototype violaoTriploZeroNovo = violaoTriploZero.clonar();
        violaoTriploZeroNovo.setValorVenda(5000.00);
        ViolaoPrototype violaoTriploZeroUsado = violaoTriploZero.clonar();
        violaoTriploZeroUsado.setValorVenda(3000.00);
        violaoTriploZeroNovo.exibirInfo();
        violaoTriploZeroUsado.exibirInfo();
        
    }

}
