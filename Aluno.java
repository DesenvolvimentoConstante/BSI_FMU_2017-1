/*
 * Programa desenvolvido por Felippe Wohlers Leão
 * Para alterar esse cabeçalho, clique em "Ferramentas" | "Cabeçalhos da Licença"
 * e abra o modelo no editor.
 */
package usaaluno;

/**
 *
 * @author Leaum
 */
public class Aluno {

    private String nome;
    private double valorMensalidade;

    public Aluno() {
        //contrutora vazia
    }

    public void setValorMensalidade(double valorMensalidade) {
        this.valorMensalidade = valorMensalidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorMensalidade() {
        return (valorMensalidade);
    }

    public String getNome() {
        return (nome);
    }

    public void aumento(double porcentagem) {
        valorMensalidade += valorMensalidade * porcentagem / 100;
    }
}