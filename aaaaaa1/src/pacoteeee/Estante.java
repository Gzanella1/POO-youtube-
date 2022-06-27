package pacoteeee;

public class Estante {
    private String gavetas;
    private String partileiras;
    private int numerodePortas;

    public Estante() {
        this.gavetas = "a";
        this.partileiras = "b";
    }
    public void estatus(){
        System.out.println("gavetas: "+getGavetas());
        System.out.println("partileoiras: "+getPartileiras());
    }
    //GER E SET
    public String getGavetas() {
        return gavetas;
    }

    public void setGavetas(String gavetas) {
        this.gavetas = gavetas;
    }

    public String getPartileiras() {
        return partileiras;
    }

    public void setPartileiras(String partileiras) {
        this.partileiras = partileiras;
    }

    public int getNumerodePortas() {
        return numerodePortas;
    }

    public void setNumerodePortas(int numerodePortas) {
        this.numerodePortas = numerodePortas;
    }
}
