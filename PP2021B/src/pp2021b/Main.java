package pp2021b;

public class Main {
    public static void main(String[] args) {
        Violao violaoClassico = new ViolaoClassico()
                .nome("Clássico")
                .preco(400.0)
                .cor("Preto")
                .tipoCorda("Nilon")
                .createViolao();
        
        System.out.println(violaoClassico);
        
        Violao violaoFolk = new ViolaoFolk()
                .nome("Folk")
                .preco(850.0)
                .cor("Branco")
                .createViolao();
        
        System.out.println(violaoFolk);
        
        Violao violaoFlet = new ViolaoFlet()
                .nome("Flet")
                .preco(900.0)
                .cor("Amarelo")
                .createViolao();
        
        System.out.println(violaoFlet);
        
        Violao violaoJumbo = new ViolaoJumbo()
                .nome("Jumbo")
                .preco(1300.0)
                .cor("Preto")
                .createViolao();
        
        System.out.println(violaoJumbo);
        
        Violao violao7Cordas = new Violao7Cordas()
                .nome("7 Cordas")
                .preco(1200.0)
                .cor("Amarelo")
                .createViolao();
        
        System.out.println(violao7Cordas);
        
        Violao violao12Cordas = new Violao12Cordas()
                .nome("12 Cordas")
                .preco(1000.0)
                .cor("Branco")
                .createViolao();
        
        System.out.println(violao12Cordas);
        
        Violao violaoZero = new ViolaoZero()
                .nome("Zero")
                .preco(800.0)
                .cor("Vermelho")
                .createViolao();
        
        System.out.println(violaoZero);
        
        Violao violaoDuploZero = new ViolaoDuploZero()
                .nome("Duplo Zero")
                .preco(900.0)
                .cor("Azul")
                .createViolao();
        
        System.out.println(violaoDuploZero);
        
        Violao violaoTriploZero = new ViolaoTriploZero()
                .nome("Triplo Zero")
                .preco(1000.0)
                .cor("Marrom")
                .createViolao();
        
        System.out.println(violaoTriploZero);
    }
}
