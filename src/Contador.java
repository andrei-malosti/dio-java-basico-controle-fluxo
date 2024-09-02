import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro parâmetro ");
        int numeroUm = sc.nextInt();
        System.out.print("Digite o segundo parâmetro ");
        int numeroDois = sc.nextInt();

        try {
            contar(numeroUm,numeroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println("Seu segundo parâmetro deve ser maior que o primeiro!.");
        }


        sc.close();
    }
    static void contar(int numeroUm, int numeroDois) throws ParametrosInvalidosException{
        if (numeroUm > numeroDois){
            throw new ParametrosInvalidosException();

        }
        else {
            int contagem = numeroDois - numeroUm;
            for(int i = 1; i<=contagem; i++){
                System.out.println("Imprimindo ocorrência número: " + i);
            }
        }
    }
}