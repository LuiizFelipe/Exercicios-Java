/*
 * Solicitar a idade de várias pessoas e imprimir: 
 * Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)

 */






package lacoDeRepeticao;
import java.io.InputStream;
import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args){
	}
	private static void printf(String string) {
	}
	private static void scanf(String string, int idade) {
	}
	private static Scanner idade(InputStream in) {
		return null;
	}
{
		int idade = 0,contador21=0,contador50=0;
		System.out.println(" Digite sua Idade ");
		scanf("%d",idade);
		Scanner leia = idade (System.in);
		  while(idade!=-99)
		  {
			  if(idade<21) contador21++;
              if(idade>50) contador50++;
              printf("\n Digite a idade da pessoa (para Sair digite -99) : ");
             scanf("%d",idade);
            
              }
		  System.out.printf("\n O Total com menos de 21 anos E:%d",contador21);
		  System.out.printf("\n O Total com mais de 50 anos E:%d",contador50);
		  System.out.printf("\n\n");  
		  System.out.println("pause");
	        
	}

	
}
