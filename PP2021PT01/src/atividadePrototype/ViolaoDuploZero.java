package atividadePrototype;

public class ViolaoDuploZero extends ViolaoPrototype {

    protected ViolaoDuploZero(ViolaoDuploZero violaoDuploZero) {
        this.valorVenda = violaoDuploZero.getValorVenda();
    }

    public ViolaoDuploZero() {
        //valorVenda = 0;
    }

    @Override
    public String exibirInfo() {
        System.out.println("Categorizado como Parlor,"
                + " com estruturas menores e sendo mais indicado para uso casual e n�o tanto profissional."
                + " O viol�o duplo zero � um pouco maior que o viol�o zero,"
                + " apresentando uma boa sonoridade e sendo indicado para t�cnicas de fingerstyle.\n"
                + "Valor: R$" + getValorVenda());
        return null;
    }

    @Override
    public ViolaoPrototype clonar() {
        return new ViolaoDuploZero(this);
    }

}
