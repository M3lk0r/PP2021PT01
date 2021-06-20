package atividadePrototype;

public class ViolaoDuploZero extends ViolaoPrototype {

    protected ViolaoDuploZero(ViolaoDuploZero violaoDuploZero) {
        this.valorVenda = violaoDuploZero.getValorVenda();
    }

    public ViolaoDuploZero() {
    }

    @Override
    public String exibirInfo() {
        System.out.println("Categorizado como Parlor,"
                + " com estruturas menores e sendo mais indicado para uso casual e não tanto profissional."
                + " O violão duplo zero é um pouco maior que o violão zero,"
                + " apresentando uma boa sonoridade e sendo indicado para tocnicas de fingerstyle.\n"
                + "Valor: R$" + getValorVenda());
        return null;
    }

    @Override
    public ViolaoPrototype clonar() {
        return new ViolaoDuploZero(this);
    }

}
