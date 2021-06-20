package atividadePrototype;

public class ViolaoZero extends ViolaoPrototype {

    protected ViolaoZero(ViolaoZero violaoZero) {
        this.valorVenda = violaoZero.getValorVenda();
    }

    public ViolaoZero() {
        //valorVenda = 0;
    }

    @Override
    public String exibirInfo() {
        System.out.println("Categorizado como Parlor,"
                + " com estruturas menores e sendo mais indicado para uso casual e n�o tanto profissional."
                + " O viol�o zero possui uma estrutura confort�vel para tocar por bastante tempo.\n"
                + "Valor: R$" + getValorVenda());
        return null;
    }

    @Override
    public ViolaoPrototype clonar() {
        return new ViolaoZero(this);
    }

}
