package atividadePrototype;

public class ViolaoClassico extends ViolaoPrototype {

    protected ViolaoClassico(ViolaoClassico violaoClassico) {
        this.valorVenda = violaoClassico.getValorVenda();
    }

    public ViolaoClassico() {
    }

    @Override
    public String exibirInfo() {
        System.out.println("O violão classico é um modelo acustico e funciona com seis cordas"
                + " (na maioria das vezes, feitas de nylon)."
                + " Possui um custo mais baixo quando comparado aos outros tipos."
                + " é indicado para iniciantes graças a sua leveza e maciez.\n"
                + "Valor: R$" + getValorVenda());
        return null;
    }

    @Override
    public ViolaoPrototype clonar() {
        return new ViolaoClassico(this);
    }

}
