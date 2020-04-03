public class App{
    
    public static void main(String[] args){
        
        Salario x = new Salario();
        
            x.horas=50;
            x.salahora=30;
            x.depen=2;                  
        
        System.out.println("Salario Liquido de: " + x.liquido());    
            
    
    }

}
