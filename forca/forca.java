package forca;
import java.lang.Math;
import java.util.Scanner;

public class forca{
   public static void main(String []args){
      String palavras[] = new   String[] { "cachorro", "gato", "macaco", "deodoro", "agostinho", "girafa", "galinha", "babuino", "veado", "bolsonaro" }; //adicione quantas palavras quiser aqui

      int id = (int) (Math.random() * palavras.length);
      String palavra = palavras[id];

      char forca[] = new char[palavra.length()];
      Scanner leitor = new Scanner(System.in);
      String letra;
      int acertos = 0;

      boolean vitoria = false;
      int vidas = 5;

      for (int i = 0; i < forca.length; i++)
         forca[i] = '_';

      System.out.println("A FORCA (XoX)");

      while (vidas > 0 && vitoria != true ){
         for (int i = 0; i < forca.length; i++)
            System.out.print(forca[i] + " "); //desenha a forca
         System.out.println("");
         System.out.print("VIDAS: "+ vidas + " Digite uma letra: > ");
         letra = leitor.next();

         boolean min = false; //min de acertos, confesso que essa solução foi bem porquinha;
         for (int i = 0; i < forca.length; i++){
            if (letra.charAt(0) == palavra.charAt(i) && letra.charAt(0) != forca[i]) {
               forca[i] = letra.charAt(0);
               acertos++;
               min = true;
            } else if(letra.charAt(0) == forca[i]){
               System.out.println("Você já escreveu esse caractere");
               break;
            }
            else if (i == forca.length - 1 && min == false) 
               vidas--;
         }
         if (acertos == palavra.length())
            vitoria = true;
      }
      if (vitoria == true){
         System.out.println("Você ganhou! :D");

      } else {
         System.out.println("Você perdeu ! :(");
      }
      System.out.println("A palavra é: "+ palavra);
   }
}
