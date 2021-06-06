package NUMERO;

import java.util.Scanner;

public class NUmeroMultiplo {

	public static void main(String[] args) {
		//NUMERO MULTIPLO
		
		Scanner sc = new Scanner(System.in);
		
		int A =sc.nextInt();
		int B =sc.nextInt();
		
		if(A % B == 0 || B % A == 0 ) {
			System.out.println("ESSE NUMERO É MULTIPLO DELE");
		}
		else {
			System.out.println("NÃO ÉMULTIPLO");
		}
	}

}
