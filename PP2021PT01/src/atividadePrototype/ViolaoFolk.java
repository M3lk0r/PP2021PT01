package atividadePrototype;

public class ViolaoFolk extends ViolaoPrototype {

    protected ViolaoFolk(ViolaoFolk violaoFolk) {
        this.valorVenda = violaoFolk.getValorVenda();
    }

    public ViolaoFolk() {
        //valorVenda = 0;
    }

    @Override
    public String exibirInfo() {
        System.out.println("Com o corpo maior e mais �acinturado�, os viol�es do tipo folk s�o bastante populares entre os m�sicos."
                + " A maioria dos modelos desse tipo de viol�o funciona com a utiliza��o de cordas de a�o,"
                + " podendo ser el�tricos ou eletroac�sticos. Esse tipo de viol�o � o mais indicado para g�neros como pop e rock,"
                + " j� que gera um som mais encorpado, com timbre diferenciado.\n"
                + "Valor: R$" + getValorVenda());
        return null;
    }

    @Override
    public ViolaoPrototype clonar() {
        return new ViolaoFolk(this);
    }

}
