import java.util.Scanner;
import java.util.Random;
public class Exercicio1{
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Random gerador = new Random();        
        Integer n;
        System.out.println("Caro usuário, quantos sorteios você deseja?");
        n = leitor.nextInt();
        //repetição controlada por contador
        
        for (Integer contador = 1; contador <= n; contador = contador + 1){
            //lançar o primeiro dado
            int d1 = gerador.nextInt(6) + 1;
            //int d1 = gerador.nextInt(7);
            int d2 = gerador.nextInt(6) + 1;
            //4 6: 4 < 6
            //1 1: 1 = 1
            //2 1: 2 > 1
            // if (d1 < d2)
            //     System.out.printf ("%d %c %d\n", d1, '<', d2);
            // else if (d1 == d2)
            //     System.out.printf("%d = %d\n", d1, d2);
            // else
            //     System.out.println (d1 + " > " + d2);
            //teste ? v1 : v2
            System.out.printf(
                "%d %c %d\n",
                d1,
                d1 < d2 ? '<' : d1 == d2 ? '=' : '>',
                d2
            ); 
        }
        Integer contador = 1;
        while(contador <= n){//condição de continuidade
            //lançar o primeiro dado
            int d1 = gerador.nextInt(6) + 1;
            //int d1 = gerador.nextInt(7);
            int d2 = gerador.nextInt(6) + 1;
            //4 6: 4 < 6
            //1 1: 1 = 1
            //2 1: 2 > 1
            // if (d1 < d2)
            //     System.out.printf ("%d %c %d\n", d1, '<', d2);
            // else if (d1 == d2)
            //     System.out.printf("%d = %d\n", d1, d2);
            // else
            //     System.out.println (d1 + " > " + d2);
            //teste ? v1 : v2
            System.out.printf(
                "%d %c %d\n",
                d1,
                d1 < d2 ? '<' : d1 == d2 ? '=' : '>',
                d2
            );
            
            contador = contador + 1; //esse é o incremento do contador
        }
        leitor.close();
    }
}
    //classes empacotadoras (wrapper)
    //int Integer
    //double Double
    //float Float
    //char Character
    //auto boxing e auto unboxing
    // Integer n;
    // Character c;
    // Double d;