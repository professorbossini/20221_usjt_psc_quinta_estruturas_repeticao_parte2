import java.util.Random;
import javax.swing.JOptionPane;

public class Exercicio2 {
    public static void main(String[] args) {
        int numeroOculto;
        int palpiteDoUsuario;
        int contador;
        Random gerador = new Random();

        //deixar o usuário escolher o nível de dificuldade

        //se ele quiser nível fácil, o programa mostra as dicas

        //se ele quiser nível difícil, o programa não mostra as dicas

        //1 sortear um valor inteiro entre 1 e 10
        numeroOculto = gerador.nextInt(10) + 1;
        //System.out.println(numeroOculto);
        //JOptionPane.showMessageDialog(null, numeroOculto);
        //2 fazer um loop (for ou while) que permite que o usuário tente adivinhar qual foi o número sorteado
        palpiteDoUsuario = Integer.parseInt(JOptionPane.showInputDialog("Qual o seu palpite"));
        contador = 1;

        while(palpiteDoUsuario != numeroOculto){
            if (palpiteDoUsuario > numeroOculto){
                JOptionPane.showMessageDialog(null, "Digite algo menor");    
            }
            else{
                JOptionPane.showMessageDialog(null, "Digite algo maior");
            }
            palpiteDoUsuario = Integer.parseInt(JOptionPane.showInputDialog("Escolha outro"));

            ++contador;
        }
        //3 quando o usuário adivinhar, o programa dá parabéns para ele e termina
        JOptionPane.showMessageDialog(null, "Parabéns, o número oculto era mesmo o " + numeroOculto + ". Você tentou " + contador + " vezes.");


        //Dica: operador para comparar por diferença é o !=
    }
}
