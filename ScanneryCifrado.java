//Algoritmo de encriptación cifrado de cesar.

import java.util.Scanner;
public class ScanneryCifrado {

	public static void main(String[] args) {
		
		Scanner S= new Scanner (System.in);
		String frase1, frase2;
		int desplazamiento;
		
		frase2="";
		
		String minu = "abcdefghijklmnopqrstuvwxyz ";//B
		String may = "ABCDEFGHIJKLMNOPQRSTUVWXYZ ";
		
		System.out.print("Introduce una frase: ");// A
		frase1=S.nextLine();
		
		System.out.print("Introduce la clave de desplazamiento: ");
		desplazamiento= S.nextInt();
		
		for (int i=0; i < frase1.length();i++){// recorre A
		for(int j =0;j<minu.length();j++){// recorre B
			if (frase1.charAt(i)==minu.charAt(j)){
				if (j+desplazamiento>= minu.length()){
					frase2+=minu.charAt((j+ desplazamiento) % minu.length());// se va desplazar según el RESTO que de la division.
				}
				else{
					frase2+=minu.charAt(j+desplazamiento);
				}
				}
				else if (frase1.charAt(i)==may.charAt(j)){
					if (j+ desplazamiento >=may.length()){
						frase2+=may.charAt((j+ desplazamiento) %may.length());
						
					}
					else {
						frase2+= may.charAt(j+desplazamiento);
					}
				}
			}
		
		}
	
		System.out.println(frase1);
		System.out.println(frase2);
	}
}
