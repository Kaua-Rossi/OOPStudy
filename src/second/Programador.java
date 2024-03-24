package second;

public class Programador extends Pessoa {
    private String linguagemDeProgramacao;
    private String nivelHierarquico;
    private int anosDeExperiencia;

    public Programador(String _nome, int _idade, String _profissao, String _linguagemDeProgramacao, String _nivelHierarquico, int _anosDeExperiencia) {
        super(_nome, _idade, _profissao);
        this.linguagemDeProgramacao = _linguagemDeProgramacao;
        this.nivelHierarquico = _nivelHierarquico;
        this.anosDeExperiencia = _anosDeExperiencia;
    }

    public String getLinguagem() {
        return this.linguagemDeProgramacao;
    }

    public void setLinguagem(String _linguagemDeProgramacao) {
        this.linguagemDeProgramacao = _linguagemDeProgramacao;
    }

    public String getNivel() {
        return this.nivelHierarquico;
    }

    public void setNivel(String _nivelHierarquico) {
        this.nivelHierarquico = _nivelHierarquico;
    }

    public int getExperiencia() {
        return this.anosDeExperiencia;
    }

    public void setExperiencia(int _anosDeExperiencia) {
        this.anosDeExperiencia = _anosDeExperiencia;
    }

    public void apresentacao() {
        String anosSintaxe = (anosDeExperiencia > 1 ? "anos" : "ano");
        System.out.println("Olá meu nome é " + this.getNome() + " e eu tenho " + this.getIdade() + " anos!");
        System.out.println("Eu programo em " + this.linguagemDeProgramacao + ", tenho " + this.anosDeExperiencia + " " +
                            anosSintaxe + " de experiência e sou " + this.nivelHierarquico + "!\n");
    }
}