package Model;

public class login {
    private configuracao configuracao;

    public login(configuracao configuracao) {
        this.configuracao = configuracao;
    }

    public boolean validacaoSenha(String senha) {
        return senha != null && senha.equals(configuracao.getPassword);
    }

}
