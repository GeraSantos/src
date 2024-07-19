import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int ref1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        int ref2 = sc.nextInt();

        try {
            contar(ref1, ref2);

        } catch (ParametrosInvalidosException Exception ) {
            System.err.println("<<<< O segundo número deve ser maior que o primeiro >>>>");
            
        }

        sc.close();

    }
		
    static void contar(int ref1, int ref2 ) throws ParametrosInvalidosException {
        //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if(ref1 > ref2) throw new ParametrosInvalidosException();{
            int contagem = ref1 - ref2;
            System.out.println("O número é: " + contagem);
        //realizar o for para imprimir os números com base na variável contagem
        for(int i =1; i<= contagem; i++){
            System.out.println(" Imprimir o número:  " + i);
            
            }

        }

    }   
    

    
}

