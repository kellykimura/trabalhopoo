package trabalho.modelo;

import trabalho.modelo.Funcionario;

public class Tecnico extends Funcionario {
    
    protected String funcao;
    
    @Override
    public double calcularSalario(){
        
        if(nivel.equals("T1")){
            return (salario + (salario*0.1));
        }
        
        if(nivel.equals("T2")){
            return (salario + salario*0.2);
        }
        
        return 0;
    }
    
    public String getFuncao(){
        return funcao;
    }
    
    public void setFuncao (String funcao){
        this.funcao = funcao;
    }
    
}
