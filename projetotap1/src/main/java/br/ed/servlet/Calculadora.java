package br.ed.servlet;

public class Calculadora {

	public int calcular(int num1, int num2, int operacao) {
		// TODO Auto-generated method stub
		if(operacao == 1){
			return somar(num1, num2);
		}else if (operacao == 2){
			return subtrair(num1, num2);
		}else if (operacao == 3){
			return multiplicar(num1, num2);
		}else {
			return dividir(num1, num2);
		}
	}

	private int dividir(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 / num2;
	}

	private int multiplicar(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 * num2;
	}

	private int subtrair(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 - num2;
	}

	private int somar(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 = num2;
	}

}
