package exercicios;
import java.util.Scanner;
public class Imagem {

	public static void main(String[] args) {

	     Scanner entrada = new Scanner(System.in);
	        int i, j, m[][] = new int [3][3];
	       
	        
	        System.out.println("Insira um numero da cor que você deseja para desenhar: ");
	        System.out.println("BRANCO, ZERO (0");
	        System.out.println("PRETO,  UM (1)");
	        System.out.println("VERMELHO, DOIS (2)");
	        System.out.println("BEGE, TRÊS (3)");
	        
	        System.out.printf("----------------------------------------------------------------");
	        
	        System.out.printf("\n");
	       
	        
	        for (i = 0; i < 3; i++){ //inciei um laço com até 3 repetições, porque a matriz tem 3 linhas e 3 colunas
	            System.out.printf("Informe os elementos %da. linha: \n", (i + 1));
	            for (j = 0; j < 3; j++){ // outro laço para andar sobre a matriz
	                System.out.printf("m[%d][%d] = ", i, j);
	                m[i][j] = entrada.nextInt();
	            }
	            System.out.printf("\n");
	        }
	        System.out.printf("\n");
	        
	        for (i = 0; i < 3; i++){
	        	
	            System.out.printf("%da. linha: ", (i + 1));
	            for (j = 0; j < 3; j++){ // laço para mostrar as 3 linhas
	            	
	                System.out.printf("%d ", m[i][j]);
	            }
	            System.out.printf("\n");
	            	
	            }
	        
	        
	        	
	        }
			}