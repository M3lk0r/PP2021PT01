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
        System.out.println("O viol�o jumbo ficou famoso nas m�os de Elvis Presley,"
                + " mas, apesar de ser bem parecido com o tipo cl�ssico,"
                + " a grande diferen�a est� em seu corpo mais largo e na base mais arredondada."
                + " � mais f�cil de encontrar modelos eletroac�sticos e com cordas de a�o."
                + " O som gerado pelo viol�o jumbo � mais grave e encorpado.\n"
                + "Valor: R$" + getValorVenda());
        return null;
    }

    @Override
    public ViolaoPrototype clonar() {
        return new ViolaoJumbo(this);
    }

}
