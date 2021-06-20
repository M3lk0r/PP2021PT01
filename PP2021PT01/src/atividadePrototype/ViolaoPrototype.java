package atividadePrototype;

public abstract class ViolaoPrototype {

    protected double valorVenda;

    public abstract String exibirInfo();

    public abstract ViolaoPrototype clonar();

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valor) {
        this.valorVenda = valor;
    }
}
