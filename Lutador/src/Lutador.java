import java.util.Scanner;

public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private double peso;
    private String categoria;
    private int vitorias;
    private int derotas;
    private int empates;

    public Lutador() {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o nome do lutador: ");
        setNome(in.nextLine());
        System.out.println("Digite peso:");
        setPeso(in.nextDouble());
        in.nextLine();
        System.out.println("digite a idade: ");
        setIdade(in.nextInt());

    }
    //METODOS
    public void apresentar() {
        System.out.println();
        System.out.println("nome:"+getNome());
        System.out.println("nacionalidade: "+getNacionalidade());
        System.out.println("idade: "+getIdade());
        System.out.println("vitorias:"+getVitorias());
        System.out.println("emate: "+getEmpates());
        System.out.println("derotas: "+getDerotas());
        System.out.println("categoria: "+getCategoria());
    }
    public void ganharLuta() {
        setVitorias(getVitorias() + 1);
    }
    public void empatarLuta() {
        setEmpates(getEmpates() + 1);
    }
    public void perderLuta() {
        setVitorias(getVitorias() - 1);
    }




    //GETTER(LEVAR/pEGA O VALOR) E SETTER(MODIFICA )
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
        this.setCategoria();
    }
    public String getCategoria() {
        return categoria;

    }
    public void setCategoria() {
        if (getPeso() <= 52) {
            this.categoria="Invalido";
        } else if (getPeso() >= 52.1 && getPeso() <= 70.3) {
            this.categoria="Leve";
        } else if (getPeso() > 70.3 && getPeso() <= 83.3) {
            this.categoria="Medio";
        } else if(getPeso() > 83.3 ) {
            this.categoria= "pesado";
        }else{
            this.categoria="Invalido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerotas() {
        return derotas;
    }

    public void setDerotas(int derotas) {
        this.derotas = derotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }







    /*

     */

}

