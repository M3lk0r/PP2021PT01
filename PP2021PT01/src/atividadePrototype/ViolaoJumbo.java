package atividadePrototype;

public class ViolaoJumbo extends ViolaoPrototype {

    protected ViolaoJumbo(ViolaoJumbo violaoJumbo) {
        this.valorVenda = violaoJumbo.getValorVenda();
    }

    public ViolaoJumbo() {
        //valorVenda = 0;
    }

    @Override
    public String exibirInfo() {
        System.out.println("O violão jumbo ficou famoso nas mãos de Elvis Presley,"
                + " mas, apesar de ser bem parecido com o tipo classico,"
                + " a grande diferença esta em seu corpo mais largo e na base mais arredondada."
                + " é mais facil de encontrar modelos eletroacusticos e com cordas de aço."
                + " O som gerado pelo violão jumbo é mais grave e encorpado.\n"
                + "Valor: R$" + getValorVenda());
        return null;
    }

    @Override
    public ViolaoPrototype clonar() {
        return new ViolaoJumbo(this);
    }

}
