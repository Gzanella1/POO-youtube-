package luta;

import java.util.Scanner;

public class Luta {
    private Lutador desafinte;
    private Lutador desafiado;
    private boolean aprovado;
    private int rounds;

    //METODOS
    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria() == l2.getCategoria()) {
            if (l1 != l2) {
                setAprovado(true);
               setDesafiado(l1);
              setDesafinte(l2);
            }
        } else {
            setAprovado(false);
            setDesafiado(null);
            setDesafinte(null);
        }
    }

    public void lutar() {

        Scanner in=new Scanner(System.in);
        if (this.aprovado == true) {
            getDesafiado().apresentar();
            getDesafinte().apresentar();
            System.out.println("vencedor");
            int escolha=in.nextInt();
            switch (escolha){
                case 0:
                    System.out.println("emate");
                    desafinte.empatarLuta();
                    desafiado.empatarLuta();

                case 1:
                    System.out.println("ganhou");
                    desafinte.ganharLuta();
                    desafiado.ganharLuta();
                case 2:
                    System.out.println("erdeuuu");
                    desafinte.ganharLuta();
                    desafiado.perderLuta();

            }

        }
        else {
            System.out.println("luta não pode acontecer");
        }
    }


    //GETTERS E SETTER
    public Lutador getDesafinte() {
        return desafinte;
    }

    public void setDesafinte(Lutador desafinte) {
        this.desafinte = desafinte;
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }
}
