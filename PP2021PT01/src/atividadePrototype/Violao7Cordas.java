package atividadePrototype;

public class Violao7Cordas extends ViolaoPrototype {

    protected Violao7Cordas(Violao7Cordas violao7Cordas) {
        this.valorVenda = violao7Cordas.getValorVenda();
    }

    public Violao7Cordas() {
    }

    @Override
    public String exibirInfo() {
        System.out.println("Violão 7 cordas: Conhecido como o violão brasileiro,"
                + " ja que e indicado para acompanhar generos como o choro e o samba,"
                + " esse tipo de violão não apresenta diferenças na sua estrutura quando comparado ao violão classico."
                + " Porem seu diferencial esta na setima corda, que costuma ser afinada de maneira mais grave que as outras seis."
                + " Isso exige um conhecimento do musico que for toca-lo.\n"
                + "Valor: R$" + getValorVenda());
        return null;
    }

    @Override
    public ViolaoPrototype clonar() {
        return new Violao7Cordas(this);
    }

}
