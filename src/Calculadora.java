public class Calculadora {

    int num1;
    int num2;
    int resultado;

//Construtores///////////////////////////////////////////////////////

 public Calculadora(){

 }

public Calculadora (int num1, int num2, int resultado){

         this.num1 = num1;
        this.num2 = num2;
        this.resultado = resultado;

}

//Métodos///////////////////////////////////////////////////////

 public int somar() {

        this.resultado = this.num1 + this.num2;

        return this.resultado;
 }

 public int subtrair() {

        this.resultado = this.num1 - this.num2;

        return this.resultado;
    }

public int multiplicar() {

        this.resultado = this.num1 * this.num2;

        return this.resultado;
    }

public int dividir() {

        this.resultado = this.num1 / this.num2;

        return this.resultado;
    }


}
