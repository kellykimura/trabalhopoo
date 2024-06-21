package trabalho.modelo;

public class Departamento {
    
    protected String codigo;
    protected String nome;
    
    public String getCodigo (){
        return codigo;
    }
    
    public String getNome () {
        return nome;
    }
    
    public void setCodigo (String codigo){
        this.codigo = codigo;
    }
    
    public void setNome (String nome) {
        this.nome = nome;
    }
}
