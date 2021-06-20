package atividadePrototype;

public class ViolaoFlet extends ViolaoPrototype {

    protected ViolaoFlet(ViolaoFlet violaoFlet) {
        this.valorVenda = violaoFlet.getValorVenda();
    }

    public ViolaoFlet() {
        //valorVenda = 0;
    }

    @Override
    public String exibirInfo() {
        System.out.println("A palavra flat, do ingl�s, pode significar �plano� ou �liso�."
                + " � justamente essa a principal caracter�stica desse tipo de viol�o:"
                + " sua caixa ac�stica � bastante fina! O viol�o flet � muito utilizado por m�sicos profissionais"
                + " e na maioria dos casos � tocado com cordas de nylon."
                + " O timbre gerado por esse tipo de viol�o � mais suave."
                + " Por ser encontrado quase sempre em modelos el�tricos, precisa de amplifica��o.\n"
                + "Valor: R$" + getValorVenda());
        return null;
    }

    @Override
    public ViolaoPrototype clonar() {
        return new ViolaoFlet(this);
    }

}
