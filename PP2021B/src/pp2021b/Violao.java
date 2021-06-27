package pp2021b;

public class Violao {
    private String nome;
    private double preco;
    private String cor;
    private String tipoCorda;
    private double tamanhoBraco;
    private String tipoTarraxa;
    private String tipoMaterialCorpo;

    protected Violao(double preco, String cor, String tipoCorda, double tamanhoBraco, String tipoTarraxa, String tipoMaterialCorpo, String nome) {
        this.preco = preco;
        this.cor = cor;
        this.tipoCorda = tipoCorda;
        this.tamanhoBraco = tamanhoBraco;
        this.tipoTarraxa = tipoTarraxa;
        this.tipoMaterialCorpo = tipoMaterialCorpo;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Violao "+ nome +" {" + "preco=" + preco + ", cor=" + cor + ", tipoCorda=" + tipoCorda + ", tamanhoBraco=" + tamanhoBraco + ", tipoTarraxa=" + tipoTarraxa + ", tipoMaterialCorpo=" + tipoMaterialCorpo + '}';
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipoCorda() {
        return tipoCorda;
    }

    public void setTipoCorda(String tipoCorda) {
        this.tipoCorda = tipoCorda;
    }

    public double getTamanhoBraco() {
        return tamanhoBraco;
    }

    public void setTamanhoBraco(double tamanhoBraco) {
        this.tamanhoBraco = tamanhoBraco;
    }

    public String getTipoTarraxa() {
        return tipoTarraxa;
    }

    public void setTipoTarraxa(String tipoTarraxa) {
        this.tipoTarraxa = tipoTarraxa;
    }

    public String getTipoMaterialCorpo() {
        return tipoMaterialCorpo;
    }

    public void setTipoMaterialCorpo(String tipoMaterialCorpo) {
        this.tipoMaterialCorpo = tipoMaterialCorpo;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
