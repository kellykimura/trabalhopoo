package trabalho;

public class Substituto extends Docente {
    
    protected int cargaHoraria;
    
    @Override
    public double calcularSalario(){
        
        if(nivel.equals("S1")){
            return (salario + (salario*0.05));
        }
        
        if(nivel.equals("S2")){
            return (salario + (salario*0.1));
        }
        
        return 0;
    }
    
    public int getCargaHoraria(){
        return cargaHoraria;
    }
    
    public void setCargaHoraria(int cargaHoraria){
        this.cargaHoraria = cargaHoraria;
    }
}
