package atividadePrototype;

public class Violao12Cordas extends ViolaoPrototype {

    protected Violao12Cordas(Violao12Cordas violao12Cordas) {
        this.valorVenda = violao12Cordas.getValorVenda();
    }

    public Violao12Cordas() {
        //valorVenda = 0;
    }

    @Override
    public String exibirInfo() {
        System.out.println("O viol�o 12 cordas traz o dobro de cordas do que o cl�ssico."
                + " Essas s�o agrupadas em duplas (metade delas afinadas com uma oitava acima)."
                + " Esse tipo apresenta resson�ncia plena e exige t�cnica e pr�tica para poder pressionar duas cordas simultaneamente.\n"
                + "Valor: R$" + getValorVenda());
        return null;
    }

    @Override
    public ViolaoPrototype clonar() {
        return new Violao12Cordas(this);
    }

}
