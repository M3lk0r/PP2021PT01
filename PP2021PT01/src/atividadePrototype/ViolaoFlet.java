package atividadePrototype;

public class ViolaoFlet extends ViolaoPrototype {

    protected ViolaoFlet(ViolaoFlet violaoFlet) {
        this.valorVenda = violaoFlet.getValorVenda();
    }

    public ViolaoFlet() {
    }

    @Override
    public String exibirInfo() {
        System.out.println("A palavra flat, do ingles, pode significar 'plano' ou 'liso'."
                + " É justamente essa a principal caracteristica desse tipo de violão:"
                + " sua caixa acustica é bastante fina! O violão flet é muito utilizado por musicos profissionais"
                + " e na maioria dos casos é tocado com cordas de nylon."
                + " O timbre gerado por esse tipo de violão é mais suave."
                + " Por ser encontrado quase sempre em modelos eletricos, precisa de amplificação.\n"
                + "Valor: R$" + getValorVenda());
        return null;
    }

    @Override
    public ViolaoPrototype clonar() {
        return new ViolaoFlet(this);
    }

}
