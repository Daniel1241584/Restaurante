public class Reserva {
    public String nome;
    public int quantidade;
    public int tempChegada;

    public Reserva(String nome, int tempChegada, int quantidade) {
        this.nome = nome;
        this.tempChegada = tempChegada;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTempChegada() {
        return tempChegada;
    }

    public void setTempChegada(int tempChegada) {
        this.tempChegada = tempChegada;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
