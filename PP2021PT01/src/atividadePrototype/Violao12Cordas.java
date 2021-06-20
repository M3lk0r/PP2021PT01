package atividadePrototype;

public class Violao12Cordas extends ViolaoPrototype {

    protected Violao12Cordas(Violao12Cordas violao12Cordas) {
        this.valorVenda = violao12Cordas.getValorVenda();
    }

    public Violao12Cordas() {
    }

    @Override
    public String exibirInfo() {
        System.out.println("O violão 12 cordas traz o dobro de cordas do que o classico."
                + " Essas são agrupadas em duplas (metade delas afinadas com uma oitava acima)."
                + " Esse tipo apresenta ressonancia plena e exige tecnica e pratica para poder pressionar duas cordas simultaneamente.\n"
                + "Valor: R$" + getValorVenda());
        return null;
    }

    @Override
    public ViolaoPrototype clonar() {
        return new Violao12Cordas(this);
    }

}
