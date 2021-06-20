package atividadePrototype;

public class Violao7Cordas extends ViolaoPrototype {

    protected Violao7Cordas(Violao7Cordas violao7Cordas) {
        this.valorVenda = violao7Cordas.getValorVenda();
    }

    public Violao7Cordas() {
        //valorVenda = 0;
    }

    @Override
    public String exibirInfo() {
        System.out.println("Viol�o 7 cordas: Conhecido como o viol�o brasileiro,"
                + " j� que � indicado para acompanhar g�neros como o choro e o samba,"
                + " esse tipo de viol�o n�o apresenta diferen�as na sua estrutura quando comparado ao viol�o cl�ssico."
                + " Por�m seu diferencial est� na s�tima corda, que costuma ser afinada de maneira mais grave que as outras seis."
                + " Isso exige um conhecimento do m�sico que for toc�-lo.\n"
                + "Valor: R$" + getValorVenda());
        return null;
    }

    @Override
    public ViolaoPrototype clonar() {
        return new Violao7Cordas(this);
    }

}
