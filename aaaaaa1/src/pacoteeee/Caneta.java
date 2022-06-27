package pacoteeee;

 //get pega ,acessess6res um atributao mantendo a segurança de acesso, não ode mecher
 //set moduificam coisdas que estao dentro do objeto, garantindo segurança do aributo

public class Caneta {
    public String modelo;
    public String cor;
    public double ponta;
    public boolean tampada;

    public  Caneta(String m, String c , double p) { //construtor tem o mesmo nome da classe
        this.modelo=m ;
        this.cor = c;
        this.ponta=p;
        this.tampar();
    }

    //getters e setters
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPonta() {
        return ponta;
    }

    public void setPonta(double ponta) {
        this.ponta = ponta;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    //metodos
    public void tampar() {
        this.tampada = true;
    }

    public void destapar() {
        this.tampada = false;
    }

    public void status() {
        System.out.println("Sobre a caneta");
        System.out.println("modelo: " + this.getModelo());
        System.out.println("ponta" + this.getPonta());
        System.out.println("cor:"+this.cor);
        System.out.println("tampada: "+tampada);
    }
}

























