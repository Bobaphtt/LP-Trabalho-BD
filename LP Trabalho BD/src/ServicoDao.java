


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class ServicoDao extends Dao{
    public void InsertServico(Servico serv) throws Exception {        
        try {
            conn = getConnection();
            ps = conn.prepareStatement("INSERT INTO TbServico (Descricao,Valor) VALUES (?,?)");
            ps.setString(1, serv.getDescricao());
            ps.setFloat(2, serv.getValor());
            ps.execute();
        } catch (SQLException ex) {
            throw new Exception(ex.getMessage(), ex);
        }          
    }
    
    public void AlterServico(int CdServico, Servico serv) throws Exception {
        try {
            conn = getConnection();
            ps = conn.prepareCall("UPDATE TbServico SET Descricao = ?, Valor = ? WHERE CdServico = ?");
            ps.setString(1, serv.getDescricao());
            ps.setFloat(2, serv.getValor());
            ps.setFloat(3, CdServico);
            rs = ps.executeQuery();
        } catch (Exception ex) {
            throw new Exception(ex.getMessage(), ex);
        }
    }    

    public List<Servico> SearchServicoByCode(int CdServico) throws Exception {
        List<Servico> servicoList = new ArrayList();        
        
        try {
            conn = getConnection();
            ps = conn.prepareCall("SELECT * FROM TbPet WHERE CdPet = ?");
            ps.setInt(1, CdServico);
            rs = ps.executeQuery();
            while (rs.next()) {
                servicoList.add(new Servico(rs.getInt("CdServico"), 
                        rs.getString("Descricao"),                         
                        rs.getFloat("Raca")));
            }
        } catch (Exception ex) {
            ex.getMessage();
        }
        return servicoList;
    }    
    
    public void excluir(int CdServico) throws SQLException {
        try {
            conn = getConnection();
            ps = conn.prepareStatement("DELETE FROM TbServico WHERE CdServico = ?");
            ps.setInt(1, CdServico);
            ps.execute();
        } catch (Exception ex) {
            ex.getMessage();
        }
    }
}
