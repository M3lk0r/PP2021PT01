package atividadePrototype;

public class ViolaoTriploZero extends ViolaoPrototype {

    protected ViolaoTriploZero(ViolaoTriploZero violaoTriploZero) {
        this.valorVenda = violaoTriploZero.getValorVenda();
    }

    public ViolaoTriploZero() {
        //valorVenda = 0;
    }

    @Override
    public String exibirInfo() {
        System.out.println("Categorizado como Parlor,"
                + " com estruturas menores e sendo mais indicado para uso casual e n�o tanto profissional."
                + " O triplo zero possui tamanho intermedi�rio (em rela��o aos viol�es zero e duplor zero)"
                + " e gera um timbre mais peculiar.\n"
                + "Valor: R$" + getValorVenda());
        return null;
    }

    @Override
    public ViolaoPrototype clonar() {
        return new ViolaoTriploZero(this);
    }

}
