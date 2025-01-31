package Model;

import java.util.Scanner;

public class configuracao {
    public String getPassword;
    Scanner ler = new Scanner(System.in);

    private String caminhoFicheiro;
    private String separador;
    private int unidadeTempoDia;
    private int tempoEspera;
    private double custoClienteNaoAtendido;
    private String password;
    private String passwordMemoria;

    public configuracao(Scanner ler, String caminhoFicheiro, String separador, int unidadeTempoDia, int tempoEspera, String password, double custoClienteNaoAtendido) {
        this.ler = ler;
        this.caminhoFicheiro = caminhoFicheiro;
        this.separador = separador;
        this.unidadeTempoDia = unidadeTempoDia;
        this.tempoEspera = tempoEspera;
        this.password = password;
        this.custoClienteNaoAtendido = custoClienteNaoAtendido;
        this.passwordMemoria = password;
    }

    public Scanner getLer() {
        return ler;
    }

    public void setLer(Scanner ler) {
        this.ler = ler;
    }

    public String getCaminhoFicheiro() {
        return caminhoFicheiro;
    }

    public void setCaminhoFicheiro(String caminhoFicheiro) {
        this.caminhoFicheiro = caminhoFicheiro;
    }

    public int getUnidadeTempoDia() {
        return unidadeTempoDia;
    }

    public void setUnidadeTempoDia(int unidadeTempoDia) {
        this.unidadeTempoDia = unidadeTempoDia;
    }

    public String getSeparador() {
        return separador;
    }

    public void setSeparador(String separador) {
        this.separador = separador;
    }

    public int getTempoEspera() {
        return tempoEspera;
    }

    public void setTempoEspera(int tempoEspera) {
        this.tempoEspera = tempoEspera;
    }

    public double getCustoClienteNaoAtendido() {
        return custoClienteNaoAtendido;
    }

    public void setCustoClienteNaoAtendido(double custoClienteNaoAtendido) {
        this.custoClienteNaoAtendido = custoClienteNaoAtendido;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordMemoria() {
        return passwordMemoria;
    }

    public void setPasswordMemoria(String passwordMemoria) {
        this.passwordMemoria = passwordMemoria;
    }
}
