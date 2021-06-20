package atividadePrototype;

public class ViolaoTriploZero extends ViolaoPrototype {

    protected ViolaoTriploZero(ViolaoTriploZero violaoTriploZero) {
        this.valorVenda = violaoTriploZero.getValorVenda();
    }

    public ViolaoTriploZero() {
    }

    @Override
    public String exibirInfo() {
        System.out.println("Categorizado como Parlor,"
                + " com estruturas menores e sendo mais indicado para uso casual e não tanto profissional."
                + " O triplo zero possui tamanho intermediario (em relação aos violões zero e duplor zero)"
                + " e gera um timbre mais peculiar.\n"
                + "Valor: R$" + getValorVenda());
        return null;
    }

    @Override
    public ViolaoPrototype clonar() {
        return new ViolaoTriploZero(this);
    }

}
