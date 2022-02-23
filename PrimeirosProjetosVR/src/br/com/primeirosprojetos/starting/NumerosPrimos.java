package br.com.primeirosprojetos.starting;

import java.util.Scanner;

public class NumerosPrimos {

	public static void main(String[] args) {
		
		int numInicio, numFinal, num, i;
		boolean  numPrimo;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero inicialdo intervalo:");
			numInicio = sc.nextInt();
			
		System.out.println("Digite um numero final do intervalo:");
			numFinal = sc.nextInt();
		try {
			System.out.println("Os numeros primos são:");
			for(num = numInicio; num <= numFinal; num++) {
				
				numPrimo = true;
				
					numPrimo =true; if((num%2==0) && (num!=2)) {
					numPrimo = false;
				}else {
					
					for(i=3; i<= (num/2);i++ ) {
						if(num%i ==0) {
							numPrimo = false;
						}
					}if(numPrimo)
					System.out.println(num);
				}
			
			}
		}catch(Exception e){
			System.out.println("Erro: "+ e.getMessage());
		}
			}
		}
	
	


