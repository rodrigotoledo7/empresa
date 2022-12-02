public class Diretor extends Empregado {
    private float salarioFixo;
    private float gratificacoes;
    public Diretor(String nome, String setor, float salarioFixo, float gratificacoes) {
        super(nome, setor);
        this.salarioFixo = salarioFixo;
        this.gratificacoes = gratificacoes;
    }
    public float getSalarioFixo() {
        return salarioFixo;
    }
    public void setSalarioFixo(float salarioFixo) {
        this.salarioFixo = salarioFixo;
    }
    public float getGratificacoes() {
        return gratificacoes;
    }
    public void setGratificacoes(float gratificacoes) {
        this.gratificacoes = gratificacoes;
    }
    public String toString(){
        return "Diretor"+super.toString()+"Salário Fixo =" + salarioFixo + 
        ", Gratificações =" + gratificacoes + " Pagamento="+ getPagamento()+
        ".";
    }
    @Override
    public double getPagamento() {
        return (salarioFixo+gratificacoes);
    }
    
}