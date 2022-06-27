import contas.ContaBanco;
import luta.Lutador;
import pacoteeee.Caneta;
import pacoteeee.Estante;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Lutador> lutadores = new ArrayList<>();
        boolean sair = false;
        while (true) {
            System.out.println("--------------MENU-----------");
            System.out.println("1-  cadastrar um novo lutador");
            System.out.println("2- deseja ver a lista de lutadores");
            System.out.println("3-Sair ");
            switch (in.nextInt()) {
                case 1:
                    Lutador l = new Lutador();
                    lutadores.add(l);
                    break;
                case 2:
                    System.out.println("** lutadores **");
                    for (int i = 0; i < lutadores.size(); i++) {
                        System.out.println("--- " + lutadores.get(i).getNome() + " ---");
                        System.out.println("Categoria: " + lutadores.get(i).getCategoria());
                        System.out.println("peso: " + lutadores.get(i).getPeso());
                    }
                    break;
                case 3:
                    sair = true;
                    break;

            }

        }


    }
}



