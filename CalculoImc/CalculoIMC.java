public class CalculoIMC{
    
    double altura;
    double peso;
    
    public double IMC(){
        double calculoIMC = peso / (altura*altura);
        return calculoIMC;
    }
}
