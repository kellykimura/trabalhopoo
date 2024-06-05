package trabalho;

public abstract class Funcionario {
    
    protected String codigo;
    protected String nome;
    protected double salario;
    protected String nivel;
    
    public abstract double calcularSalario();
    
    public String getCodigo (){
        return codigo;
    }
    
    public String getNome () {
        return nome;
    }
    
    public double getSalario () {
        return salario;
    }
    
    public String getNivel () {
        return nivel;
    }
        
    public void setCodigo (String codigo){
        this.codigo = codigo;
    }
    
    public void setNome (String nome) {
        this.nome = nome;
    }
    
    public void setSalario (double salario){
        this.salario = salario;
    }
    
    public void setNivel (String nivel) {
        this.nivel = nivel;
    }
   
    
}
