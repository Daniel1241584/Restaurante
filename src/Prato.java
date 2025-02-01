public class Prato {
    public String nomePrato;
    public double precoCusto;
    public double precoVenda;
    public int preparacaoTemp;
    public int tempConsumo;
    public boolean estado;

    public String getNomePrato() {
        return nomePrato;
    }

    public void setNomePrato(String nomePrato) {
        this.nomePrato = nomePrato;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public int getPreparacaoTemp() {
        return preparacaoTemp;
    }

    public void setPreparacaoTemp(int preparacaoTemp) {
        this.preparacaoTemp = preparacaoTemp;
    }

    public int getTempConsumo() {
        return tempConsumo;
    }

    public void setTempConsumo(int tempConsumo) {
        this.tempConsumo = tempConsumo;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Prato(String nomePrato, double precoCusto, double precoVenda, int preparacaoTemp, int tempConsumo, boolean estado) {
        this.nomePrato = nomePrato;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
        this.preparacaoTemp = preparacaoTemp;
        this.tempConsumo = tempConsumo;
        this.estado = estado;
    }
}
