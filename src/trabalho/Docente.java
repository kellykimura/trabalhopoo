package trabalho;

public abstract class Docente extends Funcionario{
    
    protected String titulacao;
    
    @Override
    public abstract double calcularSalario();
    
    public String getTitulacao (){
        return titulacao;
    }
    
    public void setTitulacao (String titulacao){
        this.titulacao = titulacao;
    }
}
