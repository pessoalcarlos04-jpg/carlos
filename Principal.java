import java.util.Scanner;
public class Principal {
    public static void main(String []agrs){
    Scanner cg = new Scanner(System.in);

     System.out.println("Bom dia monolos");


     System.out.println("digite nome ");
     String nome = cg.nextLine();

     
     System.out.println("digite idade ");
     int idade = cg.nextInt();

     Conexao co = new Conexao();
     co.insertpessoa(nome, idade);
    }
}