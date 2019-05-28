/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.PetMenus;

import Dao.PetDao;
import Entidades.Pet;
import View.IMenu;
import java.text.DateFormat;
import java.text.ParseException;

/**
 *
 * @author Luan
 */
public class PetInserir implements IMenu {

    @Override
    public void run() {
        Pet p = new Pet();
        System.out.println("Qual o nome do Pet? ");
        p.setNome(scs.nextLine());
        System.out.println("Qual a raça do Pet? ");
        p.setRaca(scs.nextLine());
        System.out.println("Qual o nome do dono do Pet? ");
        p.setDono(scs.nextLine());
        System.out.println("Qual a data de nascimento do Pet? ");
        DateFormat data = DateFormat.getInstance();
        try {
            p.setDtNasc(data.parse(scs.nextLine()));
        } catch (ParseException ex) {
            ex.getMessage();            
        }
        PetDao pd = new PetDao();
        try {
            pd.InsertPet(p);
        } catch (Exception ex) {
            ex.getMessage();
        }
    }
}
