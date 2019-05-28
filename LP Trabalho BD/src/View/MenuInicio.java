/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import View.PetMenus.PetMenu;

/**
 *
 * @author Luan
 */
public class MenuInicio implements IMenu {

    IMenu[] menus = new IMenu[]{new PetMenu(), new ServicoMenu()};
    String[] itens = new String[]{"Pet", "Serviços"};

    @Override
    public void run() {
        int op = -1;
        while (op != itens.length) {
            for (int i = 0; i < itens.length; i++) {
                System.out.println(i + ". " + itens[i]);
            }
            System.out.println(itens.length + ". Sair");
            System.out.println("--------------------------------");
            System.out.print("Escolha uma opção: ");
            op = sci.nextInt();
            System.out.println("");
            while (op < 0 || op > itens.length) {
                System.out.println("Opção Inválida. Tente novamente.");
                op = sci.nextInt();
            }
            if (op != itens.length) {
                menus[op].run();
            }
        }

    }
}

class Main {

    public static void main(String[] args) {
        IMenu teste = new MenuInicio();
        teste.run();
    }
}
