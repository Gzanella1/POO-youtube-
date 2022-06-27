package contas;
//conta pouança conta corente
//status aberto ou fechado
//conta corrente 50 poupança 150
//fechar conta tem que ta zerada e noa pode estar negativada
//depositar status verdadeiro
//sacar "                    "
//menslidade
//cc 12 mensalidade
//cp  20
    public class ContaBanco{
    //ATRIBUTOS
    public int numeConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private   boolean status;

    //METODOS
    public void abrirConta(String t){
        setTipo(t);
        setStatus(true);
        if(t == "CC"){
            saldo=50;
        }else if(t=="CP"){
            saldo=150;
        }else{
            System.out.println("conta invalida");
        }
    }
    public void fecharConta(){
        if(saldo> 0){
            System.out.println("conta com dinheiro");
        }else if(saldo <0 ){
            System.out.println("conta negativada");
        }else{
            setStatus(false);
        }
    }
    public void depositar(double v){
    if(status= true){
    setSaldo(getSaldo()+v);
    }else {
    System.out.println("ivalido deositar");
    }
    }
    public void sacar(double v){
    if(isStatus()==true ){
        if(getSaldo()>v){
            setSaldo(getSaldo()-v);
        }else{
            System.out.println("imossivel sacar");
        }
    }

    }public void pagarMensal(){
    double v;
    if(getTipo() == "CC"){
        v =12;
    }else {
        v=20;
    }if (isStatus()== true){
        if(getSaldo() >v ){
            setSaldo(getSaldo()-v);
            //saldo=saldo -v
        }else{
            System.out.println("saldo insuficiente");
        }
    }else{
            System.out.println("imossivel pagar");

    }
    }

    //Metodos especiais (CONSRUTOR)
    public void ContaBanco(){
        saldo=0;
        status=false;
    }


    //Metodos esecias (GETTER E SETTERS)
    public int getNumeConta() {
        return numeConta;
    }

    public void setNumeConta(int numeConta) {
        this.numeConta = numeConta;
        
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
