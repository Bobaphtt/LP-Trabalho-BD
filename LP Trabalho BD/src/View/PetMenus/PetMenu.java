/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.PetMenus;

import View.IMenu;
import View.MenuInicio;

/**
 *
 * @author Luan
 */
public class PetMenu implements IMenu {

    IMenu[] menus = new IMenu[]{new PetInserir(), new PetConsultar(), new PetAlterar(), new PetExcluir()};
    String[] itens = new String[]{"Inserir", "Consultar", "Alterar", "Excluir"};

    @Override
    public void run() {
        for (int i = 0; i < itens.length; i++) {
            System.out.println(i + ". " + itens[i]);
        }
        System.out.println(itens.length + ". Sair");
        System.out.println("--------------------------------");
        System.out.print("Escolha uma opção: ");
        int op = sci.nextInt();
        System.out.println("");
        while (op < 0 || op > itens.length) {
            System.out.println("Opção Inválida. Tente novamente.");
            op = sci.nextInt();
        }
        if (op != itens.length) {
            menus[op].run();
        } else {
            new MenuInicio().run();
        }
    }
}
