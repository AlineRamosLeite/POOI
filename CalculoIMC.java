public class CalculoIMC{
    
    double altura;
    double peso;    
    
    public double IMC(){
        double calculoIMC = peso / (altura*altura);
        
        if(calculoIMC < 18.5){
          System.out.println("Deficit de massa corporal "+ calculoIMC);        
        }
        
        else if(calculoIMC >= 18.5 && calculoIMC<=24.9){
          System.out.println("Massa corporal normal "+ calculoIMC);        
        }
        
        else if(calculoIMC >= 25 && calculoIMC<=29.9){
          System.out.println("Sobre Peso "+ calculoIMC);        
        }
        
        else if(calculoIMC >= 30 && calculoIMC<=34.9){
          System.out.println("Obesidade leve "+ calculoIMC);        
        }
        
        else if(calculoIMC >= 35 && calculoIMC<=39.9){
          System.out.println("Obesidade media "+ calculoIMC);        
        }
        
        else if(calculoIMC >= 40){
          System.out.println("Obesidade morbida "+ calculoIMC);        
        }
        
        return 0;
    }
}
