package contador;

import java.util.Scanner;
public class ContadorFluxo {
    
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número do parametro: ");
        int parametroUm = scanner.nextInt();
        System.out.println("Digite o segundo numero: ");
        int parametroDois = scanner.nextInt();

      try {
        contar(parametroUm, parametroDois);
      } catch(ParametrosInvalidosException e) {
        System.out.println("O segundo parâmetro deve ser maior que o primeiro");
      }
      scanner.close();
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
      
      int contagem = parametroDois - parametroUm;
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }
        
      System.out.println("Contando de " + parametroUm + " até " + parametroDois + ":");
      for (int i = 0; i <= contagem; i++) {
          System.out.println("Imprimindo o número " + (parametroUm + i));
      }
  }
} 