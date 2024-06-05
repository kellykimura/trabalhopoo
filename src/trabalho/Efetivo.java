package trabalho;

public class Efetivo extends Docente{
    
    protected String area;
    
    @Override
    public double calcularSalario() {
        
        if (nivel.equals("D1")){
            return (salario + (salario*0.05));
        }
        
        if (nivel.equals("D2")){
            return (salario + (salario*0.1));
        }
        
         if (nivel.equals("D3")){
            return (salario + (salario*0.2));
        }
         
        return 0;
    }
    
    public String getArea(){
        return area;
    }
    
    public void setArea (String area){
        this.area = area;
    }
    
    
}
