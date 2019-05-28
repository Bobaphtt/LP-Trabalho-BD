

import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class PetDao extends Dao {
    public void InsertPet(Pet pet) throws Exception {        
        try {
            conn = getConnection();
            ps = conn.prepareStatement("INSERT INTO TbPet (Nome,Dono,Raca,DtNasc) values (?,?,?,?)");
            ps.setString(1, pet.getNome());
            ps.setString(2, pet.getDono());
            ps.setString(3, pet.getRaca());
            ps.setTimestamp(4, new Timestamp(pet.getDtNasc().getTime()));
            ps.execute();
        } catch (SQLException ex) {
            throw new Exception(ex.getMessage(), ex);
        }          
    }
    
    public void AlterPet(int CdPet, Pet pet) throws Exception {
        try {
            conn = getConnection();
            ps = conn.prepareCall("UPDATE Pet SET Nome = ?, Dono = ?, Raca = ?, DtNasc = ? WHERE CdTeste = ");
            ps.setString(1, pet.getNome());
            ps.setString(2, pet.getDono());
            ps.setString(3, pet.getRaca());
            ps.setTimestamp(4, new Timestamp(pet.getDtNasc().getTime()));
            rs = ps.executeQuery();
        } catch (Exception ex) {
            throw new Exception(ex.getMessage(), ex);
        }
    }    

    public List<Pet> SearchPetByCode(int CdPet) throws Exception {
        List<Pet> petList = new ArrayList();        
        
        try {
            conn = getConnection();
            ps = conn.prepareCall("SELECT * FROM TbPet WHERE CdPet = ?");
            ps.setInt(1, CdPet);
            rs = ps.executeQuery();
            while (rs.next()) {
                petList.add(new Pet(rs.getInt("CdPet"), rs.getString("Nome"), 
                        rs.getString("Dono"), 
                        rs.getString("Raca"), 
                        rs.getDate("DtNasc")));
            }
        } catch (Exception ex) {
            ex.getMessage();
        }
        return petList;
    }    
    
    public void excluir(int CdPet) throws SQLException {
        try {
            conn = getConnection();
            ps = conn.prepareStatement("DELETE FROM TbPet WHERE CdPet = ?");
            ps.setInt(1, CdPet);
            ps.execute();
        } catch (Exception ex) {
            ex.getMessage();
        }
    }
    
}