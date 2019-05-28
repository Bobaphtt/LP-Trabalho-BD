


public class Servico {
    public Servico(int cd, String descricao, float valor){
        this.cd = cd;
        this.descricao = descricao;
        this.valor = valor;
    }
    
    private int cd;
    private String descricao;
    private float valor;

    public int getCd() {
        return cd;
    }

    public void setCd(int cd) {
        this.cd = cd;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
}
