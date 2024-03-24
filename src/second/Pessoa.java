package second;

public class Pessoa {
    private String nome;
    private int idade;
    private String profissao;

    public Pessoa(String _nome, int _idade, String _profissao) {
        this.nome = _nome;
        this.idade = _idade;
        this.profissao = _profissao;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String _nome) {
        this.nome = _nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int _idade) {
        this.idade = _idade;
    }

    public String getProfissao() {
        return this.profissao;
    }

    public void apresentacao() {
        switch(profissao.toLowerCase()) {
            case "programador":
                System.out.println("Olá meu nome é " + this.nome + ", eu tenho " + this.idade + " anos e sou programador!\n");
            default:
                System.out.println("Olá meu nome é " + this.nome + " e eu tenho " + this.idade + " anos!\n");
        }
    }
}