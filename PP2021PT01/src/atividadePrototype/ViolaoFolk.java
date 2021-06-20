package atividadePrototype;

public class ViolaoFolk extends ViolaoPrototype {

    protected ViolaoFolk(ViolaoFolk violaoFolk) {
        this.valorVenda = violaoFolk.getValorVenda();
    }

    public ViolaoFolk() {
    }

    @Override
    public String exibirInfo() {
        System.out.println("Com o corpo maior e mais 'acinturado', os violões do tipo folk são bastante populares entre os musicos."
                + " A maioria dos modelos desse tipo de violão funciona com a utilização de cordas de aço,"
                + " podendo ser eletricos ou eletroacusticos. Esse tipo de violão é o mais indicado para generos como pop e rock,"
                + " ja que gera um som mais encorpado, com timbre diferenciado.\n"
                + "Valor: R$" + getValorVenda());
        return null;
    }

    @Override
    public ViolaoPrototype clonar() {
        return new ViolaoFolk(this);
    }

}
