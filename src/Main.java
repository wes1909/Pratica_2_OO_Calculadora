public class Main {
    public static void main(String[] args) {

        Calculadora calc = new Calculadora(40,0);


        System.out.println("A soma é: " + calc.somar());
        System.out.println("A subtração é: " + calc.subtrair());
        System.out.println("A multiplicação é: " + calc.multiplicar());

        if (calc.resultado == 0) {
            System.out.println("Divisão por zero, altere o denominador (num2) ");
        } else {
            System.out.println("A divisão é: " + calc.dividir());

        }
    }
}