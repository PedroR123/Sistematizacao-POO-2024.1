public class CartaoDeIdentificacao {
    private Empregado empregado;

    public CartaoDeIdentificacao(Empregado empregado) {
        this.empregado = empregado;
    }

    public void exibirCartao() {
        System.out.println(empregado.toString());
    }
}
