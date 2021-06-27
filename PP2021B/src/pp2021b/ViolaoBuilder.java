package pp2021b;

public class ViolaoBuilder {

    private String nome;
    private double preco;
    private String cor;
    private String tipoCorda;
    private double tamanhoBraco;
    private String tipoTarraxa;
    private String tipoMaterialCorpo;

    public ViolaoBuilder() {
    }

    public ViolaoBuilder preco(double preco) {
        this.preco = preco;
        return this;
    }

    public ViolaoBuilder cor(String cor) {
        this.cor = cor;
        return this;
    }

    public ViolaoBuilder tipoCorda(String tipoCorda) {
        this.tipoCorda = tipoCorda;
        return this;
    }

    public ViolaoBuilder tamanhoBraco(double tamanhoBraco) {
        this.tamanhoBraco = tamanhoBraco;
        return this;
    }

    public ViolaoBuilder tipoTarraxa(String tipoTarraxa) {
        this.tipoTarraxa = tipoTarraxa;
        return this;
    }

    public ViolaoBuilder tipoMaterialCorpo(String tipoMaterialCorpo) {
        this.tipoMaterialCorpo = tipoMaterialCorpo;
        return this;
    }
    
    public ViolaoBuilder nome(String nome) {
        this.nome = nome;
        return this;
    }

    public Violao createViolao() {
        return new Violao(preco, cor, tipoCorda, tamanhoBraco, tipoTarraxa, tipoMaterialCorpo, nome);
    }
    
}
