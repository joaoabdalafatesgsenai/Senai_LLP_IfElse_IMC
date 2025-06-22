import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Digite sua altura (em metros, ex: 1.75): ");
        double altura = input.nextDouble();

        
        System.out.print("Digite seu peso (em kg): ");
        double peso = input.nextDouble();

        
        double imc = peso / (altura * altura);

        
        String interpretacao;
        if (imc < 18.5) {
            interpretacao = "Abaixo do peso";
        } else if (imc < 25) {
            interpretacao = "Peso normal";
        } else if (imc < 30) {
            interpretacao = "Sobrepeso";
        } else {
            interpretacao = "Obesidade";
        }

        
        System.out.printf("Seu IMC é: %.2f\n", imc);
        System.out.println("Interpretação: " + interpretacao);

        input.close();
    }
}