/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.PetMenus;

import Dao.PetDao;
import Entidades.Pet;
import View.IMenu;
import java.util.List;

/**
 *
 * @author Luan
 */
public class PetConsultar implements IMenu {

    @Override
    public void run() {
        System.out.println("Qual o código do Pet? ");
        int c = sci.nextInt();
        PetDao pd = new PetDao();
        List<Pet> lista;
        try {
            lista = pd.SearchPetByCode(c);
        } catch (Exception ex) {
            ex.getMessage();
        }
        //for (Pet listal : lista) {        }
    }
}
