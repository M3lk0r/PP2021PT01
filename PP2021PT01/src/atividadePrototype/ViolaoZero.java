package atividadePrototype;

public class ViolaoZero extends ViolaoPrototype {

    protected ViolaoZero(ViolaoZero violaoZero) {
        this.valorVenda = violaoZero.getValorVenda();
    }

    public ViolaoZero() {
    }

    @Override
    public String exibirInfo() {
        System.out.println("Categorizado como Parlor,"
                + " com estruturas menores e sendo mais indicado para uso casual e não tanto profissional."
                + " O violão zero possui uma estrutura confortavel para tocar por bastante tempo.\n"
                + "Valor: R$" + getValorVenda());
        return null;
    }

    @Override
    public ViolaoPrototype clonar() {
        return new ViolaoZero(this);
    }

}
