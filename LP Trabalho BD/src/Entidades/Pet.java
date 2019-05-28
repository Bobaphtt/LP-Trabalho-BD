package Entidades;




import java.util.Date;

public class Pet {
    
    public Pet(int cd, String nome, String dono, String raca, Date dtNasc){
        this. cd = cd;
        this.nome = nome;
        this.dono = dono;
        this.raca = raca;
        this.dtNasc = dtNasc;
    }
    
    private int cd;
    private String nome;
    private String dono;
    private String raca;
    private Date dtNasc;

    public int getCd() {
        return cd;
    }

    public void setCd(int cod) {
        this.cd = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public Date getDtNasc() {
        return dtNasc;
    }

    public void setDtNasc(Date dtNasc) {
        this.dtNasc = dtNasc;
    }
    
}
