package atividadePrototype;

public class ViolaoClassico extends ViolaoPrototype {

    protected ViolaoClassico(ViolaoClassico violaoClassico) {
        this.valorVenda = violaoClassico.getValorVenda();
    }

    public ViolaoClassico() {
        //valorVenda = 0;
    }

    @Override
    public String exibirInfo() {
        System.out.println("O viol�o cl�ssico � um modelo ac�stico e funciona com seis cordas"
                + " (na maioria das vezes, feitas de nylon)."
                + " Possui um custo mais baixo quando comparado aos outros tipos."
                + " � indicado para iniciantes gra�as � sua leveza e maciez.\n"
                + "Valor: R$" + getValorVenda());
        return null;
    }

    @Override
    public ViolaoPrototype clonar() {
        return new ViolaoClassico(this);
    }

}
