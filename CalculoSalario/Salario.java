public class Salario{
        
             double horas;
             double salahora;
             int depen ;           
    
    public double salabruto(){        
       
       double sala=horas*salahora +(50 * depen);     
    
        return sala;
    }
    
    public double inss(){
               
        double sala = salabruto();
        if(sala<=1000){
            sala=  sala*8.5/100;
            
        }
        
        if(sala>1000){            
            sala=  sala*9/100;
            
        }  
        return sala;
    }
    
    public double ir(){
        
        double sala = salabruto();   
        
        if(sala<=500){
            
        sala=500;
        }
        
        if(sala>500 && sala<=1000){
            
        sala=sala*5/100;
        }
        
        if(sala>1000){
            
        sala=sala*7/100;
        }
        return sala;
    }
    
    public double liquido(){
        double salabruto=salabruto();
        double ir = ir();
        double inss = inss();
        
        double salaliquido = salabruto - inss - ir ;
        return salaliquido;
    }
    
}
